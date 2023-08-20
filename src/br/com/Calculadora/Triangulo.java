package br.com.Calculadora;

public class Triangulo extends FormaGeometrica{
    
    double base, altura, lado1, lado2, lado3;
    private String nome="Triangulo";

    public Triangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    public Triangulo(double lado1,double lado2, double lado3){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
    }

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }
    
    public double calcularPerimetro(){
        return lado1+lado2+lado3;
    }
    @Override
    public String toString(){
        return "";
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    


}
