/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroresponsavel.ui;

import cadastroresponsavel.controller.AlunoController;
import cadastroresponsavel.model.Aluno;
import cadastroresponsavel.model.Responsavel;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Laura
 */
public class RelatorioHelper {
    public void gerarRelatorioResponsavel() {
        try {
            //obtem os dados
           
           HashMap<String, Object> params = 
                    new HashMap<String, Object>();

            JRBeanCollectionDataSource dt = 
                new JRBeanCollectionDataSource();
        
            //Encontra o layout do relatório
            InputStream in = this.getClass().getClassLoader()
                    .getResourceAsStream("RelatorioResponsaveis.jrxml");
            //Compila o layout               
            JasperReport jasperReport = JasperCompileManager
                    .compileReport(in);
            //Gera o relatório com os dados dos objetos  
            JasperPrint jasperPrint = JasperFillManager
                    .fillReport(jasperReport, params, dt);
            //Abre o visualizador do JasperReport
            JasperViewer.viewReport(jasperPrint, false);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
     public void gerarRelatorioAlunos() {
        try {
            //obtem os dados
            AlunoController ac = new AlunoController();
            List<Aluno> alunos = ac.visualizarAlunos();
            HashMap<String, Object> params = 
                    new HashMap<String, Object>();

            JRBeanCollectionDataSource dt = 
                new JRBeanCollectionDataSource(alunos);
        
            //Encontra o layout do relatório
            InputStream in = this.getClass().getClassLoader()
                    .getResourceAsStream("relatorioAlunos.jrxml");
            //Compila o layout               
            JasperReport jasperReport = JasperCompileManager
                    .compileReport(in);
            //Gera o relatório com os dados dos objetos  
            JasperPrint jasperPrint = JasperFillManager
                    .fillReport(jasperReport, params, dt);
            //Abre o visualizador do JasperReport
            JasperViewer.viewReport(jasperPrint, false);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

    

