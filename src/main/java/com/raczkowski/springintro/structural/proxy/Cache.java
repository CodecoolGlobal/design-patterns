package com.raczkowski.springintro.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    public Map<String, Response> cachedResponses;

    public Cache() {
        this.cachedResponses = new HashMap<>();
    }

    public void cache(String url, Response response) {
        this.cachedResponses.put(url, response);
    }

    public boolean cached(String url) {
        return cachedResponses.containsKey(url);
    }

    public Response retrieve(String url) {
        return cachedResponses.get(url);
    }
}
