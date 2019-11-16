package com.example.controller;

import com.example.entity.Video;
import com.example.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping("/query")
    public List<Video> selectAll() {
        return videoService.selectAll();
    }
	
}
