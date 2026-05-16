public class Circulo extends Figura {
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double  calcularArea(){
       return  Math.PI *radio*radio;
    }

    @Override
    public void mostrarArea(){
        System.out.println("El area de un Circulo es: "+calcularArea());
    }
}
