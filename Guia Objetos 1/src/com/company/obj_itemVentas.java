package com.company;

public class obj_itemVentas {
    long id;
    String descripción;
    long cantidad;
    float pUnitario;
    float pTotal;

    public obj_itemVentas() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripción() {
        return this.descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public long getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(long cantidad) {
        this.cantidad = cantidad;
    }

    public float getpUnitario() {
        return this.pUnitario;
    }

    public void setpUnitario(float pUnitario) {
        this.pUnitario = pUnitario;
    }

    public float getpTotal() {
        return this.pTotal;
    }

    public void setpTotal(float pTotal) {
        this.pTotal = pTotal;
    }

    public float calculoPTotal() {
        this.pTotal = this.pUnitario * (float)this.cantidad;
        return this.pTotal;
    }

    public void imprimirItem() {
        System.out.println("Item de venta [Id= " + this.id + " Descripción= " + this.descripción + " Cantidad= " + this.cantidad + "Precio Unitario= " + this.pUnitario + " Precio Total= " + this.pTotal);
    }
}