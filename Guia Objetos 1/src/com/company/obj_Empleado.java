package com.company;

public class obj_Empleado {
    long dni;
    String nombre;
    String apellido;
    float salario;

    public obj_Empleado() {
    }

    public long getDni() {
        return this.dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calcularSalarioAnual() {
        float salarioAnual = this.salario * 12.0F;
        return salarioAnual;
    }

    public float aumentarSalario(float procentaje) {
        this.salario += this.salario * procentaje / 100.0F;
        return this.salario;
    }

    public void imprimirEmpleado() {
        System.out.println("Empleado[ DNI= " + this.dni + " Nombre= " + this.nombre + " Apellido= " + this.apellido + " Salario= " + this.salario);
    }
}
