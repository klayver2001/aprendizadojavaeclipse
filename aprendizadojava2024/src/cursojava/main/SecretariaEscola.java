package cursojava.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class SecretariaEscola {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int quantidade = 1; quantidade <= 2; quantidade++) {

			String nome = JOptionPane.showInputDialog("Nome do aluno : " + quantidade + " ?");
			String idade = JOptionPane.showInputDialog("Idade do Aluno : ");
			String DataNascimento = JOptionPane.showInputDialog("Data de nascimento : ");
			String RegistroGeral = JOptionPane.showInputDialog("Registro Geral : ");
			String NumeroCpf = JOptionPane.showInputDialog("Número do CPF : ");
			String NomeMae = JOptionPane.showInputDialog("Nome da Mãe: ");
			String NomePai = JOptionPane.showInputDialog("Nome do Pai : ");
			String MatriculaId = JOptionPane.showInputDialog("Número da Matrícula : ");

			// Cria instâncias dos alunos

			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome);

			aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setDataNascimento(DataNascimento);
			aluno1.setRegistroGeral(RegistroGeral);
			aluno1.setNumeroCpf(NumeroCpf);
			aluno1.setNomeMae(NomeMae);
			aluno1.setNomePai(NomePai);
			aluno1.setMatriculaId(MatriculaId);

			for (int pos = 1; pos <= 4; pos++) {
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
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equalsIgnoreCase("alex")) {
				alunos.remove(aluno);
				break;
			} else {
				System.out.println(aluno); /* Descrição do objeto na memória */
				System.out.println("Média do aluno " + aluno.getMediaNotas());
				System.out.println("Resultado " + aluno.getAlunoAprovado2());
				System.out.println("----------------------------------------------------------");
			}
		}
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista !");
			System.out.println(aluno.getNome());
			System.out.println("Suas disciplinas são :");
			
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
			
			
		}

	}
}
