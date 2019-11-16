package com.example.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
  * 用户表 Mapper 接口
 * </p>
 *
 * @author ${author}
 * @since 2019-08-30
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    //List<User> dynamicQL(@Param("select") String select, @Param("from") String from, @Param("where") String where);

    List<User> selectAll();

}