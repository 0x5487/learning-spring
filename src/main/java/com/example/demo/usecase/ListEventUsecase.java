package com.example.demo.usecase;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import com.example.demo.domain.*;
import com.example.demo.repository.EventRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ListEventUsecase {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private EventRepository eventRepo;

    public List<Event> listEvents() {
        // List<Event> events = new ArrayList<>();

        // var utcNow = Instant.now();
        // Event evt = Event.builder().id(1).title("Golang Taipei
        // online").description("description").createdAt(utcNow)
        // .updatedAt(utcNow).build();

        // events.add(evt);

        // return events;

        logger.info("service: list event");

        return eventRepo.listEvents();
    }

}
