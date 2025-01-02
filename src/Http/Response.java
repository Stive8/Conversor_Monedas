package Http;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

public class Response {
    private Client client;
    private HttpResponse<String> response;

    public Response(Client client, Request request) throws IOException, InterruptedException {
        this.client = client;
        this.response = client.client.send(request.getRequest(), HttpResponse.BodyHandlers.ofString());
    }

    public String getResponseBody() {
        return this.response.body();
    }

    public int getStatusCode() {
        return this.response.statusCode();
    }
}
