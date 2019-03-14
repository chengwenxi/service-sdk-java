package org.irisnet.service.utils;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpUtil {


    public static String HttpGet(String url) throws IOException {
        HttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(url);
        String strResult = null;
        HttpResponse response = client.execute(request);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            strResult = EntityUtils.toString(response.getEntity());
        }
        return strResult;
    }
}
