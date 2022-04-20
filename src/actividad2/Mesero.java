/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 *Clase que crea un mesero
 * @author alumno
 */
public class Mesero extends Empleado{
    private String restaurante, colorUniforme;
    private int numMesas;
    /**
     * Constructor vacío
     */
    public Mesero() {
    }
    /**
     * Constructor con atributos
     * @param restaurante Nombre del restaurant donde trabaja el mesero
     * @param colorUniforme Color del uniforme del mesero
     * @param numMesas Numero de mesas que atiende el mesero
     * @param salario Salario del mesero
     * @param horaEntrada Hora en la que entra a trabajar el mesero
     * @param horaSalida Hora en la que sale del trabajo el mesero
     * @param mascota Variable de tipo mascota
     * @param nombre Nombre del mesero
     * @param edad Edad del mesero
     */
    public Mesero(String restaurante, String colorUniforme, int numMesas, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.restaurante = restaurante;
        this.colorUniforme = colorUniforme;
        this.numMesas = numMesas;
    }
    public String getRestaurante() {
        return restaurante;
    }
    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }
    public String getColorUniforme() {
        return colorUniforme;
    }
    public void setColorUniforme(String colorUniforme) {
        this.colorUniforme = colorUniforme;
    }
    public int getNumMesas() {
        return numMesas;
    }
    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }
    /**
     * Método que recibe el pedido de los clientes
     */
    public void recibirPedidos(){
        System.out.println("Recibiendo pedido");
    }
    /**
     * Método que da los pedidos
     */
    public void darPedidos(){
        System.out.println("Dando pedidos");
    }
    /**
     * Método que recibe la propina del mesero
     */
    public void recibirPropina(){
        System.out.println("Recibiendo propina");
    }
    /**
     * Método que hace el mesero tome un descanso
     */
    public void tomarDescanso(){
        System.out.println("Tomando un descanso");
    }
    /**
     * Método que imprime los atributos del mesero
     * @return Atributos del mesero
     */
    @Override
    public String toString() {
        return "Mesero{" +super.toString()+ "restaurante=" + restaurante + ", colorUniforme=" + colorUniforme + ", numMesas=" + numMesas + '}';
    }
/**
 * Método que sobreescribe el metodo abstracto aclararDudas especificamente para un mesero
 */
    @Override
    public void aclararDudas() {
        System.out.println("Aclarando dudas respecto al restaurante o los platillos");
    }
    
}
