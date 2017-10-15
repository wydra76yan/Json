package com.example.yanvydra.json.json;

import com.google.gson.annotations.SerializedName;


/**
 * Created by YanVydra on 15.10.2017.
 */

public class ObjectGson implements IObject {

    @SerializedName("id")
    private String mId;
    @SerializedName("name")
    private String mName;

    @Override
    public String getId() {
        return mId;
    }

    @Override
    public String getName() {
        return mName;
    }


}
