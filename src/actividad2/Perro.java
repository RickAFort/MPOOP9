/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *Clase que crea un perro
 * @author alumno
 */
public class Perro extends Mascota{
    private boolean colaCortada;
    /**
     * Constructor vacío
     */
    public Perro() {
    }
    /**
     * Constructor con atributos
     * @param colaCortada Valor tipo boolean que es verdadero si el perro tiene la cola cortada
     * @param color Color del perro
     * @param raza Raza del perro
     * @param colorOjos Color de ojos del perro
     * @param nombre Nombre del perro
     * @param edad Edad del perro
     */
    public Perro(boolean colaCortada, String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.colaCortada = colaCortada;
    }
    public boolean isColaCortada() {
        return colaCortada;
    }
    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }
    /**
     * Método que hace que el perro corra
     */
    public void correr(){
        System.out.println("Estoy corriendo");
    }
    /**
     * Método que hace que el perro correteé
     */
    public void corretear(){
        System.out.println("Estoy corretiando");
    }
    /**
     * Método que imprime los atributos del perro
     * @return Atributos del perro
     */
    @Override
    public String toString() {
        return "Perro{"+ super.toString()+ "colaCortada=" + colaCortada + '}';
    }
    /**
     * Método que sobreescribe el metodo abstracto jugar para un perro
     */
    @Override
    public void jugar() {
        System.out.println("Estoy jugando con una pelota");
    }


}
