public class Gerente extends Empleado{
    protected String nombre;
    protected double salario;

    public Gerente(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    @Override
    public double calcularSalario(){
        return salario;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("El salario del Gerente "+nombre +" es: "+calcularSalario());
    }

}
