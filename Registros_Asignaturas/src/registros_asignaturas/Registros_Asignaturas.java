/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registros_asignaturas;

import clases.Alumno;
import clases.Asignatura;
import clases.Docente;
import java.util.Scanner;

/**
 *
 * @author Mati Droid
 */
public class Registros_Asignaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Alumno alumno = new Alumno("22.231.123-K", "Alexander Albon", 11, "06-06-2003");
        //System.out.println(alumno);
        //Docente docente = new Docente("12.456.789-K", 132322, "Max Verstappen", "20-20-2000", "No se");
        //System.out.println(docente);
        //Asignatura asignatura = new Asignatura("DSY1102-001V", "Programacion Orientada A Objetos", alumno, docente, 6.5, 5.5, 4.5);
        //double notafinal = asignatura.calcularNotaFinal();
        //System.out.println(asignatura);
        //System.out.println("nota final "+notafinal);
        //System.out.println("==================================================================================================");
        Alumno al = new Alumno();
        Docente doc = new Docente();
        Asignatura as = new Asignatura();
        //-----------------------------
        int opcion = 0;
        System.out.println("===== Registro De Asignaturas ====");
        do{
            System.out.println("1. Ingresar Alumno ");
            System.out.println("2. Ingresar Docente ");
            System.out.println("3. Ingresar Asignatura");
            System.out.println("4. Imprimir");
            System.out.println("5. Salir");
            System.out.println("Ingresa opcion");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de linea que queda en el buffer.
            switch (opcion) {
                case 1:
                    System.out.println("Ingresando Alumno");
                    System.out.println("Ingrese Rut Estudiante");
                    al.setRut(sc.nextLine());
                    System.out.println("Ingrese Nombre Completo Estudiante");
                    al.setNombre(sc.nextLine());
                    System.out.println("Ingrese Edad Estudiante");
                    al.setEdad(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingrese Fecha Nacimeinto Estudiante");
                    al.setFechaNacimiento(sc.nextLine());
                    break;
                    
                case 2:
                    System.out.println("Ingresando Docente");
                    System.out.println("Ingrese Rut Docente");
                    doc.setRut(sc.nextLine());
                    System.out.println("Ingrese nro Docente");
                    doc.setNroDocente(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingrese Nombre Docente");
                    doc.setNombre(sc.nextLine());
                    System.out.println("Ingrese Fecha De Ingreso");
                    doc.setFechaIngreso(sc.nextLine());
                    System.out.println("Ingrese Sede");
                    doc.setSede(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Ingrese Asignatura");
                    System.out.println("Ingrese Codigo Asignatura");
                    as.setCodigo(sc.nextLine());
                    System.out.println("Ingrese Nombre Asignatura");
                    as.setNombreAsignatura(sc.nextLine());
                    as.setAlumno(al);
                    as.setDocente(doc);
                    System.out.println("Ingrese las 3 notas solicitadas");
                    as.setNota1(sc.nextFloat());
                    as.setNota2(sc.nextFloat());
                    as.setNota3(sc.nextFloat());
                    sc.nextLine(); // consumir el salto de linea
                    break;
                case 4:
                    System.out.println(al);
                    System.out.println(doc);
                    System.out.println(as);
                    System.out.println("Promedio");
                    System.out.println(as.calcularNotaFinal());
                    break;
                case 5:
                    System.out.println("Programa Finalizado");
                default:
                    System.out.println("Opcion Incorrecta");
            }
        }while(opcion != 5);
        
    }
    
}
