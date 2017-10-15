package com.example.yanvydra.json.json;

import com.example.yanvydra.json.util.IOUtil;

import org.json.JSONObject;

import java.io.InputStream;

/**
 * Created by YanVydra on 15.10.2017.
 */

public class ObjectJsonParser implements IObjectParser {

    private final InputStream mInputStream;

    public ObjectJsonParser(final InputStream pInputStream){
        mInputStream=pInputStream;
    }

    @Override
    public IObject parse() throws Exception {
        final JSONObject jsonObject = new JSONObject(IOUtil.toString(mInputStream));
        return new ObjectJson(jsonObject);
    }
}
