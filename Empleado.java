public abstract class Empleado {
    
    public abstract double calcularSalario();

    public void mostrarDetalles(){
        System.out.println("El salario del Empleado es: "+calcularSalario());
    }
}
