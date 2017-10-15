package com.example.yanvydra.json.json;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YanVydra on 15.10.2017.
 */

public class ObjectArrayJson implements IObjectArray {

    private List<ObjectJson> mObjectArray;

    public ObjectArrayJson(final List<ObjectJson> pObjectArray){
        mObjectArray=pObjectArray;
    }
    @Override
    public List<IObject> getObjectArray() {
        final List<IObject> objectArray = new ArrayList<>();
        for (final ObjectJson object: mObjectArray){
            mObjectArray.add(object);
        }
        return objectArray;
    }
}
