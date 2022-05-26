
public class Aluno {
	private String aluno;
	private int id;
	private double media;
	protected double nota1;
	protected double nota2;

	public void GetNome() {
		System.out.print(aluno);
	}
	public void SetNome(String nome) {
		this.aluno = nome;
	}
	public int GetId() {
		return id;
	}
	
	public void SetId(int ID) {
		this.id = ID;
	}
	private void calculaMedia() {
		media = (nota1+nota2)/2;
	}
	public double retornaMedia() {
		calculaMedia();
		return media;
	}
	public void passou(String aluno) {
		calculaMedia();
		System.out.print(media >= 7);
		}
	
	public double GetNota1() {
		return nota1;
	}
	public double GetNota2() {
		return nota2;
	}
	public void SetNota1(double nota) {
		nota1 = nota;
	}
	public void SetNota2(double nota) {
		nota2 = nota;
	}

}
