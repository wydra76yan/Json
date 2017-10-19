package com.example.yanvydra.json.json;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Date;

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
        final JsonDeserializer<Date> date = new JsonDeserializer<Date>() {
            @Override
            public Date deserialize(JsonElement jsonElement,
                                    Type type, JsonDeserializationContext context)
                    throws JsonParseException {
                return jsonElement == null ? null : new Date(jsonElement.getAsLong());
            }
        };
        final Reader reader = new InputStreamReader(mInputStream);
        return new Gson().fromJson(reader,ObjectGson.class);
    }
}
