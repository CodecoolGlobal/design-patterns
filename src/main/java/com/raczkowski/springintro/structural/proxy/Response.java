package com.raczkowski.springintro.structural.proxy;

public class Response {

    private String body;

    public Response(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "response: " + body;
    }
}
