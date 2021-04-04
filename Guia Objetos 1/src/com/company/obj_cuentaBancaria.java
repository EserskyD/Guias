package com.company;

public class obj_cuentaBancaria {
    long id;
    String nombre;
    float balance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float credito (float ingreso)
    {
        this.balance = balance+ingreso;
        return balance;
    }

    public float debito (float extracion)
    {
        this.balance = balance-extracion;
        return balance;
    }

    public void imprimirCuenta()
    {
        System.out.println("Id: " + id);
        System.out.println("Nombre del propietario: " + nombre);
        System.out.println("Balance actual: " + balance);
    }

}
