package algorithm.recursive;

public class Recursive {

	/**
	 * M�todo est�tico para calcular o fatorial de um n�mero (M�todo recursivo)
	 * 
	 * @param n
	 * @return
	 */
	public static int factorial(int n) {
		if (n > 1) {
			return factorial(n - 1) * n;
		}
		return 1;
	}

	/**
	 * Calcula a sequ�ncia de fibonacci
	 * 
	 * @param n Quantidade de elementos na sequ�ncia
	 * @return
	 */
	public static int fibonacci(int n) {
		if (n <= 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
