package br.com.Calculadora;

public class Trapezio  extends FormaGeometrica {

    double lado1,lado2,baseMaior,baseMenor,altura;
    private String nome= "Trapezio";

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public Trapezio(double lado1, double lado2, double baseMaior, double baseMenor) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
    }

    @Override
    public double calcularArea(){
        return (((baseMaior+baseMenor) *altura) / 2);
    }

    @Override
    public double calcularPerimetro(){
        return baseMaior+baseMenor+lado1+lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    
    
}
