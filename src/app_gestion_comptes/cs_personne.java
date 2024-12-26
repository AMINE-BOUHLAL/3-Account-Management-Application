package app_gestion_comptes;

public class cs_personne {
    public String name;
    public int age;

    // constricteur=bnay
    public cs_personne(String nom, int lage) {
        this.name = nom;
        this.age = lage;
    }

    public cs_personne() {

    }

    @Override
    public String toString() {
        return "cs_personne{" +
                "nom='" + name + '\'' +
                ", lage=" + age +
                '}';
    }
}

