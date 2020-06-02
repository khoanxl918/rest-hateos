package com.example.resthateos.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.RepresentationModel;

public class Greeting extends RepresentationModel<Greeting> {
    private final String content;

//    @JsonCreator
//    pubic Greeting(@JsonProperty("content") String content) {
    //what's the difference between above two lines and below one?
    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
