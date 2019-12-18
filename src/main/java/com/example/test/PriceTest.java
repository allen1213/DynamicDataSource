package com.example.test;

import com.example.entity.Price;
import com.example.mapper.PriceMapper;
import com.example.utils.DynamicDataSourceHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PriceTest {

    @Autowired
    private PriceMapper priceMapper;

    @Test
    public void testInset() {

        List<Price> list = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 50000; i ++) {
            Price p = new Price();
            p.setVideoId((long)r.nextInt(25) + 1)
                .setItemPrice(BigDecimal.valueOf(r.nextInt(10) * 10))
                .setSellAmount((long) r.nextInt(10) * 10);
            list.add(p);
        }

        try {
            DynamicDataSourceHolder.setDataSource("dataSource");
            priceMapper.batchInsert(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
