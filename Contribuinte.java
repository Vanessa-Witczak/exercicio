/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public abstract class Contribuinte {
    protected String nome;
    protected double rendaBruta;

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public abstract double calcularImposto();

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Renda Bruta: R$ " + rendaBruta);
        System.out.println("Imposto a pagar: R$ " + calcularImposto());
        System.out.println("-----------------------------");
    }
}
