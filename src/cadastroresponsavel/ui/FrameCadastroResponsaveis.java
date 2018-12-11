/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.ui;

import cadastroresponsavel.model.Aluno;
import cadastroresponsavel.model.Usuario;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Andre
 */
public class FrameCadastroResponsaveis extends javax.swing.JFrame {
    Usuario user = new Usuario();
    Aluno a = new Aluno();
    /**
     * Creates new form FrameCadastroResponsaveis
     */
    public FrameCadastroResponsaveis(Usuario u) {
        initComponents();
        user= u;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        bmBarraMenu = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mnCadastrarNovo = new javax.swing.JMenuItem();
        mnVisualizarAlunos = new javax.swing.JMenuItem();
        mnAlterarAlunos = new javax.swing.JMenuItem();
        mnRelatorios = new javax.swing.JMenu();
        mnRelatorioAlunos = new javax.swing.JMenuItem();
        mnRelatorioResponsaveisAluno = new javax.swing.JMenuItem();
        mnUsuario = new javax.swing.JMenu();
        mnCadastrarUsuario = new javax.swing.JMenuItem();
        mnAlterarSenha = new javax.swing.JMenuItem();
        mnSuperiorSair = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastro de Responsáveis");

        mnCadastro.setText("Aluno");

        mnCadastrarNovo.setText("Cadastrar novo...");
        mnCadastrarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarNovoActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCadastrarNovo);

        mnVisualizarAlunos.setText("Visualizar alunos...");
        mnVisualizarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVisualizarAlunosActionPerformed(evt);
            }
        });
        mnCadastro.add(mnVisualizarAlunos);

        mnAlterarAlunos.setText("Alterar cadastro...");
        mnAlterarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAlterarAlunosActionPerformed(evt);
            }
        });
        mnCadastro.add(mnAlterarAlunos);

        bmBarraMenu.add(mnCadastro);

        mnRelatorios.setText("Relatórios");

        mnRelatorioAlunos.setText("Relatório de alunos registrados");
        mnRelatorioAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRelatorioAlunosActionPerformed(evt);
            }
        });
        mnRelatorios.add(mnRelatorioAlunos);

        mnRelatorioResponsaveisAluno.setText("Relatório de responsáveis e alunos");
        mnRelatorios.add(mnRelatorioResponsaveisAluno);

        bmBarraMenu.add(mnRelatorios);

        mnUsuario.setText("Usuário");

        mnCadastrarUsuario.setText("Cadastrar novo...");
        mnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCadastrarUsuarioActionPerformed(evt);
            }
        });
        mnUsuario.add(mnCadastrarUsuario);

        mnAlterarSenha.setText("Alterar senha");
        mnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAlterarSenhaActionPerformed(evt);
            }
        });
        mnUsuario.add(mnAlterarSenha);

        bmBarraMenu.add(mnUsuario);

        mnSuperiorSair.setText("Sair");
        mnSuperiorSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSuperiorSairActionPerformed(evt);
            }
        });

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        mnSuperiorSair.add(mnSair);

        bmBarraMenu.add(mnSuperiorSair);

        setJMenuBar(bmBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnCadastrarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarNovoActionPerformed
        JPanel panel = new PanelCadastrarAluno();
        this.setContentPane(panel); 
        this.setSize(this.getPreferredSize());
    }//GEN-LAST:event_mnCadastrarNovoActionPerformed

    private void mnSuperiorSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSuperiorSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnSuperiorSairActionPerformed

    private void mnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCadastrarUsuarioActionPerformed
        JPanel panel = new PanelCadastrarUsuario();
        this.setContentPane(panel); 
        this.setSize(this.getPreferredSize());
    }//GEN-LAST:event_mnCadastrarUsuarioActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAlterarSenhaActionPerformed
       
        JPanel panel = new PanelAlterarSenha(user);
        this.setContentPane(panel); 
        this.setSize(this.getPreferredSize());
    }//GEN-LAST:event_mnAlterarSenhaActionPerformed

    private void mnVisualizarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVisualizarAlunosActionPerformed
        JPanel panel = new PanelVisualizarAlunos();
        this.setContentPane(panel); 
        this.setSize(this.getPreferredSize());
    }//GEN-LAST:event_mnVisualizarAlunosActionPerformed

    private void mnAlterarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAlterarAlunosActionPerformed
        JPanel panel = new PanelAlterarAluno(a);
        this.setContentPane(panel); 
        this.setSize(this.getPreferredSize());
    }//GEN-LAST:event_mnAlterarAlunosActionPerformed

    private void mnRelatorioAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRelatorioAlunosActionPerformed
        RelatorioHelper relatorio = new RelatorioHelper();
        relatorio.gerarRelatorioAlunos();
    }//GEN-LAST:event_mnRelatorioAlunosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar bmBarraMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mnAlterarAlunos;
    private javax.swing.JMenuItem mnAlterarSenha;
    private javax.swing.JMenuItem mnCadastrarNovo;
    private javax.swing.JMenuItem mnCadastrarUsuario;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuItem mnRelatorioAlunos;
    private javax.swing.JMenuItem mnRelatorioResponsaveisAluno;
    private javax.swing.JMenu mnRelatorios;
    private javax.swing.JMenuItem mnSair;
    private javax.swing.JMenu mnSuperiorSair;
    private javax.swing.JMenu mnUsuario;
    private javax.swing.JMenuItem mnVisualizarAlunos;
    // End of variables declaration//GEN-END:variables
}
