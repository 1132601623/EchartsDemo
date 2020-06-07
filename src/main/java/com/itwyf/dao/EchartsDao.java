package com.itwyf.dao;

import com.itwyf.entity.Echarts;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EchartsDao {
    @Select("select * from sell")
    List<Echarts> findAll();
}
