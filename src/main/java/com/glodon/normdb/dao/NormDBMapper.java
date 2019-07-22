package com.glodon.normdb.dao;

import com.glodon.normdb.entity.NormDB;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// @Mapper 这里可以使用@Mapper注解，但是每个mapper都加注解比较麻烦，所以统一配置@MapperScan在扫描路径在application类中
public interface NormDBMapper {
    @Select("select * from normdb")
    List<NormDB> getNormDBList();
}
