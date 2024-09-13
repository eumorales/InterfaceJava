package com.gilbertomorales.Trabalho;

public abstract class Usuario {
    
    protected String nomeCompleto;
    protected String dataNascimento;
    protected String sexo;
    protected String CPF;
    protected String RG;
    protected String endereco;
    protected String estado;
    protected String telefone;
    protected String nomePai;
    protected String nomeMae;
    protected String nacionalidade;

    public Usuario(String nomeCompleto, String dataNascimento, String sexo, String CPF, String RG, String endereco, String estado, String telefone, String nomePai, String nomeMae, String nacionalidade) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.CPF = CPF;
        this.RG = RG;
        this.endereco = endereco;
        this.estado = estado;
        this.telefone = telefone;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.nacionalidade = nacionalidade;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public abstract void executaAcao();
    public abstract Object[] obterDados(); 
    
    
}




