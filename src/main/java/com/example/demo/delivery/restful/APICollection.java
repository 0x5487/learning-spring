package com.example.demo.delivery.restful;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class APICollection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> metadata;

    @JsonProperty("data")
    public Object data;

    public APICollection() {
        this.metadata = new HashMap<>();
    }
}
