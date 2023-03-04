package com.aserto;

import static java.lang.System.exit;

import javax.net.ssl.SSLException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import io.github.cdimascio.dotenv.DotenvException;

public class Example {
    public static void main(String[] args) throws SSLException, DotenvException {
        try {
            AuthzClient client = new AuthzClient();

            client.listPolicies();
            client.query();
            client.is();
        }
        catch (DotenvException | SSLException ex) {
            System.out.printf("error: %s\n", ex.getMessage());
            System.exit(1);
        }
    }
}
