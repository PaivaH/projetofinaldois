package br.com.infnet.projetofinaldois.calculadora;

public class Main {
    public static void main(String[] args) {
        CalculadoraDistancia calculadora = new CalculadoraDistancia();
        calculadora.receberValoresPeloTerminal();
        calculadora.imprimirCalculo();
    }
}
