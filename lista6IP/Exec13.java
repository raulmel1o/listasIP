//finalizado

class Exec13 {
	public static void main(String[] args) {
		IntervaloDeTempo int1 = new IntervaloDeTempo(7100);
		System.out.println(int1.horas);
		System.out.println(int1.minutos);
		System.out.println(int1.segundos);
		
		IntervaloDeTempo int2 = new IntervaloDeTempo(3600);
		System.out.println(int2.horas);
		System.out.println(int2.minutos);
		System.out.println(int2.segundos);
	}
}

class IntervaloDeTempo {
	int horas;
	int minutos;
	int segundos;
	
	public IntervaloDeTempo(int intervalo) {
		if (intervalo < 0) {
			this.segundos = -1;
			this.minutos = -1;
			this.horas = -1;
	    } else if (intervalo < 60) {
			this.segundos = intervalo;
		} else if (intervalo < 3600) {
			this.minutos = intervalo / 60;
			this.segundos = intervalo % 60;
		} else {
			this.horas = intervalo / 3600;
			this.minutos =  (intervalo % 3600) / 60;
			this.segundos = (intervalo % 3600) % 60;
		}
	}
}