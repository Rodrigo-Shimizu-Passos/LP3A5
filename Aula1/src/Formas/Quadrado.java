package Formas;

public class Quadrado extends FormaGeometrica{
    private Double lado;
    @Override
    public void calcularArea() {
        System.out.println(Math.pow(lado,2));
    }
}
