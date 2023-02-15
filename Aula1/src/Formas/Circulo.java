package Formas;

public class Circulo extends FormaGeometrica{
    private Double raio;
    @Override
    public void calcularArea(){
        System.out.println(2*Math.PI*Math.pow(this.raio,2));
    }
}
