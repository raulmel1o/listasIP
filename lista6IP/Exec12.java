//finalizado

class Exec12 {
	public static void main(String[] args) {
		MediaAlunoDisciplina al1 = new MediaAlunoDisciplina("IP",11870986);
		al1.pesoProvas = 5.0;
		al1.pesoTrabalhos = 5.0;
		al1.mediaProvas = 8.0;
		al1.mediaTrabalhos = 6.0;
		
		al1.calculaMediaPonderada();
		al1.imprimeDados();
	}
}

class MediaAlunoDisciplina {
	String disciplina;
	public int numAluno;
	public double pesoProvas;
	public double pesoTrabalhos;
	public double mediaProvas;
	public double mediaTrabalhos;
	private double mediaPonderada;
	
	public MediaAlunoDisciplina(String disciplina, int numAluno) {
		this.disciplina = disciplina;
		this.numAluno = numAluno;
	}
	
	void calculaMediaPonderada() {
		mediaPonderada = (pesoProvas * mediaProvas + pesoTrabalhos * mediaTrabalhos) / 10;
	}
	
	void imprimeDados() {
		System.out.printf("Disciplina %s\nAluno: %d\n", disciplina, numAluno);
		System.out.printf("Peso Provas: %f\nPeso Trabalhos: %f\n", pesoProvas, pesoTrabalhos);
		System.out.printf("Media Provas: %f\nMedia Trabalhos: %f\n", mediaProvas, mediaTrabalhos);
		System.out.printf("Media Ponderada: %f\n", mediaPonderada);
	}
}