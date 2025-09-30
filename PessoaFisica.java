/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class PessoaFisica extends Contribuinte {
    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public double calcularImposto() {
        if (rendaBruta <= 1400) {
            return 0;
        } else if (rendaBruta <= 2100) {
            return (rendaBruta * 0.10) - 100;
        } else if (rendaBruta <= 2800) {
            return (rendaBruta * 0.15) - 270;
        } else if (rendaBruta <= 3600) {
            return (rendaBruta * 0.25) - 500;
        } else {
            return (rendaBruta * 0.30) - 700;
        }
    }
}