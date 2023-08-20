package br.com.Calculadora;

public class Circulo extends FormaGeometrica {
    private double raio;
    private String nome = "Circulo";
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI*(raio*raio);
    }
    
    @Override
    public double calcularCircunferencia(){
        return 2*Math.PI*raio;
    }
    @Override
    public double calcularVolume(){
        return 0;
    }
   
    @Override
    public String toString(){
        return "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
