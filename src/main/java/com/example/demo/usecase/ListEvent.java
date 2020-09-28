package com.example.demo.usecase;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.Event;
import com.example.demo.domain.ListEventUsecase;

public class ListEvent implements ListEventUsecase {

    @Override
    public List<Event> ListEvents() {
        List<Event> events = new ArrayList<Event>();

        events.add(new Event() {
            {
                setId(1);
                setTitle("Golang Taipei online");
                setDescription("description");
                setCreatedAt(Instant.now());
                setUpdatedAt(Instant.now());
            }
        });

        return events;
    }

}
