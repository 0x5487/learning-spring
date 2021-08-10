package com.example.demo.repository;

import java.util.List;

import com.example.demo.domain.Event;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Select;

@Mapper

public interface EventRepository {

    @Select("select * from events")
    @Results({ @Result(column = "published_status", property = "publishedStatus"),
            @Result(column = "created_at", property = "createdAt"),
            @Result(column = "updated_at", property = "updatedAt") })
    List<Event> listEvents();

}
