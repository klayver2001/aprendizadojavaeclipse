package op_logicas_condicionais_relacionais;

/**
 * Exemplo de uso de operadores relacionais em Java. Esta classe contempla todos
 * os operadores relacionais disponíveis em Java e fornece exemplos didáticos de
 * cada um.
 * 
 * @author SuperAdmin
 */
public class OperadoresRelacionais {

	public static void main(String[] args) {
		// Operadores relacionais em Java

		// Igual a (==): Verifica se os dois operandos são iguais
		int a = 5;
		int b = 5;
		System.out.println("a == b: " + (a == b)); // true

		// Diferente de (!=): Verifica se os dois operandos são diferentes
		int c = 10;
		int d = 5;
		System.out.println("c != d: " + (c != d)); // true

		// Maior que (>): Verifica se o operando da esquerda é maior que o da direita
		int e = 10;
		int f = 5;
		System.out.println("e > f: " + (e > f)); // true

		// Maior ou igual a (>=): Verifica se o operando da esquerda é maior ou igual ao
		// da direita
		int g = 10;
		int h = 10;
		System.out.println("g >= h: " + (g >= h)); // true

		// Menor que (<): Verifica se o operando da esquerda é menor que o da direita
		int i = 5;
		int j = 10;
		System.out.println("i < j: " + (i < j)); // true

		// Menor ou igual a (<=): Verifica se o operando da esquerda é menor ou igual ao
		// da direita
		int k = 10;
		int l = 10;
		System.out.println("k <= l: " + (k <= l)); // true
	}
}
