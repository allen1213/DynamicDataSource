package com.example.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.entity.Video;

import java.util.List;

/**
 * <p>
 * 视频表 服务类
 * </p>
 *
 * @author ${author}
 * @since 2019-08-30
 */
public interface IVideoService extends IService<Video> {

    List<Video> selectAll();
	
}
