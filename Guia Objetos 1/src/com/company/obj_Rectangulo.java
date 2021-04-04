package com.company;

public class obj_Rectangulo {
    double ancho = 1.0D;
    double alto = 1.0D;

    public obj_Rectangulo() {
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void imprimirAltoAncho() {
        System.out.println("Alto: " + this.getAlto());
        System.out.println("Ancho: " + this.getAncho());
    }

    public double rectanguloArea() {
        double area = this.getAlto() * this.getAncho();
        return area;
    }

    public double rectanguloPerimetro() {
        double perimetro = this.getAlto() * 2.0D + this.getAncho() * 2.0D;
        return perimetro;
    }
}