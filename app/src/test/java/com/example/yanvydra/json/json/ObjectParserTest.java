package com.example.yanvydra.json.json;

import com.example.yanvydra.json.BuildConfig;
import com.example.yanvydra.json.http.IHttpClient;
import com.example.yanvydra.json.mock.Mock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.io.InputStream;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
@Config(
        constants = BuildConfig.class,
        sdk = 25
)

public class ObjectParserTest {


    private InputStream mInputStream;
    private IHttpClient mIHttpClient;

    @Before
    public void setUp() {
        mIHttpClient = mock(IHttpClient.class);
    }


    @Test
    public void parseJSON() throws Exception {
        mInputStream = Mock.stream("json_object.json");
        when(mIHttpClient.request(Matchers.anyString())).thenReturn(mInputStream);
        final InputStream response = mIHttpClient.request("http://");
        final ObjectParserFactory objectParserFactory = new ObjectParserFactory();
        final IObject object = objectParserFactory.parserJson(response).parse();
        assertEquals(object.getId(),"0");
        assertEquals(object.getName(),"Whitley Espinoza" );
    }

    @Test
    public void parseGSON() throws Exception {
        mInputStream = Mock.stream("json_object.json");
        when(mIHttpClient.request(Matchers.anyString())).thenReturn(mInputStream);
        final InputStream response = mIHttpClient.request("http://");
        final ObjectParserFactory objectParserFactory = new ObjectParserFactory();
        final IObject object = objectParserFactory.parserGson(response).parse();
        assertEquals(object.getId(), "0");
        assertEquals(object.getName(),"Whitley Espinoza" );

    }



}