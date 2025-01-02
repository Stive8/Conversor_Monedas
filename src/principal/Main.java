package principal;

import Http.Client;
import Http.Request;
import Http.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Client client = new Client();
            Request request = new Request("https://v6.exchangerate-api.com/v6/884678351f1005c55a0b09e9/latest/USD");
            Response response = new Response(client, request);

            System.out.println("Status Code: " + response.getStatusCode());
            System.out.println("Response Body: " + response.getResponseBody());
        } catch (InterruptedException | IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
