package com.example.test;

import com.example.entity.User;
import com.example.entity.Video;
import com.example.mapper.UserMapper;
import com.example.mapper.VideoMapper;
import com.example.utils.DynamicDataSourceHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author allen
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"})
public class VideoTest {

    @Autowired
    private VideoMapper videoMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01() {
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

        Set<String> name = new HashSet<>();
        for (User u : users) {
            for (Video v : videos) {
                if (u.getUserId().equals(v.getUserId())) {
                    name.add(u.getUserName());
                }
            }
        }

        System.out.println(name.toString());

    }

}
