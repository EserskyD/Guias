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

    public float credito (float deposito)
    {
        this.setBalance(balance+deposito);
        return balance;
    }

    public float debito (float extraccion)
    {
        this.setBalance(balance-extraccion);
        return balance;
    }

    public void imprimirCuenta ()
    {
        System.out.println("Id de cuenta: " + id);
        System.out.println("Nombre del propietario: " + nombre);
        System.out.println("Balance actual de la cuenta: " + balance);
    }

}
