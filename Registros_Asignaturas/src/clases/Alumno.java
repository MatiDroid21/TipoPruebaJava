/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Mati Droid
 */
public class Alumno {
    private String rut;
    private String nombre;
    private int edad;
    private String fechaNacimiento;

    public Alumno() {
    }

    public Alumno(String rut, String nombre, int edad, String fechaNacimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "=== Datos Del Alumno ===" + "\nRut Del Estudiante = " + rut + "\nNombre Completo Del Estudiante = " + nombre + "\n"
             + "Edad=" + edad + "\nFecha Nacimiento=" + fechaNacimiento;
    }
    
    
    
}
