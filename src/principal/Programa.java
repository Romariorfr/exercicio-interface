package principal;

import java.util.Scanner;

import modelo.Academico;
import modelo.Aluno;
import modelo.Atendente;
import modelo.Funcionario;
import modelo.Periodo;
import modelo.Professor;

public class Programa {

	public static void main(String[] args) {
		
		Professor professor = new Professor();
		System.out.println("#Dados do professor:\n");
		System.out.print("Nome do professor: ");
		professor.setNome(coletaDados());
		
		System.out.print("Turno[1 - matutino |2 - vespertino |3 - Noturno]: ");
		professor.setPeriodo(turnoTrabalho(Integer.parseInt(coletaDados())));
		
		System.out.print("Cpf: ");
		professor.setCpf(coletaDados());
		espacamento();
		
		
		Aluno aluno = new Aluno();
		System.out.println("#Dados do aluno:\n");
		System.out.print("Nome: ");
		aluno.setNome(coletaDados());
		
		System.out.print("Matricula: ");
		aluno.setMatricula(Integer.parseInt(coletaDados()));
		
		
		Atendente atendente = new Atendente();
		atendente.setEscala("08hs as 12hs e 13hs as 18hs");
		
		//----------------------------------------------------
		
		System.out.println("Exibir dados do aluno: ");
		verificaDadosAcademico(aluno);
		espacamento();
		
		System.out.println("Exibe dados do professor: ");
		verificaDadosAcademico(professor);
		espacamento();
		
		
		System.out.println("Exibe escala do professor: ");
		verificaEscalaAcesso(professor);
		espacamento();
		
		System.out.println("Exibe a escala do atendente: ");
		verificaEscalaAcesso(atendente);
		espacamento();
		
	}
	
	
	public static void verificaEscalaAcesso(Funcionario funcionario) {
		System.out.println("A escala é: "+funcionario.escalaTrabalho());
	}
	
	public static void verificaDadosAcademico(Academico academico) {
		System.out.println("O ID do academico é : "+ academico.getCodigoIdentificador());
		System.out.println("O nome: "+academico.getNome());
	}
	
	
	public static String coletaDados() {
		Scanner sc = new Scanner(System.in);
		String dado = sc.nextLine();
		return dado;
	}
	
	public static Periodo turnoTrabalho(int resp) {
		
		Periodo p = Periodo.MATUTINO;
		switch (resp) {
		case 1:
			  p = Periodo.MATUTINO;
			break;
		case 2: 
		    p = Periodo.VESPERTINO;
			break;
			
		case 3:
			p = Periodo.NOTURNO;
			break;
		}
		
		return p;
	}
	
	public static void espacamento() {
		System.out.println("---------------------------------------------");
	}

}
