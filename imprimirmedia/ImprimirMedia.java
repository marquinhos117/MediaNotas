/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imprimirmedia;

/**
 *
 * @author Estudos
 */

import javax.swing.JOptionPane;

public class ImprimirMedia {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[5]; 
        
        for (int i = 0; i < alunos.length; i++) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do " + (i + 1) + "º aluno:");
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 1ª nota de " + nome + ":"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a 2ª nota de " + nome + ":"));

            alunos[i] = new Aluno(nome, nota1, nota2);
        }

        StringBuilder relatorio = new StringBuilder();
        relatorio.append("\t\tRELATÓRIO DE NOTAS\n");

        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = alunos[i];
            relatorio.append("\n")
                    .append(i + 1)
                    .append(" - ")
                    .append(aluno.getNome())
                    .append("\nNota 1: ")
                    .append(aluno.getNota1())
                    .append("\nNota 2: ")
                    .append(aluno.getNota2())
                    .append("\nMédia: ")
                    .append(aluno.calcularMedia())
                    .append("\n");
        }
        JOptionPane.showMessageDialog(null, relatorio.toString());
    }
}
