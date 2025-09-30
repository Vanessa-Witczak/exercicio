/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Conta {
    protected String nomeCliente;
    protected String numConta;
    protected double saldo;

    public Conta(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void mostrarDados() {
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Conta: " + numConta);
        System.out.println("Saldo: R$ " + saldo);
    }
}

