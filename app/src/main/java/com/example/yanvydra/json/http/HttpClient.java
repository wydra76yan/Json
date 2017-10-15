package com.example.yanvydra.json.http;

import java.io.InputStream;

/**
 * Created by YanVydra on 15.10.2017.
 */

public class HttpClient implements IHttpClient {
    @Override
    public InputStream request(String url) {
        throw new IllegalStateException("Implement http");
    }
}
