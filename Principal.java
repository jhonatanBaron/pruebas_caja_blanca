package co.edu.uptc.classes;

public class Principal {
	Factorial fact = new Factorial();
	Calificacion cal = new Calificacion();
	ConvertirDecimalesARomanos convert = new ConvertirDecimalesARomanos();
	SensacionTermica sens = new SensacionTermica();
	
	public double calcularFactorial(int n) {
		return fact.factorial(n);
	}
	
	public String mostrarCalificacion(int nota1, int nota2, int nota3) {
		return cal.calificacion(nota1, nota2, nota3);
	}
	
	public String convertirDecARomanos(int n) {
		return convert.convertirDecARomanos(n);
	}
	
	public String sensacionTermica(int n) {
		return sens.sensacionTermica(n);
	}
}
