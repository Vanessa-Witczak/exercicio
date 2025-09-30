/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ContaCorrenteTributavel extends ContaBaseTributavel implements Tributavel {
    public ContaCorrenteTributavel(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public double calculaTributos() {
        return saldo * 0.01; // 1% do saldo
    }
}

