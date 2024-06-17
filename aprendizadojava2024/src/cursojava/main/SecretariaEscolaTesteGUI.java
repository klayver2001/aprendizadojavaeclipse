package cursojava.main;

import cursojava.classes.Aluno;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * 
 */
public class SecretariaEscolaTesteGUI {

	public static void main(String[] args) {

		// Ícone da aplicação
		ImageIcon icon = new ImageIcon(
				"C:\\ESTUDOS-PROGRAMAÇÃO\\aprendizadojavaeclipse\\aprendizadojava2024\\assest\\icon.png"); 

		// Autenticação
		boolean authenticated = false;
		while (!authenticated) {
			// Campos de entrada para login
			JTextField usernameField = new JTextField();
			JPasswordField passwordField = new JPasswordField();
			Object[] loginFields = { "Username:", usernameField, "Password:", passwordField };

			int option = JOptionPane.showConfirmDialog(null, loginFields, "Login", JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.PLAIN_MESSAGE, icon);

			if (option == JOptionPane.OK_OPTION) {
				String username = usernameField.getText();
				String password = new String(passwordField.getPassword());

				if (username.equals("Admin") && password.equals("123456")) {
					authenticated = true;
				} else {
					JOptionPane.showMessageDialog(null, "Login falhou. Tente novamente.", "Erro de Autenticação",
							JOptionPane.ERROR_MESSAGE, icon);
				}
			} else {
				System.exit(0); // Sair da aplicação se cancelar o login
			}
		}

		// Cria instâncias dos alunos
		Aluno aluno245637 = new Aluno();
		aluno245637.setNome("João");
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

		// Opções iniciais
		String[] options = { "Dados de Alunos Matriculados", "Sair da Aplicação" };
		int initialChoice = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu Principal",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, options, options[0]);

		if (initialChoice == 0) { // "Dados de Alunos Matriculados" escolhido
			// Lista de alunos
			String[] alunoNames = { aluno245637.getNome(),
					aluno245638.getNome(),
					aluno245639.getNome()};

			// Escolha do aluno
			String selectedAluno = (String) JOptionPane.showInputDialog(null, "Selecione um aluno",
					"Alunos Matriculados", JOptionPane.QUESTION_MESSAGE, icon, alunoNames, alunoNames[0]);

			// Verifica qual aluno foi selecionado e exibe as informações
			Aluno aluno = null;
			if (selectedAluno != null) {
				if (selectedAluno.equals(aluno245637.getNome())) {
					aluno = aluno245637;
				} else if (selectedAluno.equals(aluno245638.getNome())) {
					aluno = aluno245638;
				} else if (selectedAluno.equals(aluno245639.getNome())) {
					aluno = aluno245639;
				}

				if (aluno != null) {
					String message = "Informações do Aluno:\n" + "Nome: " + aluno.getNome() + "\n" + "Sobrenome: "
							+  "\n" + "Idade: " + aluno.getIdade() + "\n" + "Data de Nascimento: "
							+ aluno.getDataNascimento() + "\n" + "Registro Geral: " + aluno.getRegistroGeral() + "\n"
							+ "Número CPF: " + aluno.getNumeroCpf() + "\n" + "Nome da Mãe: " + aluno.getNomeMae() + "\n"
							+ "Nome do Pai: " + aluno.getNomePai() + "\n" + "Matrícula ID: " + aluno.getMatriculaId()
							+ "\n" + "Data de Matrícula: " + aluno.getDataMatricula();

					// Exibir informações do aluno
					JOptionPane.showMessageDialog(null, message, "Informações do Aluno",
							JOptionPane.INFORMATION_MESSAGE, icon);

					// Opção para gerar PDF
					int generatePdfChoice = JOptionPane.showConfirmDialog(null,
							"Deseja gerar um PDF com as informações do aluno?", "Gerar PDF", JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE, icon);
					if (generatePdfChoice == JOptionPane.YES_OPTION) {
						generatePdf(aluno);
						JOptionPane.showMessageDialog(null, "PDF gerado com sucesso!", "PDF Gerado",
								JOptionPane.INFORMATION_MESSAGE, icon);
					}
					// Menu para inserir/exibir notas e calcular média
                    String[] menuOptions = { "Inserir Notas", "Exibir Média de Notas", "Sair da Aplicação" };
                    int option = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu de Notas",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, menuOptions,
                            menuOptions[0]);

                    if (option == 0) { // "Inserir Notas" escolhido
                        double[] notas = new double[4];

                        for (int i = 0; i < 4; i++) {
                            String input = JOptionPane.showInputDialog(null, "Digite a nota " + (i + 1) + " para "
                                    + aluno.getNome());
                            try {
                                notas[i] = Double.parseDouble(input);
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido.",
                                        "Erro", JOptionPane.ERROR_MESSAGE);
                                i--; // Repetir a mesma nota
                            }
                        }

                        JOptionPane.showMessageDialog(null, "Notas inseridas com sucesso!", "Sucesso",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else if (option == 1) { // "Exibir Média de Notas" escolhido
                        double media = aluno.getMediaNotas();
                        JOptionPane.showMessageDialog(null,
                                "A média das notas de " + aluno.getNome() + " é: " + media,
                                "Média de Notas", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } else { // "Sair da Aplicação" escolhido
                JOptionPane.showMessageDialog(null, "Saindo da aplicação...", "Sair", JOptionPane.INFORMATION_MESSAGE,
                        icon);
                System.exit(0);
            }
        }
    }

    private static void generatePdf(Aluno aluno) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream(aluno.getNome() + ".pdf"));
            document.open();
            document.add(new Paragraph("Informações do Aluno:"));
            document.add(new Paragraph("Nome: " + aluno.getNome()));
            document.add(new Paragraph("Idade: " + aluno.getIdade()));
            document.add(new Paragraph("Data de Nascimento: " + aluno.getDataNascimento()));
            document.add(new Paragraph("Registro Geral: " + aluno.getRegistroGeral()));
            document.add(new Paragraph("Número CPF: " + aluno.getNumeroCpf()));
            document.add(new Paragraph("Nome da Mãe: " + aluno.getNomeMae()));
            document.add(new Paragraph("Nome do Pai: " + aluno.getNomePai()));
            document.add(new Paragraph("Matrícula ID: " + aluno.getMatriculaId()));
            document.add(new Paragraph("Data de Matrícula: " + aluno.getDataMatricula()));
        } catch (DocumentException | java.io.IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
	}
}
