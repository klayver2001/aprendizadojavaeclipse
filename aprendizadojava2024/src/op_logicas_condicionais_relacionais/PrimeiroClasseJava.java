package op_logicas_condicionais_relacionais;


public class PrimeiroClasseJava {
	/**
	 * Main é um método auto executável em Java
	 */
	public static void main(String[] args) {
		
		int mediaAluno = 70;
		String nome = "JJ";
		
		if (mediaAluno >= 70 && nome.equals(nome) ) {
			System.out.println("Parabéns aprovado");
		}
		else if (mediaAluno < 70 && nome.equals(nome)) {
			System.out.println("Reprovado !");
		}
		else {
			System.out.println("Aluno não encontrado #");
		}
	}	
}
