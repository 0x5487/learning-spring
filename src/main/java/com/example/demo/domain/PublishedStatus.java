package com.example.demo.domain;

public enum PublishedStatus {
    DRAFT(0), PUBLISHED(1);

    private int status;

    private PublishedStatus(int status) {
        this.status = status;
    }

    public int status() {
        return status;
    }

}
