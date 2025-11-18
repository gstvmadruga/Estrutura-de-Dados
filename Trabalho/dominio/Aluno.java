package dominio;

public class Aluno {

	    private String nome;
	    private String matricula;
	    private Professor professor; 

	    public Aluno(String nome, String matricula) {
	        this.nome = nome;
	        this.matricula = matricula;
	        this.professor = null;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getMatricula() {
	        return matricula;
	    }

	    public void setMatricula(String matricula) {
	        this.matricula = matricula;
	    }

	    public Professor getProfessor() {
	        return professor;
	    }

	    public void setProfessor(Professor professor) {
	        this.professor = professor;
	    }

	    @Override
	    public String toString() {
	        if (professor != null) {
	            return nome + " (" + matricula + ") - Professor: " + professor.getNome();
	        } else {
	            return nome + " (" + matricula + ") - Sem professor";
	        }
	    }
	}



