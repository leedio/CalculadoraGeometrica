package br.com.Calculadora;

public class Quadrado extends FormaGeometrica {

    double lado;
    private String nome = "Quadrado";

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }

    @Override
    public double calcularVolume(){
        return 0;
    }

    @Override
    public double calcularCircunferencia(){
        return lado*4;
    }

    @Override
    public String toString(){
        return this.nome;
    }
    

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
