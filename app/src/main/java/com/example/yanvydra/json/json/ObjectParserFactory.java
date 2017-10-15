package com.example.yanvydra.json.json;

import java.io.InputStream;



public class ObjectParserFactory {
    public IObjectParser parserJson(final InputStream pInputStream){
        return new ObjectJsonParser(pInputStream);
    }
    public IObjectParser parserGson(final InputStream pInputStream){
        return new ObjectGsonParser (pInputStream);
    }
}
