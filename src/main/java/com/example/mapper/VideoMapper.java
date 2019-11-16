package com.example.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.entity.Video;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
  * 视频表 Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2019-08-30
 */
@Mapper
public interface VideoMapper extends BaseMapper<Video> {

    List<Video> selectAll();

}