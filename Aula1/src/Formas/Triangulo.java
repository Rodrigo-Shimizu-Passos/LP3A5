package Formas;

public class Triangulo extends FormaGeometrica{
    private Double base;
    private Double altura;
    @Override
    public void calcularArea() {
        System.out.println(this.base*this.altura/2);
    }
}
