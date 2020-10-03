package com.example.demo.usecase;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.*;

public class ListEvent implements EventUsecase {

    @Override
    public List<Event> listEvents() {
        List<Event> events = new ArrayList<>();

        Event evt = new Event();
        evt.setId(1);
        evt.setTitle("Golang Taipei online");
        evt.setDescription("description");
        evt.setCreatedAt(Instant.now());
        evt.setUpdatedAt(Instant.now());
        events.add(evt);

        return events;
    }

}
