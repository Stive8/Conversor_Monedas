package modelos;

import Http.Client;
import Http.Request;
import Http.Response;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelos.ExchangeRateResponse;
import modelos.MonedaOmdb;

import java.io.IOException;
import java.util.Map;

public class ExchangeRateService {

    private final String apiUrl;

    public ExchangeRateService(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public MonedaOmdb obtenerTasasDeCambio() throws IOException, InterruptedException {
        Client client = new Client();
        Request request = new Request(apiUrl);
        Response response = new Response(client, request);

        String json = response.getResponseBody();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting()
                .create();

        ExchangeRateResponse exchangeRateResponse = gson.fromJson(json, ExchangeRateResponse.class);

        Map<String, Double> conversionRates = exchangeRateResponse.getConversionRates();

        double ars = conversionRates.getOrDefault("ARS", 0.0);
        double bob = conversionRates.getOrDefault("BOB", 0.0);
        double brl = conversionRates.getOrDefault("BRL", 0.0);
        double clp = conversionRates.getOrDefault("CLP", 0.0);
        double cop = conversionRates.getOrDefault("COP", 0.0);
        double usd = conversionRates.getOrDefault("USD", 0.0);

        return new MonedaOmdb(ars, bob, brl, clp, cop, usd);
    }
}
