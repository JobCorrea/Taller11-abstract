public class Moto extends Vehiculo {
    protected double velocidad;

    public Moto(String marca, double velocidad){
        super(marca);
        this.velocidad = velocidad;
    }

    @Override
    public double calcularVelocidad(){
        return velocidad;
    }
    // Moto no sobrescribe mostrarInfo()
    // Java no obliga a hacerlo porque es concreto
    // entonces imprime el mensaje generico del padre
    // en lugar de uno especifico para Moto
}