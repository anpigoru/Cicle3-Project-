package com.mintic.project3;

import javax.persistence.*;

@Entity
@Table(name = "transaction")
public class MovimientoDinero {

    @Id
    @GeneratedValue
    private int id;
    private long monto;
    private String concepto;

    @ManyToOne
    @JoinColumn(name = "Empleado_id")
    private Empleado empleado;

    public MovimientoDinero(long monto, String concepto, Empleado empleado) {
        this.monto = monto;
        this.concepto = concepto;
        this.empleado = empleado;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getempleado() {
        return empleado;
    }

    public void setUsuarioMov(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
