package com.example.yanvydra.json.json;

import org.json.JSONObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by YanVydra on 15.10.2017.
 */

public class ObjectJson implements IObject {

    private static final String mId="id";
    private static final String mName="name";
    private static final String mRegistered = "registered";

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

    @Override
    public String getRegistered() throws ParseException {
        final long dateLong = mJSONObject.optLong(mRegistered);
        final Date date = new Date(dateLong);
        final DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy, hh:mm:ss", Locale.ENGLISH);
        return dateFormat.format(date);
    }
}
