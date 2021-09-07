package modelo;

public class Aluno extends Academico{
	
	private int matricula;

	@Override
	public String getCodigoIdentificador() {
		
		return Integer.toString(getMatricula());
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	

}
