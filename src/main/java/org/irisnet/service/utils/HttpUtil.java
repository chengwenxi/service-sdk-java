package org.irisnet.service.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;

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

    public static String HttpPost(String url, Object object) throws IOException {
        HttpClient client = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        post.setHeader("Content-type", "application/json; charset=utf-8");
        post.setHeader("commit", "true");
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(object));
        StringEntity entity = new StringEntity(objectMapper.writeValueAsString(object), Charset.forName("UTF-8"));
        entity.setContentEncoding("UTF-8");
        entity.setContentType("application/json");
        post.setEntity(entity);

        String strResult = null;
        HttpResponse response = client.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            strResult = EntityUtils.toString(response.getEntity());
        }
        return strResult;
    }
}
