package br.com.infnet.projetofinaldois.empresaAcme.funcionario;

import br.com.infnet.projetofinaldois.empresaAcme.curso.Curso;
import br.com.infnet.projetofinaldois.empresaAcme.funcionario.complemento.Endereco;
import br.com.infnet.projetofinaldois.empresaAcme.funcionario.complemento.GrupoSanuineo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Vendedor extends Funcionario{
    private Long matricula;
    private int quantidadeDeVendas;
    private Curso curso;

    private List<Curso> cursos;

    public Vendedor(GrupoSanuineo grupoSanguineo) {
        super(grupoSanguineo);
        this.cursos = new ArrayList<>();
    }

    public Vendedor(GrupoSanuineo grupoSanguineo, Endereco endereco) {
        super(grupoSanguineo, endereco);
        this.cursos = new ArrayList<>();
    }

    public List<Curso> getCursos() {
        return this.cursos;
    }

    public void setCursos(Curso curso) {
        this.cursos.add(curso);
    }

    public void imprimirCursos() {
        getCursos().forEach((Curso c) -> {
            System.out.println("Nome: " + c.getNome() + " | Nota: " + c.getNota());
        });
    }

    public boolean isPlatinumEBateuMeta(Boolean metaBatida){
        boolean isPlatinum = false;
        int quantidadeDeCursos = this.cursos.size();
        if(quantidadeDeVendas > 35 && quantidadeDeCursos > 3 && metaBatida){
            isPlatinum = true;
        }
        return  isPlatinum;
    }
    public Integer getQuantidadeEmpregadosFabrica(){
        return 34;
    }

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }
}
