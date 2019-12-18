package com.example.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.entity.Price;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface PriceMapper extends BaseMapper<Price> {


    Long batchInsert(List<Price> list);

    BigDecimal getAmount(@Param("tabName") String tabName, @Param("videoId") Long videoId,@Param("userId")  Long userId);


}
