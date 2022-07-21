package aula5;

public class principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Professor p1 = new Professor();

		p1.setNome("Reginaldo Pereira");
		p1.setEndereco( "Rua das Flores, 220");
		p1.setTelefone( "(16)99999.4444");
		p1.setCpf( "22.254.254.39");
		p1.setNomeCurso( "JavaSpringWeb");
		p1.setSalario(42.20);

		a1.setNome( "Murilo Pacheco");
		a1.setEndereco( "Rua dos Alfeneiros, 4");
		a1.setTelefone( "(16)99999.5555");
		a1.setCpf("222.333.444-20");
		a1.setCurso(  "Java Spring Web");
		double[] notas = {9.5, 6.5, 8.5, 6.3, 9.7, 8.6};
        a1.setNotas(notas);

        System.out.println(p1.montaHolerite());
        System.out.println(a1.montaBoletim());

	}

}
