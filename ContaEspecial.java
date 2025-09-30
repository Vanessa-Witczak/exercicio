/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
        } else {
            System.out.println("Limite excedido. Saque não permitido.");
        }
    }
}