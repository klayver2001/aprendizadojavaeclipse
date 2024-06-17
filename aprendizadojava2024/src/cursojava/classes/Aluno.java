package cursojava.classes;
// Está é nossa classe que representa Aluno
 
/**
 * @author SuperAdminTwo
 */
public class Aluno {

	/* Esses são atributos do Aluno */

	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String matriculaId;
	private String dataMatricula;
	private String cursoMatriculado;
	
	private Disciplina disciplina = new Disciplina();

	

	/* Métodos SETTERS & GETTERS dos Objetos */
	// SET Adiciona ou recebe dados para os atribútos
	// GET Resgata ou Obtém o valor do atribúto

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	// Recebe dados
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
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


	/* Retorna média de notas do aluno, um método não é chamada de atributo */
	public double getMediaNotas() {
		return (disciplina.getNota1() + disciplina.getNota2() +disciplina.getNota3() + disciplina.getNota4()) / 4;
	}

	public boolean getAlunoAprovado() {
		double media = this.getMediaNotas();
		if (media >= 70) {
			return true;
		} else {
			return false;
		}
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", matriculaId=" + matriculaId + ", dataMatricula=" + dataMatricula + ", cursoMatriculado="
				+ cursoMatriculado + ", disciplina=" + disciplina + "]";
	}
	
	
	
	
	
	
	
}
