package com.raczkowski.springintro.structural.proxy;

public class HerokuHttpClient implements HttpClient {
    @Override
    public Response request(Request request) {
        return request.getResponse();
    }
}
