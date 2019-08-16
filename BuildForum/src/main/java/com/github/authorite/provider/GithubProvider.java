package com.github.authorite.provider;


import com.github.authorite.dto.AccessTokenDTO;
import jdk.nashorn.internal.objects.annotations.Setter;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class GithubProvider {
    public String getAccessToken(AccessTokenDTO accessTokenDTO){
        MediaType JSON = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder()
                .url("http://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
                return response.body().string();
            } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

