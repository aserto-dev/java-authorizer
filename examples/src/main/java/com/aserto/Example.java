package com.aserto;

import javax.net.ssl.SSLException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static java.lang.System.exit;


public class Example {
    public static void main(String[] args) throws SSLException {
        AuthzClient client = new AuthzClient();

        client.listPolicies();
        client.query();
        client.is();
    }
}
