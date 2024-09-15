/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Mati Droid
 */
public class Asignatura {
    private String codigo;
    private String nombreAsignatura;
    private Alumno alumno;
    private Docente docente;
    private double nota1;
    private double nota2;
    private double nota3;

    public Asignatura() {
    }

    public Asignatura(String codigo, String nombreAsignatura, Alumno alumno, Docente docente, double nota1, double nota2, double nota3) {
        this.codigo = codigo;
        this.nombreAsignatura = nombreAsignatura;
        this.alumno = alumno;
        this.docente = docente;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    public double calcularNotaFinal() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    @Override
    public String toString() {
        return "=== Asignatura ==="+"\n"
                + "Codigo De Asignatura = " + codigo + "\n"
                + "Asignatura = " + nombreAsignatura + "\n"
                + "Alumno = " + alumno.getNombre() + "\n"
                + "Docente = " + docente.getNombre() + "\n"
                + "Calificaciones = " + nota1 + ", " + nota2 + ", " + nota3;
    }
    
    
}
