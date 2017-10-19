package com.example.yanvydra.json.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by YanVydra on 15.10.2017.
 */

public class ObjectArrayGsonParser implements IObjectArrayParser {

    private InputStream mInputStream;

    public ObjectArrayGsonParser(final InputStream pInputStream) {
        mInputStream = pInputStream;
    }

    @Override
    public IObjectArray parse() throws ParseException {
                final JsonDeserializer<Date> deserializer = new JsonDeserializer<Date>() {
                @Override
                public Date deserialize(final JsonElement json, final Type typeOfT,
                                        final JsonDeserializationContext context) throws JsonParseException {
                    return json == null ? null : new Date(json.getAsLong());
                }
            };

            final Gson gson = new GsonBuilder()
                    .registerTypeAdapter(Date.class, deserializer).create();

            final Reader reader = new InputStreamReader(mInputStream);
            final ObjectGson[] result = new Gson().fromJson(reader, ObjectGson[].class);
            return new ObjectArrayGson(Arrays.asList(result));
        }
    }

