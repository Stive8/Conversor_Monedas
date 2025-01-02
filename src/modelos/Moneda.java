package modelos;

public class Moneda {

    private double pesoArgentino;

    private double boliviano;

    private double realBrasileño;

    private double pesoChileno;

    private double pesoColombiano;

    private double dolarEstadounidense;

    public Moneda(MonedaOmdb monedaOmdb){

        this.dolarEstadounidense = monedaOmdb.usd();
        this.boliviano = monedaOmdb.bob();
        this.pesoArgentino = monedaOmdb.ars();
        this.pesoChileno = monedaOmdb.clp();
        this.realBrasileño = monedaOmdb.brl();
        this.pesoColombiano = monedaOmdb.cop();
    }

    @Override
    public String toString() {
        return "Moneda{" +
                "pesoArgentino=" + pesoArgentino +
                ", boliviano=" + boliviano +
                ", realBrasileño=" + realBrasileño +
                ", pesoChileno=" + pesoChileno +
                ", pesoColombiano=" + pesoColombiano +
                ", dolarEstadounidense=" + dolarEstadounidense +
                '}';
    }
}
