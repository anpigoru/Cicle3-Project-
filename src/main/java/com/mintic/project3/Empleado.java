package com.mintic.project3;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "correo", unique = true)
    private String correo;
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
    public enum roles{admin, operario}
    @Column(name = "Rol")
    private roles rol;

    public Empleado(String nombre, String correo, Empresa empresa, roles rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {

        return correo;
    }

    public void setCorreo(String correo) {

        this.correo = correo;
    }

    public Empresa getEmpresa() {

        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public roles getRol() {
        return rol;
    }

    public void setRol(roles rol) {
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}