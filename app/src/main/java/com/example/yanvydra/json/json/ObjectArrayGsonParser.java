package com.example.yanvydra.json.json;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

/**
 * Created by YanVydra on 15.10.2017.
 */

public class ObjectArrayGsonParser implements IObjectArrayParser{

    private InputStream mInputStream;

    public ObjectArrayGsonParser(final InputStream pInputStream) {
        mInputStream = pInputStream;
    }

    @Override
    public IObjectArray parse() throws Exception {
        final Reader reader = new InputStreamReader(mInputStream);
        final ObjectGson[] result = new Gson().fromJson(reader, ObjectGson[].class);
        return new ObjectArrayGson(Arrays.asList(result));
    }
}
