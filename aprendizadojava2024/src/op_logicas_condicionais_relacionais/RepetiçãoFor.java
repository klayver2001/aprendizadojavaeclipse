package op_logicas_condicionais_relacionais;

public class RepetiçãoFor {

	public static void main(String[] args) {
		 
		/* Estrutura de repeticao FOR */
		for (int numero = 0; numero <= 10; numero ++) {
			System.out.println("Numero atual é : " + numero);
		}
		
		for (int numero=10; numero >= 0; numero --) {		
			System.out.println("Numero atual é : " + numero);
		}
		
		// Estrutura de repeticao FOR e BREAK
		for (int numero = 7;numero >= 0; numero ++) {
			if (numero == 7) {
				System.out.println("Oba");
				System.out.println("Para de executar...");
				break;
			
			}
		}
		
		// Estrutura de repeticao FOR e Continue
			
		for (int numero = 0;numero <= 11; numero ++) {
			if (numero == 7 || numero == 8  || numero == 9 || numero == 10) {
				System.out.println("Oba, encontrei o numero " +numero);
				continue;
				}
			System.out.println("Processando laço de repetição");
		}
	}
}
	
