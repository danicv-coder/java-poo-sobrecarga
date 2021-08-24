package sobrecargametodos;

public class EjemploSobrecarga {

	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		System.out.println("Sumar int: " + cal.suma(2, 2));
		System.out.println("Sumar int-float: " + cal.suma(2, 10.0f));
		System.out.println("Sumar float-int: " + cal.suma(10.0, 5));
		System.out.println("Sumar float: " + cal.suma(10.0f, 125f));
		System.out.println("Sumar double-float: " + cal.suma(20.2, 10.0f));
		System.out.println("Sumar 3 int: " + cal.suma(2, 2, 2));
		System.out.println("Sumar 3 int: " + cal.suma(2, 2, 2, 2,2));
		
	}

}
