package com.example.yanvydra.json.json;

import com.example.yanvydra.json.util.IOUtil;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YanVydra on 15.10.2017.
 */

public class ObjectArrayJsonParser implements IObjectArrayParser{

    private final InputStream mInputStream;

    public ObjectArrayJsonParser (final InputStream pInputStream) {
        mInputStream = pInputStream;
    }

    @Override
    public IObjectArray parse() throws Exception {
        final JSONArray jsonArray = new JSONArray(IOUtil.toString(mInputStream));
        final List<ObjectJson> objectJsonArray = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            final JSONObject jsonObject = jsonArray.getJSONObject(i);
            objectJsonArray.add(new ObjectJson (jsonObject));
        }
        return new ObjectArrayJson(objectJsonArray);
    }
}
