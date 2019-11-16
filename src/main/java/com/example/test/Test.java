package com.example.test;

import com.example.entity.User;
import com.example.entity.Video;
import com.example.mapper.VideoMapper;
import com.example.service.impl.SwitchToTest;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author allen
 */
public class Test {

    @Autowired
    private static VideoMapper videoMapper;


    public static void main(String[] args) {
        new SwitchToTest().testDBKey();
    }

    private static void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        List<Video> videos = videoMapper.selectAll();
        System.out.println(videos.toString());
    }


    private static void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionTemplate template = (SqlSessionTemplate) context.getBean("sqlSessionTemplate");

        List<User> userList = template.selectList("com.example.mapper.UserMapper.selectAll",new User());

        SqlSessionTemplate remoteTemplate = (SqlSessionTemplate) context.getBean("remoteSqlSessionTemplate");
        List<Video> videoList = remoteTemplate.selectList("com.example.mapper.VideoMapper.selectAll", new Video());
        Set<String> name = new HashSet<>();
        for (User user : userList) {

            for (Video video : videoList) {

                if (user.getUserId().equals(video.getUserId())) {
                    name.add(user.getUserName());
                }

            }

        }
        System.out.println(name);
    }

}
