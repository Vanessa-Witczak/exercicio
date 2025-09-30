/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Calculadora {
    double n1, n2;

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double soma() {
        return n1 + n2;
    }

    public double subtracao() {
        return n1 - n2;
    }

    public double multiplicacao() {
        return n1 * n2;
    }

    public double divisao() {
        if (n2 == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return n1 / n2;
    }
}