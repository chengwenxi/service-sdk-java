package org.irisnet.service.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseEntity<T> {
    @JsonProperty("type")
    String type;
    @JsonProperty("value")
    T value;

    public BaseEntity(String type, T value) {
        this.type = type;
        this.value = value;
    }

    public BaseEntity(){

    }
}


