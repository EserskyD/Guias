package com.company;

public class obj_Rectangulo {

    double ancho = 1.0;
    double alto = 1.0;

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void imprimirAltoAncho()  /// Punto b
    {
        System.out.println("Alto: " + getAlto());
        System.out.println("Ancho: " + getAncho());
    }

    public double rectanguloArea ()  /// Punto c
    {
        double area = getAlto() * getAncho();
        return area;
    }

    public  double rectanguloPerimetro()  /// Punto c
    {
        double perimetro = getAlto() * 2 + getAncho() * 2;
        return perimetro;
    }

}
