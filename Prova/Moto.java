package com.gilbertomorales.Prova;

import javax.swing.JOptionPane;

public class Moto extends Veiculo {

    // Variaveis da moto
    
    private String cilindradas;
    private String tipoTransmissao;

    // Construtor
    
    public Moto(String valor, String modelo, String marca, String anoFabricacao, String tipoCombustivel, String placa, String cilindradas, String tipoTransmissao) {
        super(valor, modelo, marca, anoFabricacao, tipoCombustivel, placa);
        this.cilindradas = cilindradas;
        this.tipoTransmissao = tipoTransmissao;
    }

    // Getters e Setters
    
    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoTransmissao() {
        return tipoTransmissao;
    }

    public void setTipoTransmissao(String tipoTransmissao) {
        this.tipoTransmissao = tipoTransmissao;
    }
    
    // Mensagem ao confirmar
    
    @Override
    public void calculaImposto() {
        
        JOptionPane.showMessageDialog(null, "Moto inserida! Imposto: Valor base + Adicional por cilindrada", "salvo", JOptionPane.OK_OPTION);
        
    }

    // Retorna os dados do objeto (moto)
    
    @Override
    public Object[] obterDados() {
        return new Object[] {valor, modelo, marca, anoFabricacao, tipoCombustivel, placa, cilindradas, tipoTransmissao};
    }
    
    
    
}
