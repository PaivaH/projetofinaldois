package br.com.infnet.projetofinaldois.empresaAcme;

public class Main {
    public static void main(String[] args) {
        Qualificacoes qualificacoes = new Qualificacoes(true, 8, true, 9, true, true);
        Engenheiro engenheiro = new Engenheiro(GrupoSanuineo.A, qualificacoes);
        System.out.println(engenheiro.verificaQualificacoesParaTrabalhoFora());

        engenheiro.setNumeroConselho("163.182.567/");
        engenheiro.setAnoDeInicio(2011);
        System.out.println(engenheiro.calculaBonusEngenheiro());
    }
}
