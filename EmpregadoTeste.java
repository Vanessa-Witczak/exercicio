/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class EmpregadoTeste {
    public static void main(String[] args) {
        // Criando dois empregados
        Empregado emp1 = new Empregado("Helena", "Silva", 2500.00);
        Empregado emp2 = new Empregado("Carlos", "Oliveira", 3200.00);

        // Exibindo salário anual original
        System.out.println("Salário anual de " + emp1.getNome() + " " + emp1.getSobrenome() + ": R$ " + emp1.calcularSalarioAnual());
        System.out.println("Salário anual de " + emp2.getNome() + " " + emp2.getSobrenome() + ": R$ " + emp2.calcularSalarioAnual());

        // Aplicando aumento de 10%
        emp1.setSalarioMensal(emp1.getSalarioMensal() * 1.10);
        emp2.setSalarioMensal(emp2.getSalarioMensal() * 1.10);

        // Exibindo salário anual após aumento
        System.out.println("\nApós aumento de 10%:");
        System.out.println("Novo salário anual de " + emp1.getNome() + ": R$ " + emp1.calcularSalarioAnual());
        System.out.println("Novo salário anual de " + emp2.getNome() + ": R$ " + emp2.calcularSalarioAnual());
    }
}
