package com.AlbertAbuav.demo3.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("prototype")
public class Chip {
    private String id = UUID.randomUUID().toString();

    public Chip() {
    }

    public Chip(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Chip{" +
                "id='" + id + '\'' +
                '}';
    }

}
