package condicionais;


/**
 * @author Klayver Alencar
 */
public class OperadorLogicoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1 = 90;
		double nota2 = 80;
		double nota3 = 40;
		double nota4 = 90;
		double media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		
		/**
		 * Condições lógicas com IF e ELSE
		 * 
		 */
		if (media >=70 ) {
			System.out.println("Aluno aprovado, " + "Média:" + media);
		}else if (media >=40 && media <=69 ) {
			System.out.println("Aluno em recuperação: "+ "Média:" + media);
		}
		else {
			System.out.println("Aluno reprovado, " + "Média:" + media);
		}
		
		/**
		 * Operadores ternários são para micro validações
		 */
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "Aluno aprovado" : "Reprovado";
		
		System.out.println(saidaResultado);
		
	}

}
