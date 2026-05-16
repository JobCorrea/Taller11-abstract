public abstract class Vehiculo {
    protected String marca;

    public Vehiculo(String marca){
        this.marca = marca;
    }

    public abstract double calcularVelocidad();

    // MAL: este método debería ser abstracto porque cada vehiculo
    // tiene una forma diferente de mostrar su informacion
    // pero al ser concreto las clases hijas no estan obligadas a implementarlo
    public void mostrarInfo(){
        System.out.println("Vehiculo de marca: " + marca);
    }
}