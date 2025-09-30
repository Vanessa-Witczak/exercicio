/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */

public class TesteContribuinte {
    public static void main(String[] args) {
        Contribuinte[] lista = new Contribuinte[6];

        // 3 Pessoas Jurídicas
        lista[0] = new PessoaJuridica("Empresa A", 5000.00);
        lista[1] = new PessoaJuridica("Empresa B", 12000.00);
        lista[2] = new PessoaJuridica("Empresa C", 8000.00);

        // 3 Pessoas Físicas
        lista[3] = new PessoaFisica("Ana", 1350.00);   // isenta
        lista[4] = new PessoaFisica("Carlos", 2500.00);    // faixa 15%
        lista[5] = new PessoaFisica("Afonso", 4000.00);       // faixa 30%

        // Mostrar dados
        for (Contribuinte c : lista) {
            c.mostrarDados();
        }
    }
}    

