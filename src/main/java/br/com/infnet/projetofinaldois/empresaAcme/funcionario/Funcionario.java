package br.com.infnet.projetofinaldois.empresaAcme.funcionario;

import br.com.infnet.projetofinaldois.empresaAcme.funcionario.complemento.Endereco;
import br.com.infnet.projetofinaldois.empresaAcme.funcionario.complemento.GrupoSanuineo;

import java.time.Year;

abstract class Funcionario {
    private String id;
    private String nome;
    private String sobrenome;
    private int anoDeInicio;

    private GrupoSanuineo grupoSanguineo;
    private Endereco endereco;

    //Construtores
    public Funcionario(GrupoSanuineo grupoSanguineo, Endereco endereco) {
        this.grupoSanguineo = grupoSanguineo;
        this.endereco = endereco;
    }

    public Funcionario(GrupoSanuineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
        this.endereco = new Endereco();
    }

    //Getters e Setters
    public int getAnoDeInicio() {
        return anoDeInicio;
    }

    public void setAnoDeInicio(int anoDeInicio) {
        this.anoDeInicio = anoDeInicio;
    }

    public int getAnosDeServico() {
        return Year.now().getValue() - this.getAnoDeInicio();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
