package com.example.demo.domain;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EventRepository {

    @Select("select * from events")
    List<Event> findAll();

}
