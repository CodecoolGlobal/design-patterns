package com.raczkowski.springintro.structural.proxy;

public class GithubHttpClient implements HttpClient {
    @Override
    public Response request(Request request) {
        return request.getResponse();
    }
}
