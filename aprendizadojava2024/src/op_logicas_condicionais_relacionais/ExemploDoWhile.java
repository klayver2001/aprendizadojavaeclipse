package op_logicas_condicionais_relacionais;

/**
 * Exemplo de uso da estrutura de repetição do-while em Java. Este programa
 * imprime os números de 1 a 5 usando um loop do-while.
 * 
 * @author SuperAdmin
 */
public class ExemploDoWhile {

	public static void main(String[] args) {
		int contador = 1; // Inicializa o contador

		// Imprime o valor do contador e incrementa-o, enquanto o contador for menor ou
		// igual a 100
		do {
			System.out.println("Contador: " + contador);
			contador++; // Incrementa o contador
		} while (contador <= 100);
	}
}
