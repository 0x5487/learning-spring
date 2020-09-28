package com.example.demo.domain;

public enum PublishedStatus {
    Draft(0), Published(1);

    private int status;

    private PublishedStatus(int status) {
        this.status = status;
    }

    public int Status() {
        return status;
    }

}
