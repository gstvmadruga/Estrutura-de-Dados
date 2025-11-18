package controle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import dominio.Aluno;
import dominio.Professor;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Digite o nome do professor: ");
        String nomeProf = sc.nextLine();
        System.out.print("Digite a matrícula do professor: ");
        String matriculaProf = sc.nextLine();
        System.out.print("Digite a disciplina do professor: ");
        String disciplinaProf = sc.nextLine();

        Professor professor = new Professor(nomeProf, matriculaProf, disciplinaProf);

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("\nAluno " + (i + 1));
            System.out.print("Nome: ");
            String nomeAluno = sc.nextLine();
            System.out.print("Matrícula: ");
            String matriculaAluno = sc.nextLine();

            alunos[i] = new Aluno(nomeAluno, matriculaAluno);
            alunos[i].setProfessor(professor); // Relacionamento unário
        }

        Arrays.sort(alunos, Comparator.comparing(Aluno::getNome));

        System.out.println("\nAlunos ordenados por nome:");
        for (Aluno a : alunos) {
            System.out.println(a);
        }

        System.out.print("\nDigite o nome do aluno para consulta: ");
        String chave = sc.nextLine();

        int indice = -1;
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].getNome().equalsIgnoreCase(chave)) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            System.out.println("Aluno encontrado: " + alunos[indice]);
        } else {
            System.out.println("Aluno não encontrado.");
        }

        sc.close();
    }
}
