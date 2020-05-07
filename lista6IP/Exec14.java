class Exec14 {
	public static void main(String[] args) {
		int[] data = {29, 04, 2002};
		Pessoa p1 = new Pessoa("Raul", 'M', 287129084, data);
		
		p1.idade();
	}
}

class Pessoa {
	String nome;
	char sexo;
	int rg;
	int[] dataDeNascimento = new int[3];
	
	public Pessoa(String nome, char sexo, int rg, int[] dataDeNascimento) {
		this.nome = nome;
		this.sexo = sexo;
		this.rg = rg;
		for (int i = 0; i < 3; i++) {
			this.dataDeNascimento[i] = dataDeNascimento[i];
		}
	}
	
	public void idade() {
		if (dataDeNascimento[2] > 2020) {
			System.out.println(-1);
		} else {
			System.out.println(2020 - dataDeNascimento[2]);
		}
	}
}