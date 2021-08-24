package sobrecargametodos;

public class Calculadora {
	int total;

	public int suma(int a, int b) {
		return a + b;
	}

	public float suma(int a, float b) {
		return a + b;
	}

	public float suma(float a, int b) {
		return a + b;
	}

	public float suma(float a, float b) {
		return a + b;
	}

	public double suma(double a, float b) {
		return a + b;
	}

	public int suma(int a, int b, int c) {
		return a + b + c;
	}
	
	public int suma(int... varargs) {
		for(int i : varargs) {
			total += i;
		}
		return total;
	}
}
