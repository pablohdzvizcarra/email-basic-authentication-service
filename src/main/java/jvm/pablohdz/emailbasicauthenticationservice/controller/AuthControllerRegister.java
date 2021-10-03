package jvm.pablohdz.emailbasicauthenticationservice.controller;

import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AuthControllerRegister implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) {
        String requestMethod = exchange.getRequestMethod();

        InputStream requestBody = exchange.getRequestBody();
        try {
            String body =
                    CharStreams.toString(new InputStreamReader(requestBody, Charsets.UTF_8));

            System.out.println(body);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}