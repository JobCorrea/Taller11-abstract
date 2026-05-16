public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        circulo.mostrarArea();
        Figura rectangulo = new Rectangulo(8, 4);
        rectangulo.mostrarArea();
        System.out.println("---------------------");

        Empleado gerente = new Gerente("Isabel", 1200000);
        Empleado vendedor = new Vendedor("Job", 1000000, 5);
        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();

         //## Prueba Error
        // ERROR: Empleado is abstract; cannot be instantiated
        //Empleado e = new Empleado();

        Vehiculo moto= new Moto("AKT", 150);
        moto.mostrarInfo();
    }
}
