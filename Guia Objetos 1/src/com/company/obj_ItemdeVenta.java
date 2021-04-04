package com.company;

public class obj_ItemdeVenta {
    long id;
    String descripción;
    long cantidad;
    float pUnitario;
    float pTotal;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public long getCantidad() {
        return cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public float getpUnitario() {
        return pUnitario;
    }

    public void setpUnitario(float pUnitario) {
        this.pUnitario = pUnitario;
    }

    public float getpTotal() {
        return pTotal;
    }

    public void setpTotal(float pTotal) {
        this.pTotal = pTotal;
    }

    public float calculoPTotal ()
    {
        pTotal = pUnitario * cantidad;
        return pTotal;
    }

    public void imprimirItem()
    {
        System.out.println("Item de venta [Id= " + id + " Descripción= " + descripción + " Cantidad= " + cantidad + " Precio Unitario= " + pUnitario + " Precio Total= " + pTotal);
    }

}
