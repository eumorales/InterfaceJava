
package com.gilbertomorales.Trabalho;

import javax.swing.JOptionPane;

public class Aluno extends Usuario{

    private String matriculaAluno;
    private String curso;
    
    public Aluno(String nomeCompleto, String dataNascimento, String sexo, String CPF, String RG, String endereco, String estado, String telefone, String nomePai, String nomeMae, String nacionalidade, String matriculaAluno, String curso) {
        super(nomeCompleto, dataNascimento, sexo, CPF, RG, endereco, estado, telefone, nomePai, nomeMae, nacionalidade);
        this.matriculaAluno = matriculaAluno;
        this.curso = curso;
        
    }

    @Override
    public void executaAcao() {
        JOptionPane.showMessageDialog(null, "O professor " + nomeCompleto + " foi inserido.", "salvo", JOptionPane.OK_OPTION);
    }

    @Override
    public Object[] obterDados() {
        
        return new Object[] {nomeCompleto, dataNascimento, sexo, CPF, RG, endereco, estado, telefone, nomePai, nomeMae, nacionalidade, matriculaAluno, curso};
        
   }
    
}
