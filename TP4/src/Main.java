
public class Main {
	public static void main(String[] args) {
		//Micael Ruan
		
		Disciplina turmaCK0084 = new Disciplina();
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		
		
		// Aluno 1
		aluno1.SetNome("Jurema");
		aluno1.SetId(1);		
		aluno1.nota1 = 3.5;
		aluno1.nota2 = 6.5;
		
		// Aluno 2:
		aluno2.SetNome("João");
		aluno2.SetId(2);
		aluno2.SetNota1(5);
		aluno2.SetNota2(10);
		
		// Aluno 3:
		aluno3.SetNome("Ana");
		aluno3.SetId(3);
		aluno3.SetNota1(6);
		aluno3.SetNota2(8.5);
		
		
		turmaCK0084.adicionarAluno(aluno1, 0);
		turmaCK0084.adicionarAluno(aluno2, 1);
		turmaCK0084.adicionarAluno(aluno3, 2);
		
		System.out.println(turmaCK0084.mnota1());
		
		turmaCK0084.removeAluno(1);
		
		System.out.println(turmaCK0084.mnota2());
		
		turmaCK0084.adicionarAluno(aluno1, 0);
		
		turmaCK0084.imprimeAlunosProximos(1);		
		turmaCK0084.imprimeAlunosProximos(2);
		turmaCK0084.imprimeAlunosProximos(3);

	}

	
}
