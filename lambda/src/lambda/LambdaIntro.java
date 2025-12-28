package lambda;

public class LambdaIntro {
	public static void main(String[] args) {

		// Classe anonyme
		Calculateur addition = new Calculateur() {
			@Override
			public int calculer(int a, int b) {
				return a + b;
			}
		};

		// Expression lambda
		Calculateur additionLambda = (a, b) -> a + b;

		System.out.println(addition.calculer(5, 3));
		System.out.println(additionLambda.calculer(5, 3));
	}
}
