package lambda;

import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class InterfacesStandard {
	public static void main(String[] args) {

		Predicate<Integer> estPair = n -> n % 2 == 0;
		Consumer<String> affiche = s -> System.out.println(s);
		Function<Integer, String> convertir = n -> "Nombre: " + n;
		Supplier<Double> aleatoire = () -> Math.random();

		System.out.println(estPair.test(4));
		affiche.accept("Bonjour");
		System.out.println(convertir.apply(10));
		System.out.println(aleatoire.get());
	}
}
