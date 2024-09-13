package com.gilbertomorales.Prova;

import javax.swing.JOptionPane;

public class Carro extends Veiculo {

    // Variaveis do carro
    
    private String numeroPortas;
    private String capacidade;

    // Construtor
    
    public Carro(String valor, String modelo, String marca, String anoFabricacao, String tipoCombustivel, String placa, String numeroPortas, String capacidade) {
        super(valor, modelo, marca, anoFabricacao, tipoCombustivel, placa);
        this.numeroPortas = numeroPortas;
        this.capacidade = capacidade;
    }

    // Getter e Setters
    
    public String getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(String numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    
    // Mensagem ao confirmar
    
    @Override
    public void calculaImposto() {
        
        JOptionPane.showMessageDialog(null, "Carro inserido! Imposto: Valor base + Adicional por ano", "salvo", JOptionPane.OK_OPTION);
        
    }

    // Retorna os dados do objeto (carro)
    
    @Override
    public Object[] obterDados() {
        return new Object[] {valor, modelo, marca, anoFabricacao, tipoCombustivel, placa, numeroPortas, capacidade};
    }
    
    
    
}
