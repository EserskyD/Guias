package com.company;

public class obj_Empleado {
    long dni;
    String nombre;
    String apellido;
    float salario;

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calcularSalarioAnual()
    {
        float salarioAnual = salario * 12;
        return salarioAnual;
    }

    public float aumentarSalario(float procentaje)
    {
        salario = salario + (salario * procentaje)/100;
        return salario;
    }

    public void imprimirEmpleado ()
    {
        System.out.println("Empleado[ DNI= " + dni + " Nombre= " + nombre + " Apellido= " + apellido + " Salario= " + salario);
    }

}
