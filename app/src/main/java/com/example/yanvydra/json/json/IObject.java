package com.example.yanvydra.json.json;

import java.text.ParseException;

/**
 * Created by YanVydra on 15.10.2017.
 */

public interface IObject {

    String getId();

    String getName();

    String getRegistered() throws ParseException;
}
