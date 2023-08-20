package br.com.Calculadora;

import java.util.Scanner;

public class CalculadoraGeo {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
           
            System.out.println("Escolha uma figura geométrica (Digite de 1 - 9):");
            System.out.println();
            System.out.println("1. Calcular Area do Quadrado");
            System.out.println("2. Calcular Area do Triangulo");
            System.out.println("3. Calcular Area do Trapezio");  
            System.out.println("4. Calcular Area do Circulo");    
        
            System.out.println("5. Calcular Perimetro do Quadrado: ");  
            System.out.println("6. Calcular Perimetro do Triangulo: ");  
            System.out.println("7. Calcular Perimetro do Trapezio: ");  
            System.out.println("8. Calcular Circunferencia do Circulo: ");  
            int escolha = scan.nextInt();
            FormaGeometrica forma = new FormaGeometrica();
            int formaescolhida=0;

            switch(escolha){
                case 1:
                        System.out.println("Digite o lado do Quadrado");
                        double ladoQuadrado=scan.nextDouble();
                        forma = new Quadrado(ladoQuadrado);
                        formaescolhida=1;
                break;
                case 2:
                        System.out.println("Digite o base do Triangulo");
                        double baseTriangulo=scan.nextDouble();
                        System.out.println("Digite a altura do Triangulo");
                        double alturaTriangulo =scan.nextDouble();
                        forma = new Triangulo(baseTriangulo, alturaTriangulo);
                        formaescolhida=1;
                break;
                case 3:
                        System.out.println("Digite o valor da base Maior do Trapezio: ");
                        double bmaiorTrapezio=scan.nextDouble();
                        System.out.println("Digite o valor da base Menor do Trapezio: ");
                        double bmenorTrapezio=scan.nextDouble();
                        System.out.println("Digite o valor da altura do Trapezio:  ");
                        double alturaTrapezio = scan.nextDouble();
                        forma = new Trapezio(bmaiorTrapezio, bmenorTrapezio, alturaTrapezio);
                        formaescolhida=1;
                break;
                case 4:
                        System.out.println("Digite o Raio do Circulo ");
                        double raioCirculo=scan.nextDouble();
                        forma = new Circulo(raioCirculo);
                        formaescolhida=1;
                break;
                case 5:
                        System.out.println("Digite o lado do Quadrado");
                        double ladoQuadradoP=scan.nextDouble();
                        forma = new Quadrado(ladoQuadradoP);
                        formaescolhida=2;
                break;
                case 6:
                        System.out.println("Digite o primeiro lado do Triangulo");
                        double lado1Triangulo=scan.nextDouble();
                        System.out.println("Digite o segundo lado do Triangulo");
                        double lado2Triangulo=scan.nextDouble();
                        System.out.println("Digite o terceiro lado do Triangulo");
                        double lado3Triangulo=scan.nextDouble();
                        forma = new Triangulo(lado1Triangulo, lado2Triangulo, lado3Triangulo);
                        formaescolhida=2;
                break;
                case 7:
                        System.out.println("Digite o valor da base Maior do Trapezio: ");
                        double bmaiorTrapezioP=scan.nextDouble();
                        System.out.println("Digite o valor da base Menor do Trapezio: ");
                        double bmenorTrapezioP=scan.nextDouble();
                        System.out.println("Digite o valor do primeiro lado do Trapezio:  ");
                        double lado1Trapezio = scan.nextDouble();
                        System.out.println("Digite o valor do primeiro lado do Trapezio:  ");
                        double lado2Trapezio = scan.nextDouble();
                        forma = new Trapezio(lado1Trapezio, lado2Trapezio, bmaiorTrapezioP, bmenorTrapezioP);
                        formaescolhida=2;
                break;
                case 8:
                        System.out.println("Digite o Raio do Circulo ");
                        double raioCirculoC=scan.nextDouble();
                        forma = new Circulo(raioCirculoC);
                        formaescolhida=3;
                break;
                default:
                        System.out.println();
                break;
            }
            if (formaescolhida == 1 ){
                            System.out.println("Area da Forma: " + forma.getClass().toString()  + " = " + forma.calcularArea());
            } else if (formaescolhida == 2){
                System.out.println(" "+ forma.calcularPerimetro());
            } else {
                System.out.println(" s" + forma.calcularCircunferencia());
            }
            scan.close();

        }
}
