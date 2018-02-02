package ro.san.rodri;

public class Rectangulo {
    int altura;
    int base;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;

    }

    public double perimetro() {
        double p;
        p = (altura * 2) + (base * 2);
        return p;
    }

    public double area() {
        double a;
        a = altura * base;
        return a;
    }
}


