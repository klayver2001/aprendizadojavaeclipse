package op_logicas_condicionais_relacionais;

import javax.swing.JOptionPane;

public class EntradaEConfirmacao {

	public static void main(String[] args) {
		
		String  carros = JOptionPane.showInputDialog("Informe a quantidade de carros : ");
		String  pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas : ");	
		
		double carroQuantidade = Double.parseDouble(carros);
		double pessoaQuantidade =Double.parseDouble(pessoas);
		
		int divisao = (int) (carroQuantidade / pessoaQuantidade);
		
		double resto = carroQuantidade % pessoaQuantidade;
				
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para pessoas foram " + divisao);	
		}else {
			JOptionPane.showMessageDialog(null, "Certo ,  Você não deseja ver");
		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o Resto da divisão");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para pessoas foram " + divisao +  " carros e sobrou " +  resto  + " carros");	
		}else {
			JOptionPane.showMessageDialog(null, "Certo ,  Você não deseja ver nesse caso vamos encerrar a aplicação !");
		}
		
	}

}
