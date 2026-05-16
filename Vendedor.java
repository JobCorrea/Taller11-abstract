public class Vendedor extends Empleado{
    protected String nombre;
    protected double salario;
    protected int ventas;
   
    public Vendedor(String nombre, double salario, int ventas) {
        this.nombre = nombre;
        this.salario = salario;
        this.ventas = ventas;
    }
    
    @Override
    public double calcularSalario(){
        return salario * (ventas*0.05);
    } 

    @Override
    public void mostrarDetalles(){
        System.out.println("El salario del vendedor "+nombre+" es: "+salario+" mas el 5% por ventas realizadas total de: "+
        +calcularSalario());
    }
}
