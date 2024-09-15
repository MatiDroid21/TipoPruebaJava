/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Mati Droid
 */
public class Docente {
    private String rut;
    private int nroDocente;
    private String nombre;
    private String fechaIngreso;
    private String sede;

    public Docente() {
    }

    public Docente(String rut, int nroDocente, String nombre, String fechaIngreso, String sede) {
        this.rut = rut;
        this.nroDocente = nroDocente;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
        this.sede = sede;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getNroDocente() {
        return nroDocente;
    }

    public void setNroDocente(int nroDocente) {
        this.nroDocente = nroDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "=== Datos Docente ===" + "\n"
                + "Rut=" + rut + ",\n"
                + "nroDocente=" + nroDocente + ",\n"
                + "nombre=" + nombre + ",\n"
                + "fechaIngreso=" + fechaIngreso + ",\nDocen"
                + "sede=" + sede;
    }
    
    
    
}
