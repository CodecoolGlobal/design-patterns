package com.raczkowski.springintro.structural.proxy;

public class Request {

    private String url;
    private Response response;

    public Request(String url, Response response) {
        this.url = url;
        this.response = response;
    }

    public Response getResponse() {
        return response;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "request to url: " + url;
    }
}
