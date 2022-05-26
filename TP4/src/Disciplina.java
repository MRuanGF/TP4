public class Disciplina {
	Aluno aluno[] = new Aluno[10];
	
	public void adicionarAluno(Aluno aluno, int pos) {
		this.aluno[pos] = aluno;
	}
	
	public void removeAluno(int idAluno) {
		for(int i = 0; i<10; i++) {
			if(this.aluno[i].GetId() == idAluno) {
				this.aluno[i] = null;
				break;
			}else {
				continue;
			}				
		}
	}

		
	public double mnota1() {
		double somanotas1 = 0;
		int qteAlunos = 0;
		for(int i = 0; i < 10; i++) {
			if(aluno[i] == null) {
				System.out.println("Posicao "+ i + " Vazia");
			}
			else {
				qteAlunos++;
				somanotas1 = somanotas1 + aluno[i].GetNota1();
			}
		}
		return somanotas1/qteAlunos;
	}
	public double mnota2() {
		double somanotas2 = 0;
		int qteAlunos = 0;
		for(int i = 0; i < 10; i++) {
			if(aluno[i] == null) {
				System.out.println("Posicao "+ i + " Vazia");
			}
			else {
				qteAlunos++;
				somanotas2 = somanotas2 + aluno[i].GetNota2();
			}
		}
		return somanotas2/qteAlunos;
	}


	public void imprimeAlunosProximos(int p) {
		int id = p-1;	
		if(id > 0 && id < 9) {
				if(aluno[id-1] == null && aluno[id-1] != null ) {
					System.out.println("Nao ha aluno registrado antes do aluno na posicao " + p + ", ha somente o aluno sucessor que e:");
					aluno[id+1].GetNome();
				}
				else if(aluno[id+1]== null && aluno[id-1] != null) {
					System.out.println("Nao ha aluno registrado depois do aluno na posicao " + p + ", ha somente o aluno antecessor que e:");
					aluno[id-1].GetNome();
				}
				else if(aluno[id-1] == null && aluno[id+1] == null) {
					System.out.println("Nao ha aluno resgistrado nem antes e nem depois do aluno da posicao " + p);
				}
				else {
					System.out.println("O aluno antecessor e: "); aluno[id-1].GetNome(); 
					System.out.println("\n e o aluno sucessor e: "); aluno[id+1].GetNome();
					}
			}
			else if(id == 0) {
				if(aluno[id+1] == null) {
					System.out.println("Nao ha aluno registrado depois do aluno na posicao " + p);
				}
				else {
				System.out.println("Nao ha aluno antecessor, apenas o aluno sucessor: "); aluno[id+1].GetNome();
			}
				
			}
			else if(id == 9) {
				if(aluno[id-1] == null) {
					System.out.println("Nao ha aluno registrado depois do aluno na posicao " + p);
				}
				else {
					System.out.println("Nao ha aluno sucessor, apenas aluno antecessor; ");
					aluno[id-1].GetNome();
			}
			}
		}
}



