
package com.gilbertomorales.Trabalho;

import javax.swing.JOptionPane;

public class Professor extends Usuario{

    private String matricula;
    private String areaFormacao;
    private String alocacao;
    
    public Professor(String nomeCompleto, String dataNascimento, String sexo, String CPF, String RG, String endereco, String estado, String telefone, String nomePai, String nomeMae, String nacionalidade, String matricula, String areaFormacao, String alocacao) {
        super(nomeCompleto, dataNascimento, sexo, CPF, RG, endereco, estado, telefone, nomePai, nomeMae, nacionalidade);
        this.matricula = matricula;
        this.areaFormacao = areaFormacao;
        this.alocacao = alocacao;
        
    }

    @Override
    public void executaAcao() {
        JOptionPane.showMessageDialog(null, "O professor " + nomeCompleto + " foi inserido.", "salvo", JOptionPane.OK_OPTION);
    }

    @Override
    public Object[] obterDados() {
        
        return new Object[] {nomeCompleto, dataNascimento, sexo, CPF, RG, endereco, estado, telefone, nomePai, nomeMae, nacionalidade, matricula, areaFormacao, alocacao};
        
   }
    
}
