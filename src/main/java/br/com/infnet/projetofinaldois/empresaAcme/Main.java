package br.com.infnet.projetofinaldois.empresaAcme;

import br.com.infnet.projetofinaldois.empresaAcme.curso.Curso;
import br.com.infnet.projetofinaldois.empresaAcme.funcionario.Engenheiro;
import br.com.infnet.projetofinaldois.empresaAcme.funcionario.Vendedor;
import br.com.infnet.projetofinaldois.empresaAcme.funcionario.complemento.Endereco;
import br.com.infnet.projetofinaldois.empresaAcme.funcionario.complemento.GrupoSanuineo;
import br.com.infnet.projetofinaldois.empresaAcme.funcionario.complemento.Qualificacoes;

public class Main {
    public static void main(String[] args) {
        //Engenheiro
        Endereco enderecoEng = new Endereco(
                "Rua A", "Rio de Janeiro", "RJ",
                "55", "2000280", "Centro");
        Qualificacoes qualificacoes = new Qualificacoes(true, 8, true, 9, true, true);
        Engenheiro engenheiro = new Engenheiro(GrupoSanuineo.A, enderecoEng,qualificacoes);
        System.out.println(engenheiro.qualificacoes.verificarQualificacoesParaTrabalharFora());

        engenheiro.setAnoDeInicio(2012);
        engenheiro.setNumeroConselho("123456789");
        System.out.println(engenheiro.getNumeroConselho());
        engenheiro.setAnoDeInicio(2011);
        System.out.println(engenheiro.calculaBonusEngenheiro());

        //Funcionario
        Endereco enderecoVendedor = new Endereco(
                "Rua A", "Rio de Janeiro", "RJ",
                "55", "2000280", "Centro");
        Curso cursoJava = new Curso("Java", 8);
        Curso cursoC= new Curso("C", 9);
        Curso cursoPhp = new Curso("PHP", 10);
        Curso cursoAngular = new Curso("Angular", 6);

        Vendedor vendedor = new Vendedor(GrupoSanuineo.A, enderecoVendedor);
        vendedor.setCursos(cursoJava);
        vendedor.setCursos(cursoPhp);
        vendedor.setCursos(cursoC);
        vendedor.setCursos(cursoAngular);
        vendedor.imprimirCursos();
        vendedor.setQuantidadeDeVendas(40);
        System.out.println(vendedor.isPlatinumEBateuMeta(true));

    }
}
