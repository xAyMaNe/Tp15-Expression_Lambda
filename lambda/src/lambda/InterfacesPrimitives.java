package lambda;

import java.util.function.IntPredicate;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;

public class InterfacesPrimitives {
	public static void main(String[] args) {

		IntPredicate estPair = n -> n % 2 == 0;
		IntConsumer afficheur = n -> System.out.println("Nombre: " + n);
		IntFunction<String> convertisseur = n -> "Valeur: " + n;
		IntSupplier de = () -> (int) (Math.random() * 6) + 1;

		System.out.println(estPair.test(6));
		afficheur.accept(42);
		System.out.println(convertisseur.apply(100));
		System.out.println(de.getAsInt());
	}
}
