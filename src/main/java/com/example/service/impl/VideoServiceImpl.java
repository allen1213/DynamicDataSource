package com.example.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.entity.Video;
import com.example.mapper.VideoMapper;
import com.example.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 视频表 服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2019-08-30
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements IVideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> selectAll() {
        return videoMapper.selectAll();
    }
}
