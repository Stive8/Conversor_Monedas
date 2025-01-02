package Http;

import java.net.URI;
import java.net.http.HttpRequest;

public class Request {
    private HttpRequest request;

    public Request(String uri) {
        this.request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();
    }

    public HttpRequest getRequest() {
        return this.request;
    }
}
