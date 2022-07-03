package br.com.infnet.projetofinaldois.calculadora;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CalculadoraDistancia {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public CalculadoraDistancia() {
    }

    public CalculadoraDistancia(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void receberValoresPeloTerminal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite x1:");
        x1 = scanner.nextInt();
        System.out.println("Digite x2:");
        x2 = scanner.nextInt();
        System.out.println("Digite y1:");
        y1 = scanner.nextInt();
        System.out.println("Digite y2:");
        y2 = scanner.nextInt();
        scanner.close();
    }

    public Double formatarDecimal(Double numero){
        NumberFormat formatter = new DecimalFormat("#0.0000");
        return Double.valueOf(formatter.format(numero));
    }

    public Double calcularDistancia() {
        double resultado = Math.sqrt(
                Math.pow((x2 - x1), 2) +  Math.pow((y2 - y1), 2)
        );
        return formatarDecimal(resultado);
    }

    public void imprimirCalculo() {
        System.out.println(calcularDistancia());
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
