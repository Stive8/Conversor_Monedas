package calculos;

import java.util.Scanner;

public class Menu {
    private CalculadoraConversion calculadoraConversion;
    private int opcion = 0;
    Scanner sc = new Scanner(System.in);


    // Constructor que recibe MonedaOmdb
    public Menu(modelos.MonedaOmdb monedaOmdb) {
        this.calculadoraConversion = new CalculadoraConversion(monedaOmdb);
    }

    public void mostrarOpciones() {
        System.out.println("*********************************");
        System.out.println("CALCULADORA DE CONVERSIONES");
        System.out.println("1.  Dolar ----> Peso Colombiano");
        System.out.println("2.  Peso Colombiano ----> Dolar");
        System.out.println("3.  Dolar ----> Peso Argentino");
        System.out.println("4.  Peso Argentino ----> Dolar");
        System.out.println("5.  Dolar ----> Bolivar");
        System.out.println("6.  Bolivar ----> Dolar");
        System.out.println("7.  Dolar ----> Real Brasileño");
        System.out.println("8.  Real Brasileño ----> Dolar");
        System.out.println("9.  Dolar ----> Peso Chileno");
        System.out.println("10.  Peso Chileno ----> Dolar");
        System.out.println("11. SALIR");
        System.out.println("*********************************");

    }

    public void mostrarResultado (double valor, double resultado, String origen, String convertido){
        System.out.println("--------------------------");
        System.out.println(valor + " " + origen + " equivalen a " + resultado + " " + convertido);
        System.out.println("--------------------------");
    }

    public void opcionContinuar(){
        System.out.println("Presione enter para continuar");
        sc.nextLine();

    }

    public void mostrarMenuCompleto() {

        do {
            mostrarOpciones();
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    double valor = calculadoraConversion.solicitudValor();
                    double resultado = calculadoraConversion.dolarPesoColombiano(valor);
                    mostrarResultado(valor, resultado, "USD", "COP");
                    opcionContinuar();


                }
                case 2 -> {
                    double valor = calculadoraConversion.solicitudValor();
                    double resultado = calculadoraConversion.pesoColombianoDolar(valor);
                    mostrarResultado(valor, resultado, "COP", "USD");
                    opcionContinuar();


                }
                case 3 -> {
                    double valor = calculadoraConversion.solicitudValor();
                    double resultado = calculadoraConversion.dolarPesoArgenino(valor);
                    mostrarResultado(valor, resultado, "USD", "ARS");
                    opcionContinuar();


                }

                case 4 -> {
                    double valor = calculadoraConversion.solicitudValor();
                    double resultado = calculadoraConversion.pesoArgentinoDolar(valor);
                    mostrarResultado(valor, resultado, "ARS", "USD");
                    opcionContinuar();


                }

                case 5 -> {
                    double valor = calculadoraConversion.solicitudValor();
                    double resultado = calculadoraConversion.dolarBolivar(valor);
                    mostrarResultado(valor, resultado, "USD", "BOB");
                    opcionContinuar();


                }

                case 6 -> {
                    double valor = calculadoraConversion.solicitudValor();
                    double resultado = calculadoraConversion.bolivarDolar(valor);
                    mostrarResultado(valor, resultado, "BOB", "USD");
                    opcionContinuar();


                }

                case 7 -> {
                    double valor = calculadoraConversion.solicitudValor();
                    double resultado = calculadoraConversion.dolarRealBrasileño(valor);
                    mostrarResultado(valor, resultado, "USD", "BRL");
                    opcionContinuar();


                }

                case 8 -> {
                    double valor = calculadoraConversion.solicitudValor();
                    double resultado = calculadoraConversion.realBrasileñoDolar(valor);
                    mostrarResultado(valor, resultado, "BRL", "USD");
                    opcionContinuar();


                }

                case 9 -> {
                    double valor = calculadoraConversion.solicitudValor();
                    double resultado = calculadoraConversion.dolarPesoChileno(valor);
                    mostrarResultado(valor, resultado, "USD", "CLP");
                    opcionContinuar();


                }

                case 10 -> {
                    double valor = calculadoraConversion.solicitudValor();
                    double resultado = calculadoraConversion.pesoChilenoDolar(valor);
                    mostrarResultado(valor, resultado, "CLP", "USD");
                    opcionContinuar();


                }
                case 11 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 11);
    }
}

