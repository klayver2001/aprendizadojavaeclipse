package cursojava.main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class SecretariaEscola {

	public static void main(String[] args) {
		// Criei uma lista para armazenar os objetos Aluno
		List<Aluno> alunos = new ArrayList<Aluno>();

		/* For para cadastro de até 2 alunos */
		for (int quantidade = 1; quantidade <= 2; quantidade++) {

			/*  */
			String nome = JOptionPane.showInputDialog("Nome do aluno : " + quantidade + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Idade do Aluno : "); String
			 * DataNascimento = JOptionPane.showInputDialog("Data de nascimento : "); String
			 * RegistroGeral = JOptionPane.showInputDialog("Registro Geral : "); String
			 * NumeroCpf = JOptionPane.showInputDialog("Número do CPF : "); String NomeMae =
			 * JOptionPane.showInputDialog("Nome da Mãe: "); String NomePai =
			 * JOptionPane.showInputDialog("Nome do Pai : "); String MatriculaId =
			 * JOptionPane.showInputDialog("Número da Matrícula : ");
			 */

			// Instâncias de alunos
			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(DataNascimento);
			 * aluno1.setRegistroGeral(RegistroGeral); aluno1.setNumeroCpf(NumeroCpf);
			 * aluno1.setNomeMae(NomeMae); aluno1.setNomePai(NomePai);
			 * aluno1.setMatriculaId(MatriculaId);
			 */
			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " : ");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " : ");
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				aluno1.getDisciplinas().add(disciplina);
			}
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
			int posicao = 1;
			if (escolha == 0) { /* Opção sim é zero */
				int continuarRemover = 0;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 OU 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover mais disciplinas ?");
				}
			}
			alunos.add(aluno1);

		}
		for (int pos = 0; pos < alunos.size(); pos++) {
			Aluno aluno = alunos.get(pos);

			if (aluno.getNome().equalsIgnoreCase("klayver")) {
				Aluno trocarAluno = new Aluno();
				trocarAluno.setNome("Aluno trocado !");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Math");
				disciplina.setNota(90);

				trocarAluno.getDisciplinas().add(disciplina);

				alunos.set(pos, trocarAluno);
				aluno = alunos.get(pos);
			}

			System.out.println("---------------------------------------");
			System.out.println("Aluno : " + aluno.getNome());
			System.out.println("Média do aluno : " + aluno.getMediaNotas());
			System.out.println("Resultado do ano letivo : " + aluno.getAlunoAprovado2());
			System.out.println("7");

			for (int posicaodisciplina = 0; posicaodisciplina < aluno.getDisciplinas().size(); posicaodisciplina++) {
				Disciplina disc = aluno.getDisciplinas().get(posicaodisciplina);
				System.out.println("Disciplina : " + disc.getDisciplina());
				System.out.println("Nota : " + disc.getNota());

			}

		}

	}
}
