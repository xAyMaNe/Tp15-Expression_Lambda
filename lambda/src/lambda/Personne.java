package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Personne {
    private String nom;
    private int age;
    private String ville;
    
    public Personne(String nom, int age, String ville) {
        this.nom = nom;
        this.age = age;
        this.ville = ville;
    }
    
    public String getNom() { return nom; }
    public int getAge() { return age; }
    public String getVille() { return ville; }
    
    @Override
    public String toString() {
        return nom + " (" + age + ") - " + ville;
    }
}