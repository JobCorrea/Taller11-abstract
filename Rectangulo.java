public class Rectangulo extends Figura{
    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        return base*altura;
    }
    @Override
    public void mostrarArea(){
        System.out.println("El area de un Rectangulo es: "+calcularArea());
    }
}
