package br.com.infnet.projetofinaldois.empresaAcme;

import java.time.Year;

public class Engenheiro extends Funcionario implements DadosEngenheiro{
    private Long matricula;
    private String numeroConselho;
    public Qualificacoes qualificacoes;

    public Engenheiro(GrupoSanuineo grupoSanguineo) {
        super(grupoSanguineo);
        this.qualificacoes = new Qualificacoes();
    }

    public Engenheiro(GrupoSanuineo grupoSanguineo, Qualificacoes qualificacoes) {
        super(grupoSanguineo);
        this.qualificacoes = qualificacoes;
    }

    @Override
    public Double calculaBonusEngenheiro() {
        return getAnosDeServico() * 3.7;
    }

    @Override
    public void setNumeroConselho(String numeroConselho) {
        this.numeroConselho = numeroConselho;
    }

    @Override
    public String getNumeroConselho() {
        return numeroConselho + Year.now().getValue();
    }

    public boolean verificaQualificacoesParaTrabalhoFora(){
        if(!qualificacoes.fluenteEmIngles()) {
            return false;
        }
        if(!qualificacoes.ehMenorDe50Anos()) {
            return false;
        }
        if(!qualificacoes.mestrado() && qualificacoes.getNotaMestrado()<7) {
            return false;
        }
        if(!qualificacoes.doutorado() && qualificacoes.getNotaDoutorado()<7) {
            return false;
        }

        return true;
    }

}
