package com.example.test;

import com.example.entity.User;
import com.example.entity.Video;
import com.example.mapper.PriceMapper;
import com.example.mapper.UserMapper;
import com.example.mapper.VideoMapper;
import com.example.utils.DynamicDataSourceHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SummeryTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private VideoMapper videoMapper;

    @Autowired
    private PriceMapper priceMapper;

    @Test
    public void testSummery() {

        long start = System.currentTimeMillis();
        List<Video> videos = videoMapper.selectAll();

        List<User> users = null;
        try {
            DynamicDataSourceHolder.setDataSource("dataSource");
            users = userMapper.selectAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DynamicDataSourceHolder.setDataSource("remoteDataSource");
        }

        for (User u : users) {

            for (Video v : videos) {

                if (u.getUserId().equals(v.getUserId())) {
                    System.out.println(v.getVideoId());
                }

            }

        }

        BigDecimal price01 = BigDecimal.ZERO;
        BigDecimal price02 = BigDecimal.ZERO;
        BigDecimal price03 = BigDecimal.ZERO;
        for (Video v : videos) {
            price01 = price01.add(priceMapper.getAmount("price01", null, v.getUserId()));
            price02 = price02.add(priceMapper.getAmount("price02", null, v.getUserId()));
            price03 = price03.add(priceMapper.getAmount("price03", null, v.getUserId()));
        }

        System.out.println("price01: " + price01 +"  price02: " + price02 + "  price03:" + price03);
        System.out.println(System.currentTimeMillis() - start);
    }

}
