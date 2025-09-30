/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private String profissao;

    
    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getProfissao() { return profissao; }
    public void setProfissao(String profissao) { this.profissao = profissao; }

    
    public int calcularAnosBissextos() {
        int anoAtual = java.time.Year.now().getValue();
        int anoNascimento = anoAtual - idade;
        int contador = 0;

        for (int ano = anoNascimento; ano <= anoAtual; ano++) {
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                contador++;
            }
        }
        return contador;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
        System.out.println("Já viveu em " + calcularAnosBissextos() + " anos bissextos.");
    }
   
}
