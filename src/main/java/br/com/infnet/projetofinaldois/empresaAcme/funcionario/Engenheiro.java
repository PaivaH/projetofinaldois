package br.com.infnet.projetofinaldois.empresaAcme.funcionario;

import br.com.infnet.projetofinaldois.empresaAcme.funcionario.complemento.DadosEngenheiro;
import br.com.infnet.projetofinaldois.empresaAcme.funcionario.complemento.Endereco;
import br.com.infnet.projetofinaldois.empresaAcme.funcionario.complemento.GrupoSanuineo;
import br.com.infnet.projetofinaldois.empresaAcme.funcionario.complemento.Qualificacoes;

import java.time.Year;

public class Engenheiro extends Funcionario implements DadosEngenheiro {
    private Long matricula;
    private String numeroConselho;
    public Qualificacoes qualificacoes;

    public Engenheiro(GrupoSanuineo grupoSanguineo, Endereco endereco) {
        super(grupoSanguineo, endereco);
        this.qualificacoes = new Qualificacoes();
    }

    public Engenheiro(GrupoSanuineo grupoSanguineo, Endereco endereco, Qualificacoes qualificacoes) {
        super(grupoSanguineo, endereco);
        this.qualificacoes = qualificacoes;
    }

    @Override
    public Double calculaBonusEngenheiro() {
        return getAnosDeServico() * 3.7;
    }

    @Override
    public void setNumeroConselho(String numeroConselho) {
        this.numeroConselho = numeroConselho + "/" + this.getAnoDeInicio();
    }

    @Override
    public String getNumeroConselho() {
        return numeroConselho ;
    }

}
