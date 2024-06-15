package cursojava.classes;
// Está é nossa classe que representa Aluno

/**
 * @author SuperAdminTwo
 */
public class Aluno {

	/* Esses são atributos do Aluno */

	private String nome;
	private String sobrenome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String matriculaId;
	private String dataMatricula;
	private String cursoMatriculado;

	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;

	/* Métodos SETTERS & GETTERS dos Objetos */
	// SET Adiciona ou recebe dados para os atribútos
	// GET Resgata ou Obtém o valor do atribúto

	// Recebe dados
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getMatriculaId() {
		return matriculaId;
	}

	public void setMatriculaId(String matriculaId) {
		this.matriculaId = matriculaId;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getCursoMatriculado() {
		return cursoMatriculado;
	}

	public void setCursoMatriculado(String cursoMatriculado) {
		this.cursoMatriculado = cursoMatriculado;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	/* Retorna média de notas do aluno, um método não é chamada de atributo */
	public double getMediaNotas() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}

	public boolean getAlunoAprovado() {
		double media = this.getMediaNotas();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}
}
