package com.example.demo.domain;

import java.time.*;

import lombok.*;

@Data
@Builder
public class Event {

    private long id;
    private String title;
    private String description;
    // @Builder.Default
    // private PublishedStatus publishedStatus = PublishedStatus.DRAFT;
    private int PublishedStatus;
    private long version;
    private Instant createdAt;
    private Instant updatedAt;

}
