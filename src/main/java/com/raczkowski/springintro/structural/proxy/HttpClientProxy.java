package com.raczkowski.springintro.structural.proxy;


import java.util.logging.Logger;

public class HttpClientProxy implements HttpClient {

    private final Logger logger = Logger.getLogger(HttpClientProxy.class.getName());

    private final HttpClient httpClient;

    private final Cache cache;

    public HttpClientProxy(HttpClient httpClient) {
        this.httpClient = httpClient;
        this.cache = new Cache();
    }

    @Override
    public Response request(Request request) {
        logger.info("Performing " + request);

        Response response;
        String url = request.getUrl();

        if (cache.cached(url)) {
            response = cache.retrieve(url);
            logger.info("Retrieved from cache: " + response);
        } else {
            response = httpClient.request(request);
            cache.cache(url, response);
            logger.info("Cached " + response);
        }

        logger.info("Received " + response);
        return response;
    }

}
