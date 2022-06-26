package br.com.infnet.projetofinaldois.empresaAcme;

public class Endereco {
    private String logradouro;
    private String cidade;
    private String numero;
    private String cep;
    private String bairro;

    public Endereco() {
    }

    public Endereco(String logradouro, String cidade, String numero, String cep, String bairro) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
