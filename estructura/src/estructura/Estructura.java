/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

import estructura.listas.pila;
import estructura.modelo.alumno;
import estructura.ordenacion.busqueda;
import estructura.ordenacion.ordenacion;
import java.util.Date;

/**
 *
 * @author mtand
 */
public class Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        ordenacion obj = new ordenacion();
//        busqueda objBusqueda = new busqueda();
//        
//        int a[] = {100,3,2,4,5,6,7,8,9,12,44,33,22,45};
//        int numElementos = 100;
//        int b[] = new int[numElementos];
//        for (int i=0; i < numElementos; i++) {
//            b[i] = Integer.parseInt(String.valueOf(Math.round(Math.random()*100)));
//        }
//        obj.imprimeVector(b);
//        System.out.println(new Date());
//        obj.Burbuja(b);
//        obj.SeleccionDirecta(a);
//        obj.InsercionDirecta(a);
//        obj.ShellSort(b);
//        obj.QuickSort(b, 0, b.length-1);
//        obj.MergeSort(b, 0, b.length);
//        int resp = objBusqueda.Secuencia(b, 15);
//        int resp = objBusqueda.Binaria(b, 50);
//        System.out.println("Ubicacion: " + resp);
//        System.out.println(new Date());
//        obj.imprimeVector(b);

//        alumno objAlumno[] = new alumno[6];
//        
//        objAlumno[0] = new alumno(34, "Maximo","Tandazo", "453620192");
//        objAlumno[1] = new alumno(2, "Juan","Perez","9981762724");
//        objAlumno[2] = new alumno(7, "Pedro", "Picapiedra","000009183");
//        objAlumno[3] = new alumno(4, "Carlos","Marmol","928392839");
//        objAlumno[4] = new alumno(100,"Mario","Moreno","3333333333");
//        objAlumno[5] = new alumno(30,"Pepito","Malccriado","72773727372");
//        
//        obj.imprimeVector(objAlumno);
//        obj.Burbuja(objAlumno);
//        obj.imprimeVector(objAlumno);


        pila objPila = new pila();
        
        objPila.push(65);
        objPila.push(5);
        System.out.println("Cima: " + objPila.info());
        objPila.push(20);
        objPila.push(100);
        objPila.push(99);
        objPila.mostrar();
        System.out.println("Cima: " + objPila.info());
        System.out.println("Es vacia: " + objPila.esVacia());
        objPila.pop();
        objPila.pop();
        objPila.pop();
        objPila.pop();
        objPila.pop();
        objPila.mostrar();
        System.out.println("Es vacia: " + objPila.esVacia());
    }
    
}
