/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrenteTributavel cc = new ContaCorrenteTributavel(1000);
        ContaPoupancaTributavel cp = new ContaPoupancaTributavel(2000);
        SeguroDeVida sv = new SeguroDeVida();

        System.out.println("Saldo conta corrente: R$" + cc.obterSaldo());
        System.out.println("Tributo conta corrente: R$" + cc.calculaTributos());

        System.out.println("Saldo conta poupança: R$" + cp.obterSaldo());
        // não é tributável

        System.out.println("Tributo seguro de vida: R$" + sv.calculaTributos());
    }
}
