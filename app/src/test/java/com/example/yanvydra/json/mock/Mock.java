package com.example.yanvydra.json.mock;

import junit.framework.Assert;


import java.io.InputStream;

/**
 * Created by YanVydra on 15.10.2017.
 */
public class Mock {

    public static InputStream stream(final String pName) {
        final InputStream resourceAsStream = Mock.class.getClassLoader().getResourceAsStream(pName);
        Assert.assertNotNull("resource not found", resourceAsStream);
        return resourceAsStream;
    }
}