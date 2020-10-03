package com.example.demo.usecase;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.*;

public class ListEventUsecase {

    public List<Event> listEvents() {
        List<Event> events = new ArrayList<>();

        var utcNow = Instant.now();
        Event evt = Event.builder().id(1).title("Golang Taipei online").description("description").createdAt(utcNow)
                .updatedAt(utcNow).build();

        events.add(evt);

        return events;
    }

}
