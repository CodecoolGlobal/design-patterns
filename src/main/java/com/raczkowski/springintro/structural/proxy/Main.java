package com.raczkowski.springintro.structural.proxy;

public class Main {

    public static void main(String[] args) {
        HttpClient githubHttpClient = new HttpClientProxy(new GithubHttpClient());
        HttpClient herokuHttpClient = new HttpClientProxy(new HerokuHttpClient());

        Request repositories = new Request("/github/repositories", new Response("200 OK"));
        Request dyno = new Request("/heroku/api/dynos/23424", new Response("404 Not Found"));

        githubHttpClient.request(repositories);
        herokuHttpClient.request(dyno);
        githubHttpClient.request(repositories);
        herokuHttpClient.request(dyno);
        githubHttpClient.request(repositories);
        herokuHttpClient.request(dyno);

    }
}
