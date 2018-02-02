package ro.san.rodri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0;

        int b = 0;
        int c = 0;
        String valor;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Ingrese la altura del Rectangulo:");
            valor = scanner.nextLine();
            a = Integer.parseInt(valor);
            System.out.println("Ingrese la base del Rectangulo:");
            valor = scanner.nextLine();
            b = Integer.parseInt(valor);
            Rectangulo tria = new Rectangulo(a, b);
            System.out.println("El Area es:" + tria.area());
            System.out.println("El Perimetro es:" + tria.perimetro());
            System.out.println("-Precione 1 para ingresar nuevos datos.");
            System.out.println("-Precione cero para salir:");
            valor = scanner.nextLine();
            c = Integer.parseInt(valor);
        } while (c != 0);


    }
}
