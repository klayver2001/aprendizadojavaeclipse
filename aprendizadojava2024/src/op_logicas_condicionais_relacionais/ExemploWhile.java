package op_logicas_condicionais_relacionais;

/**
 * Exemplo de uso da estrutura de repetição while em Java. Este programa imprime
 * os números de 1 a 5 usando um loop while.
 * 
 * @author SuperAdmin
 */
public class ExemploWhile {

	public static void main(String[] args) {
		int contador = 1; // Inicializa o contador

		// Enquanto o contador for menor ou igual a 10000, imprime o valor do contador e
		// incrementa-o
		while (contador <= 10000) {
			System.out.println("A contagem atual: " + contador);
			contador++; // Incrementa o contador
		}
	}
}
