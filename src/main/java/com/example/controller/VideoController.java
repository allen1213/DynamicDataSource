package com.example.controller;

import com.example.entity.User;
import com.example.entity.Video;
import com.example.service.IUserService;
import com.example.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 视频表 前端控制器
 * </p>
 *
 * @author ${author}
 * @since 2019-08-30
 */
@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    private IVideoService videoService;

    @Autowired
    private IUserService userService;

    @RequestMapping("/query")
    public List<Video> selectAll() {
        return videoService.selectAll();
    }

    @RequestMapping("/name")
    public List<String> selectName() {
        Set<String> name = new HashSet<>();

        List<User> users = userService.selectAll();
        List<Video> videos = videoService.selectAll();

        for (User u : users) {
            for (Video v : videos) {
                if (u.getUserId().equals(v.getUserId())) {
                    name.add(u.getUserName());
                }
            }
        }

        return new ArrayList<>(name);
    }
	
}
