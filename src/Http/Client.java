package Http;

import java.net.http.HttpClient;

public class Client {
    public HttpClient client;

    public Client(){
        this.client = HttpClient.newHttpClient();
    }
}
