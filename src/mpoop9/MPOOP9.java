/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop9;

import actividad2.Alumno;
import actividad2.Gato;
import actividad2.Mesero;
import actividad2.Perro;
import actividad2.ProfesorAsignatura;
import actividad2.ProfesorCarrera;


/**
 *Clase principal
 * @author alumno
 */
public class MPOOP9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("#####Poligono######");
        //Poligono poligono=new Poligono(); 
       //no se pueden instanciar clases abstractas
       Triangulo triangulo=new Triangulo();
        System.out.println(triangulo);
       Cuadrilatero cuadrilatero=new Cuadrilatero();
        System.out.println(cuadrilatero);
        
        System.out.println(triangulo.getBase());
        Triangulo triangulo2= triangulo;
        System.out.println(triangulo2.getBase());
        triangulo2.setBase(9);
        System.out.println(triangulo2.getBase());
        System.out.println(triangulo.getBase());
        
        System.out.println("##########Alumno###########");
        Alumno alumno=new Alumno("Ing. Electrica",4,new Perro(false,"Blanco","Labrador","Azul","Jackson",2) {},"Pedro",20);
        System.out.println(alumno);
        alumno.respirar();
        alumno.aprender();
        alumno.darseDeBaja();
        alumno.estudiar();
        
        System.out.println("#########Gato############");
        Gato gato=new Gato("Naranja","Toyger","Verde","Garfield",5);
        System.out.println(gato);
        gato.respirar();
        gato.jugar();
        gato.rasgunar();
        gato.saltar();
        gato.trepar();
        gato.dormir();
        
        System.out.println("########Perro###########");
        Perro perro=new Perro(true,"Café","Pastor Aleman","Gris","Tom",8);
        System.out.println(perro);
        perro.respirar();
        perro.correr();
        perro.corretear();
        perro.saltar();
        perro.dormir();
        perro.jugar();
        
        System.out.println("#######Mesero#########");
        Mesero mesero=new Mesero("El Colibri","Negro",5,3_000,12,5,new Gato("Gris","Kinkalow","Azul","Kikin",4) {},"Carlos",23);
        System.out.println(mesero);
        mesero.respirar();
        mesero.aclararDudas();
        mesero.darPedidos();
        mesero.recibirPedidos();
        mesero.recibirPropina();
        mesero.tomarDescanso();
        
        System.out.println("#######Profesor de asignatura#######");
        ProfesorAsignatura profAsig=new ProfesorAsignatura("Termodinamica",50,5_000,7,9,new Perro(false,"Manchado","Dalmata","Cafe","Pulgas",9) {},"Xochitl",34);
        System.out.println(profAsig);
        profAsig.respirar();
        profAsig.aclararDudas();
        profAsig.ensenar();
        profAsig.explicar();
        profAsig.pasarAlumnos();
        profAsig.reprobar();
        
        System.out.println("########Profesor de Carrera##########");
        ProfesorCarrera profCarr=new ProfesorCarrera(4,10,500,30_000,8,4,new Perro(false,"Cafe","Pastor Belga","Cafe","McQueen",9) {},"Alberto",45);
        System.out.println(profCarr);
        profCarr.respirar();
        profCarr.aclararDudas();
        profCarr.ensenar();
        profCarr.explicar();
        profCarr.pasarAlumnos();
        profCarr.reprobar();
    }
}
