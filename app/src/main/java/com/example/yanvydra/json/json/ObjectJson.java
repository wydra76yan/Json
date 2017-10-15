package com.example.yanvydra.json.json;

import org.json.JSONObject;

/**
 * Created by YanVydra on 15.10.2017.
 */

public class ObjectJson implements IObject {

    private static final String mId="id";
    private static final String mName="name";

    private final JSONObject mJSONObject;

    public ObjectJson(final JSONObject pJSONObject){
        mJSONObject =pJSONObject;
    }

    @Override
    public String getId() {
        return mJSONObject.optString(mId);
    }

    @Override
    public String getName() {
        return mJSONObject.optString(mName);
    }
}
