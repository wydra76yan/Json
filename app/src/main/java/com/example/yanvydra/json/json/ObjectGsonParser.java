package com.example.yanvydra.json.json;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by YanVydra on 15.10.2017.
 */

public class ObjectGsonParser implements IObjectParser {

    private final InputStream mInputStream;

    public ObjectGsonParser(InputStream pInputStream){
        this.mInputStream = pInputStream;
    }

    @Override
    public IObject parse() throws Exception {
        final Reader reader = new InputStreamReader(mInputStream);
        return new Gson().fromJson(reader,ObjectGson.class);
    }
}
