/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() { return lado1; }
    public void setLado1(double lado1) { this.lado1 = lado1; }

    public double getLado2() { return lado2; }
    public void setLado2(double lado2) { this.lado2 = lado2; }

    public double getLado3() { return lado3; }
    public void setLado3(double lado3) { this.lado3 = lado3; }

    public boolean ehValido() {
        return (lado1 + lado2 > lado3) &&
               (lado1 + lado3 > lado2) &&
               (lado2 + lado3 > lado1);
    }

    //fórmula de Heron
    public double calcularArea() {
        if (!ehValido()) {
            System.out.println("Triângulo inválido!");
            return 0;
        }
        double p = (lado1 + lado2 + lado3) / 2.0; // semiperímetro
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }

    public void exibirInformacoes() {
        if (ehValido()) {
            System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
            System.out.println("Área: " + calcularArea());
        } else {
            System.out.println("Não é um triângulo válido.");
        }
    }
}

