/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 *Clase abstracta que cre crea un poligono
 * @author alumno
 */
public abstract class Poligono {
/**
 * Constructor vacío
 */
    public Poligono() {
    }
    /**
     * Metodo abstracto que saca el area de un poligono
     * @return Nada
     */
    public abstract float area();
    /**
     * Método abstracto que saca el perimetro de un poligono
     * @return Nada
     */
    public abstract float perimetro();
    
/**
 * ToString que imprime la clase polígono
 * @return La palabra Poligono
 */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
