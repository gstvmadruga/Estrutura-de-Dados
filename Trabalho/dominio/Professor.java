package dominio;
import java.util.Arrays;

public class Professor {
	    private String nome, disciplina;
	    private String matricula; 
	    private Aluno[] alunos = new Aluno[5]; 
	    private int count = 0; 

	    public Professor(String nome, String disciplina, String matricula) {
	        this.nome = nome;
	        this.disciplina = disciplina;
	        this.matricula = matricula;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getDisciplina() {
	        return disciplina;
	    }

	    public void setDisciplina(String disciplina) {
	        this.disciplina = disciplina;
	    }

	    public void addAluno(Aluno aluno) {
	        if (count < alunos.length) {
	            alunos[count++] = aluno;
	            aluno.setProfessor(this); 
	        }
	    }

	    public Aluno[] ordenarAlunos() {
	        Aluno[] alunosOrdenados = Arrays.copyOf(alunos, count);
	        Arrays.sort(alunosOrdenados, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
	        return alunosOrdenados;
	    }

	    public int buscarAluno(Aluno aluno) {
	        for (int i = 0; i < count; i++) {
	            if (alunos[i].equals(aluno)) {
	                return i;
	            }
	        }
	        return -1;
	    }

	    public Aluno[] getAlunos() {
	        return Arrays.copyOf(alunos, count);
	    }
	}



