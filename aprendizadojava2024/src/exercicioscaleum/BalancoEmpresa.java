package exercicioscaleum;

import java.text.NumberFormat;
import java.util.Locale;


public class BalancoEmpresa {

	public static void main(String[] args) {
		// Valores de despesas do primeiro trimestre
		double despesaJaneiro = 15000.0;
		double despesaFevereiro= 23000.0;
		double despesaMarco= 17000.0;
		
		// Calcula o total de despesas do primeiro trimestre
		double despesaTotalTrimestre = despesaJaneiro + despesaFevereiro + despesaMarco;
		
		// Calcula a média das despesas mensais
		double mediaDespesaMensal = (despesaJaneiro + despesaFevereiro + despesaMarco)/ 3;
		
		//Formata os números para o padrão pt-BR
		Locale localeBR = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
;		NumberFormat numeroFormatado = NumberFormat.getInstance(localeBR);
		numeroFormatado.setMaximumFractionDigits(2);
		
		
		System.out.println("Despesa Total do Trimestre: " + numeroFormatado.format(despesaTotalTrimestre));
		System.out.println("Média Despesa Mensal: " + numeroFormatado.format(mediaDespesaMensal));
		
	}

}
