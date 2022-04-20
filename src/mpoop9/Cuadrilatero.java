/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 *Clase que crea un cuadrilatero
 * @author alumno
 */
public class Cuadrilatero extends Poligono{
    private int alfa,beta;
    private float a,b;
    private float base, altura;
/**
 * Constructor Vacio
 */

    public Cuadrilatero() {
    }
/**
 * Constructor con atributos
 * @param base Atributo que indica la medida de la base del cuadrilatero
 * @param altura Atributo que indica la medida de la altura del cuadrilatero
 */
    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Sobreescritura del metodo Perimetro que indica como obtener el perímetro de un cuadrilatero
     * @return Valor del perímetro del cuadrilátero
     */
    @Override
    public float perimetro(){
        return 2*a+2*b;
    
    }
    /**
     * Sobreescritura del metodo Area que indica como obtener el perímetro de un cuadrilatero
     * @return Valor del área del cuadrilátero
     */
    @Override
    public float area(){
        return base*altura;
    
    }
/**
 * To string que devuelve Cuadrilatero y la superclase
 * @return 
 */
    @Override
    public String toString() {
        return super.toString()+ "Cuadrilatero{"  + '}';
    }
    
    
    
    
}
