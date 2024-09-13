
package com.gilbertomorales.Prova;

public abstract class Veiculo {
    
    // Variaveis
    
    protected String valor;
    protected String modelo;
    protected String marca;
    protected String anoFabricacao;
    protected String tipoCombustivel;
    protected String placa;

    // Construtor
    
    public Veiculo(String valor, String modelo, String marca, String anoFabricacao, String tipoCombustivel, String placa) {
        this.valor = valor;
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.tipoCombustivel = tipoCombustivel;
        this.placa = placa;
    }

    // Getters e Setters
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    // Funções abstratas
    public abstract void calculaImposto();
    public abstract Object[] obterDados(); 
    
    
    
    
}
