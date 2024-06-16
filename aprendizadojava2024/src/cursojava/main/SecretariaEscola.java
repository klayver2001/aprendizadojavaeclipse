package cursojava.main;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class SecretariaEscola {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Nome : ");
		String idade = JOptionPane.showInputDialog("Idade do Aluno : ");
		String DataNascimento = JOptionPane.showInputDialog("Data de nascimento : ");
		String RegistroGeral = JOptionPane.showInputDialog("Registro Geral : ");
		String NumeroCpf = JOptionPane.showInputDialog("Número do CPF : ");
		String NomeMae = JOptionPane.showInputDialog("Nome da Mãe: ");
		String NomePai = JOptionPane.showInputDialog("Nome do Pai : ");
		String MatriculaId = JOptionPane.showInputDialog("Número da Matrícula : ");
		String DataMatricula = JOptionPane.showInputDialog("Data de Matrícula : ");
		String nota1 = JOptionPane.showInputDialog("1º Nota: ");
		String nota2 = JOptionPane.showInputDialog("2º Nota: ");
		String nota3 = JOptionPane.showInputDialog("3º Nota: ");
		String nota4 = JOptionPane.showInputDialog("4º Nota: ");
		
		// Cria instâncias dos alunos
		Aluno aluno245637 = new Aluno();
		aluno245637.setNome(nome);
		aluno245637.setIdade(Integer.valueOf(idade));
		aluno245637.setDataNascimento(DataNascimento);
		aluno245637.setRegistroGeral(RegistroGeral);
		aluno245637.setNumeroCpf(NumeroCpf);
		aluno245637.setNomeMae(NomeMae);
		aluno245637.setNomePai(NomePai);
		aluno245637.setMatriculaId(MatriculaId);
		aluno245637.setDataMatricula(DataMatricula);
		aluno245637.setNota1(Double.parseDouble(nota1));
		aluno245637.setNota2(Double.parseDouble(nota2));
		aluno245637.setNota3(Double.parseDouble(nota3));
		aluno245637.setNota4(Double.parseDouble(nota4));
		
		
		

		Aluno aluno245638 = new Aluno();
		aluno245638.setNome("Maria");
		aluno245638.setIdade(16);
		aluno245638.setDataNascimento("07/01/2008");
		aluno245638.setRegistroGeral("39.458");
		aluno245638.setNumeroCpf("588.478.789-78");
		aluno245638.setNomeMae("Filomena Cruz Barcellos");
		aluno245638.setNomePai("Antonio Severino Costa");
		aluno245638.setMatriculaId("123464");
		aluno245638.setDataMatricula("08/03/2024");

		Aluno aluno245639 = new Aluno();
		aluno245639.setNome("Adriel");
		aluno245639.setIdade(11);
		aluno245639.setDataNascimento("10/04/2013");
		aluno245639.setRegistroGeral("40.458");
		aluno245639.setNumeroCpf("878.456.789-28");
		aluno245639.setNomeMae("Gardene Da Conceição Gomes");
		aluno245639.setNomePai("Francisco Ribeiro Vieira");
		aluno245639.setMatriculaId("123478");
		aluno245639.setDataMatricula("14/06/2024");
		aluno245639.setNota1(90);
		aluno245639.setNota2(70);
		aluno245639.setNota3(78);
		aluno245639.setNota4(55);

		// Exibir informações dos alunos
		/*
		 * exibirInformacoesAluno(aluno245637); 
		 * 
		 * exibirInformacoesAluno(aluno245638);
		 * exibirInformacoesAluno(aluno245639);
		 */

	

	/*
	 * private static void exibirInformacoesAluno(Aluno aluno) {
	 * System.out.println("Informações do Aluno:"); System.out.println("Nome: " +
	 * aluno.getNome()); System.out.println("Sobrenome: " + aluno.getSobrenome());
	 * System.out.println("Idade: " + aluno.getIdade());
	 * System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
	 * System.out.println("Registro Geral: " + aluno.getRegistroGeral());
	 * System.out.println("Número CPF: " + aluno.getNumeroCpf());
	 * System.out.println("Nome da Mãe: " + aluno.getNomeMae());
	 * System.out.println("Nome do Pai: " + aluno.getNomePai());
	 * System.out.println("Matrícula ID: " + aluno.getMatriculaId());
	 * System.out.println("Data de Matrícula: " + aluno.getDataMatricula());
	 * System.out.println("Nota 1: " + aluno.getNota1());
	 * System.out.println("Nota 2: " + aluno.getNota2());
	 * System.out.println("Nota 3: " + aluno.getNota3());
	 * System.out.println("Nota 4: " + aluno.getNota4()); System.out.println(); //
	 * Chama o método de Media de notas que são atributos de aluno.java
	 * System.out.println("A média do aluno é: " + aluno.getMediaNotas()); // Chama
	 * o método getAlunoAprovado() System.out.println("Resultado = " +
	 * (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	 * System.out.println(repeat("-", 40)); }
	 */

	/*
	 * private static String repeat(String str, int times) { StringBuilder result =
	 * new StringBuilder(); for (int i = 0; i < times; i++) { result.append(str); }
	 * return result.toString(); }
	 */
		
		
	/*
	 * //Utilizando o método TOSTRING para retornar os valores
	 * System.out.println(toString.aluno245637);
	 */
	
		
	// equals e hashcode no java
	if (aluno245637.equals(aluno245638)) {
		System.out.println("ERROR: Alunos são iguais !");
	} else {
		System.out.println("Alunos não são iguais...");
	}
	
	
	}
}
