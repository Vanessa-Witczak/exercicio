/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class TesteContaBancaria {
    public static void main(String[] args) {
        // Criando contas
        ContaPoupanca poupanca = new ContaPoupanca("Afonso", "12345", 1000.00, 15);
        ContaEspecial especial = new ContaEspecial("Rodolfo", "67890", 500.00, 300.00);
        
        poupanca.sacar(200.00);
        especial.sacar(700.00); // dentro do limite
        
        poupanca.depositar(150.00);
        especial.depositar(100.00);
        
        poupanca.calcularNovoSaldo(5); // 5% de rendimento

        System.out.println("\n--- Conta Poupança ---");
        poupanca.mostrarDados();

        System.out.println("\n--- Conta Especial ---");
        especial.mostrarDados();
    }
}