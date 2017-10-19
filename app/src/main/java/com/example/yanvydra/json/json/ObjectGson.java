package com.example.yanvydra.json.json;

import com.google.gson.annotations.SerializedName;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


/**
 * Created by YanVydra on 15.10.2017.
 */

public class ObjectGson implements IObject {

    @SerializedName("id")
    private String mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("registered")
    private Date mRegistered;

    @Override
    public String getId() {
        return mId;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public String getRegistered() throws ParseException {
        final DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy, hh:mm:ss", Locale.ENGLISH);
        return dateFormat.format(mRegistered);
    }


}
