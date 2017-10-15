package com.example.yanvydra.json.json;

import java.io.InputStream;

/**
 * Created by YanVydra on 15.10.2017.
 */

public class ObjectArrayParserFactory {

    public IObjectArrayParser arrayParserJSON(final InputStream pInputStream) {
        return new ObjectArrayJsonParser(pInputStream);
    }

    public IObjectArrayParser arrrayParserGSON(final InputStream pInputStream) {
        return new ObjectArrayGsonParser(pInputStream);
    }
}
