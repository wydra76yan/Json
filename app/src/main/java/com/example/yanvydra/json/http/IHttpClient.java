package com.example.yanvydra.json.http;

import java.io.InputStream;

/**
 * Created by YanVydra on 15.10.2017.
 */

public interface IHttpClient {
    InputStream request(String url);
}
