package calculos;

import modelos.Moneda;
import java.util.Scanner;


public class CalculadoraConversion {
    private modelos.MonedaOmdb monedaOmdb;
    private Moneda moneda;
    private Scanner sc = new Scanner(System.in);


    public CalculadoraConversion(modelos.MonedaOmdb monedaOmdb) {
        this.monedaOmdb = monedaOmdb;
        this.moneda = new Moneda(monedaOmdb);
    }

    public double solicitudValor() {
        System.out.println("Ingrese el valor que desea convertir: ");
        return sc.nextDouble();
    }

    public double dolarPesoColombiano(double valor) {
        return valor * monedaOmdb.cop();
    }

    public double pesoColombianoDolar(double valor) {
        return valor / monedaOmdb.cop();
    }

    public double dolarPesoArgenino(double valor) {
        return valor * monedaOmdb.ars();
    }

    public double pesoArgentinoDolar(double valor) {
        return valor / monedaOmdb.ars();
    }
    public double dolarBolivar(double valor) {
        return valor * monedaOmdb.bob();
    }

    public double bolivarDolar(double valor) {
        return valor / monedaOmdb.bob();
    }
    public double dolarRealBrasileño(double valor) {
        return valor * monedaOmdb.brl();
    }

    public double realBrasileñoDolar(double valor) {
        return valor / monedaOmdb.brl();
    }

    public double dolarPesoChileno(double valor) {
        return valor * monedaOmdb.clp();
    }

    public double pesoChilenoDolar(double valor) {
        return valor / monedaOmdb.clp();
    }
}

