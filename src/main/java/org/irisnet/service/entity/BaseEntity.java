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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}


