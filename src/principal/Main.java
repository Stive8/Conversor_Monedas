package principal;

import modelos.Moneda;
import modelos.MonedaOmdb;
import calculos.Menu;
import modelos.ExchangeRateService;

public class Main {
    public static void main(String[] args) {
        try {
            String apiUrl = "https://v6.exchangerate-api.com/v6/884678351f1005c55a0b09e9/latest/USD";
            ExchangeRateService service = new ExchangeRateService(apiUrl);

            MonedaOmdb monedaOmdb = service.obtenerTasasDeCambio();
            Moneda moneda = new Moneda(monedaOmdb);

            System.out.println(moneda);

            Menu menu = new Menu(monedaOmdb);
            menu.mostrarMenuCompleto();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
