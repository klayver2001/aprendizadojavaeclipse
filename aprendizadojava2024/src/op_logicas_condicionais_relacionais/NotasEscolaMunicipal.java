package op_logicas_condicionais_relacionais;

import javax.swing.JOptionPane;

public class NotasEscolaMunicipal {

	public static void main(String[] args) {
		
		String notaUm = JOptionPane.showInputDialog("Informe a 1º nota: ");
		String notaDois = JOptionPane.showInputDialog("Informe a 2º nota: ");
		String notaTres = JOptionPane.showInputDialog("Informe a 3º nota: ");
		String notaQuatro = JOptionPane.showInputDialog("Informe a 4º nota: ");
		
		
		
		double nota1 = Double.parseDouble(notaUm);
		double nota2 = Double.parseDouble(notaDois);
		double nota3 = Double.parseDouble(notaTres);
		double nota4 = Double.parseDouble(notaQuatro);
		
		double mediaNotas= (nota1 + nota2 + nota3 + nota4) / 4 ;		
		
		// Média para aprovação é 70 
		
		if (mediaNotas >= 50) {
			if (mediaNotas >= 70 ) {
				JOptionPane.showMessageDialog(null, "Aluno está aprovado com média de: " + mediaNotas);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com média de: " + mediaNotas);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno está reprovado com média de:  " + mediaNotas);	
		} 
		
		
	
		
		
		
	}

}
