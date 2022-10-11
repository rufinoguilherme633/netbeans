package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDao { //Simular banco de dados
	
	//precisamos do PLano de saúde 
	//classe dao precisa do objeto que vai manipular
	
	private PlanoDeSaude planoDeSaude;
	//lista onde vai guarda// "banco de dados"
        // static vai ser compartilhada entre todos os objetos
	private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
	
	//construtor
	public PlanoDeSaudeDao(PlanoDeSaude planoDeSaude) {
		this.planos.add(planoDeSaude);
	}
	
	public PlanoDeSaudeDao() {
		
	}
	//deixar estâtico para não precisar criar instâncias
	public static void gravar (PlanoDeSaude planoDeSaude) {
		
		//grava o plano de saude no planos
		planos.add(planoDeSaude);
	}
	
	public static ArrayList<PlanoDeSaude> listarTodos() {
		//retorna a arreyLIst
		return planos;
	}
	
        
        public static  void criarPlanosDeSaudeTeste() {
            PlanoDeSaude p1 = new PlanoDeSaude("unimed", "bronze");
            PlanoDeSaude p2 = new PlanoDeSaude("unimed", "ouro");
            PlanoDeSaude p3 = new PlanoDeSaude("amil", "advenced");
            PlanoDeSaude p4 = new PlanoDeSaude("bradesco", "Exclusivo");
          
            planos.add(p1);
            planos.add(p2);
            planos.add(p3);
            planos.add(p4);
            
        }
            //vamos criar um método para retorna Defalt Tables Model
            //usando o método Defalt Tables Model
        public static DefaultTableModel getTableModel() {
            //Matriz Recebrá planos de saúde que serão utukzados na tabela (Jtable)
            Object[][] dados = new Object[planos.size()][3];
           //for eachh, para extrair cada objeto plano de saúde
          //arraList planos e separa cada dado na matriz dados
          int i = 0;
          for(PlanoDeSaude p: planos) {
              dados[i ][0] = p.getCodigo();
              dados[i ][1] = p.getOperadora();
              dados[i ][2] = p.getTipoDoPlano();
               
             i++;
          
          }
            //definir vetor com nomes da tabelas
            String[] titulo = {"Codigo","Nome da opradora","tipo do plano"};
           //criar o modelo que será utilizado pela Jtable para exibir os dados dos planos
           //o método a seguir pede um vetor de vetores e um vetor simples
           DefaultTableModel tableModel = new DefaultTableModel(dados, titulo);
           return tableModel;
     
        }


}
          
        
