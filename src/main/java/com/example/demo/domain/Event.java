package com.example.demo.domain;

import java.time.*;

public class Event {
    private long id;
    private String title;
    private String description;
    private PublishedStatus publishedStatus = PublishedStatus.Draft;
    private long version;
    private Instant createdAt;
    private Instant updatedAt;

    public long getId() {
        return id;
    }

    public PublishedStatus getPublishedStatus() {
        return publishedStatus;
    }

    public void setPublishedStatus(PublishedStatus publishedStatus) {
        this.publishedStatus = publishedStatus;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(long id) {
        this.id = id;
    }

}
