package com.aserto;

import javax.net.ssl.SSLException;
import io.github.cdimascio.dotenv.DotenvException;

public class Example {
    public static void main(String[] args) {
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
