package cursojava.main;

import cursojava.classes.Aluno;

public class SecretariaEscola {

	public static void main(String[] args) {

		// Cria instâncias dos alunos
		Aluno aluno245637 = new Aluno();
		aluno245637.setNome("João");
		aluno245637.setSobrenome("Vinicius Pereira");
		aluno245637.setIdade(15);
		aluno245637.setDataNascimento("20/03/2009");
		aluno245637.setRegistroGeral("48.878");
		aluno245637.setNumeroCpf("798.451.256-78");
		aluno245637.setNomeMae("Joana Andrade Santos");
		aluno245637.setNomePai("Francisco Costa Silva");
		aluno245637.setMatriculaId("123456");
		aluno245637.setDataMatricula("03/01/2024");

		Aluno aluno245638 = new Aluno();
		aluno245638.setNome("Maria");
		aluno245638.setSobrenome("Fernanda Lima");
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
		aluno245639.setSobrenome("Benjamin Gomes Vieira");
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
		exibirInformacoesAluno(aluno245637);
		exibirInformacoesAluno(aluno245638);
		exibirInformacoesAluno(aluno245639);

	}

	private static void exibirInformacoesAluno(Aluno aluno) {
		System.out.println("Informações do Aluno:");
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Sobrenome: " + aluno.getSobrenome());
		System.out.println("Idade: " + aluno.getIdade());
		System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
		System.out.println("Registro Geral: " + aluno.getRegistroGeral());
		System.out.println("Número CPF: " + aluno.getNumeroCpf());
		System.out.println("Nome da Mãe: " + aluno.getNomeMae());
		System.out.println("Nome do Pai: " + aluno.getNomePai());
		System.out.println("Matrícula ID: " + aluno.getMatriculaId());
		System.out.println("Data de Matrícula: " + aluno.getDataMatricula());
		System.out.println("Nota 1: " + aluno.getNota1());
		System.out.println("Nota 2: " + aluno.getNota2());
		System.out.println("Nota 3: " + aluno.getNota3());
		System.out.println("Nota 4: " + aluno.getNota4());
		System.out.println();
		// Chama o método de Media de notas que são atributos de aluno.java
		System.out.println("A média do aluno é: " + aluno.getMediaNotas());
		// Chama o método getAlunoAprovado()
		System.out.println("Resultado = " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println(repeat("-", 40));
	}

	private static String repeat(String str, int times) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < times; i++) {
			result.append(str);
		}
		return result.toString();
	}

}
