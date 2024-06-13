package op_logicas_condicionais_relacionais;

// 
/**
 * @author SuperAdminTwo
 */
public class OperacaoLogicaAninhada {
	
	/**
	 * 	Método MAIN que gera o autoexecutavel java 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1 = 90;
		double nota2 = 90;
		double nota3 = 90;
		double nota4 = 91;
		double media = 0;
		// TODO Gera media de notas 
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		String resultadoAprovado = "Aluno foi aprovado, parabéns !";
		
		String resultadoRecuperacao = "Em recuperacao, mais uma chance de recuperar sua nota !";
		
		String resultadoReprovado = "Aluno reprovado, precisa dedicar mais !";
		
		// Gera condições IF e ELSE aninhadas de acordo com a necessidade das regras de negócio.
		if (media >= 50 ) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Parabéns já está aprovado direto");
				}else {
					System.out.println(resultadoAprovado);
				}
			}else {
				System.out.println(resultadoRecuperacao);
			}
		}else {
			System.out.println(resultadoReprovado);
		}
		
		
	}
}	