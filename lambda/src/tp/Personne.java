package tp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Personne {
	private String nom;
	private String prenom;
	private int age;

	public Personne(String prenom, String nom, int age) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return prenom + " " + nom + " (" + age + ")";
	}
}
