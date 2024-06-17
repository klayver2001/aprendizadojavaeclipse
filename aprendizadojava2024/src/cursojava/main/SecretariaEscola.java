package cursojava.main;

import java.util.Iterator;

import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

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
		
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina "+pos+" : ");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+pos+" : ");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			aluno245637.getDisciplinas().add(disciplina);
		}
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4");
			aluno245637.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -1);	
			}

		// Exibir informações dos alunos
		exibirInformacoesAluno(aluno245637);

	}

	private static void exibirInformacoesAluno(Aluno aluno) {
		System.out.println("Informações do Aluno:");
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("Idade: " + aluno.getIdade());
		System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
		System.out.println("Registro Geral: " + aluno.getRegistroGeral());
		System.out.println("Número CPF: " + aluno.getNumeroCpf());
		System.out.println("Nome da Mãe: " + aluno.getNomeMae());
		System.out.println("Nome do Pai: " + aluno.getNomePai());
		System.out.println("Matrícula ID: " + aluno.getMatriculaId());		
		
		// Chama o método de Media de notas que são atributos de aluno.java
		System.out.println("A média do aluno é: " + aluno.getMediaNotas());
		// Chama o método getAlunoAprovado()
		System.out.println("Resultado = " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
	}
}
