package com.example.yanvydra.json.json;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YanVydra on 15.10.2017.
 */

public class ObjectArrayGson implements IObjectArray{

    private List<ObjectGson> mObjectGson;

    public ObjectArrayGson(final List<ObjectGson> pObjectGson) {
        mObjectGson = pObjectGson;
    }

    @Override
    public List<IObject> getObjectArray() {
        final List<IObject> objects = new ArrayList<>();
        for (final ObjectGson object : mObjectGson) {
            objects.add(object);
        }
        return objects;
    }
}
