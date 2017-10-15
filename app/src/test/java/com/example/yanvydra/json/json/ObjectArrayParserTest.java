package com.example.yanvydra.json.json;

import com.example.yanvydra.json.BuildConfig;
import com.example.yanvydra.json.http.IHttpClient;
import com.example.yanvydra.json.mock.Mock;
import com.example.yanvydra.json.util.IOUtil;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(RobolectricTestRunner.class)
@Config(
        constants = BuildConfig.class,
        sdk = 25
)
public class ObjectArrayParserTest {



    private IHttpClient mHttpClient;

    @Before
    public void setUp() {
        mHttpClient = mock(IHttpClient.class);
    }

    @Test
    public void parseForJson() throws Exception {
        InputStream mInputStream = Mock.stream("json_array.json");
        when(mHttpClient.request(Matchers.anyString())).thenReturn(mInputStream);
        InputStream response = mHttpClient.request("http://");
        final ObjectArrayParserFactory objectArrayParserFactory = new ObjectArrayParserFactory();
        final IObjectArray objectArray = objectArrayParserFactory.arrayParserJSON(response).parse();
        final List<IObject> objectList = objectArray.getObjectArray();
        assertEquals(objectList.get(0).getId(), "0");
        assertEquals(objectList.get(0).getName(), "Orr Fuentes");
    }

    @Test
    public void parseForGson() throws Exception {
        InputStream mInputStream = Mock.stream("json_array.json");
        when(mHttpClient.request(Matchers.anyString())).thenReturn(mInputStream);
        InputStream response = mHttpClient.request("http://");
        final ObjectArrayParserFactory objectArrayParserFactory = new ObjectArrayParserFactory();
        final IObjectArray objectArray = objectArrayParserFactory.arrrayParserGSON(response).parse();
        final List<IObject> objectList = objectArray.getObjectArray();
        assertEquals(objectList.get(0).getId(), "0");
        assertEquals(objectList.get(0).getName(), "Orr Fuentes");
    }

}