/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop9;

/**
 *Clase que crea un triangulo
 * @author alumno
 */
public class Triangulo extends Poligono{
    private int alfa,beta,gama;
    private float a,b,c;
    private float base, altura;
/**
 * Constructor vacio
 */
    public Triangulo() {
    }
/**
 * Constrictor con atributos
 * @param base Atributo que indica la medida de la base del triangulo
 * @param altura Atributo que indica la medida de la altura del triangulo
 */
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public int getBeta() {
        return beta;
    }

    public int getGama() {
        return gama;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
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
     * Sobreescritura del metodo Perimetro para obtener el perimetro de un triangulo
     * @return Perimetro del triangulo
     */
    @Override
    public float perimetro(){
        return a+b+c;
    }
    /**
     * Sobreescritura del metodo Area para obtener el area de un triangulo
     * @return Area del triangulo
     */
    @Override
    public float area(){
        return (b*a)/2;
    }
    /**
     * ToString que imprime Triangulo y la superclase
     * @return 
     */
    @Override
    public String toString() {
        return super.toString()+"Triangulo{"  + '}';
    }
    

    
}

