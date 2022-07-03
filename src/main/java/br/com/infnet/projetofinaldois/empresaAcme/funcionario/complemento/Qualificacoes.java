package br.com.infnet.projetofinaldois.empresaAcme.funcionario.complemento;

public class Qualificacoes {
    private boolean mestrado;
    private int notaMestrado;
    private boolean doutorado;
    private int notaDoutorado;
    private boolean ehMenorDe50Anos;
    private boolean fluenteEmIngles;

    public Qualificacoes() {
    }

    public Qualificacoes(boolean temMestrado, int notaMestrado, boolean doutorado, int notaDoutorado, boolean ehMenorDe50Anos, boolean fluenteEmIngles) {
        this.mestrado = temMestrado;
        this.notaMestrado = notaMestrado;
        this.doutorado = doutorado;
        this.notaDoutorado = notaDoutorado;
        this.ehMenorDe50Anos = ehMenorDe50Anos;
        this.fluenteEmIngles = fluenteEmIngles;
    }

    public boolean verificarQualificacoesParaTrabalharFora(){
        if(!this.fluenteEmIngles()) {
            return false;
        }
        if(!this.ehMenorDe50Anos()) {
            return false;
        }
        if(!this.mestrado() && this.getNotaMestrado()<7) {
            return false;
        }
        if(!this.doutorado() && this.getNotaDoutorado()<7) {
            return false;
        }

        return true;
    }

    public boolean mestrado() {
        return mestrado;
    }

    public int getNotaMestrado() {
        return notaMestrado;
    }

    public boolean doutorado() {
        return doutorado;
    }

    public int getNotaDoutorado() {
        return notaDoutorado;
    }

    public boolean ehMenorDe50Anos() {
        return ehMenorDe50Anos;
    }

    public boolean fluenteEmIngles() {
        return fluenteEmIngles;
    }
}
