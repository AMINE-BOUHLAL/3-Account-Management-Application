package app_gestion_comptes;

public class cs_personne {
    public String nom;
    public int lage;

    // constricteur=bnay
    public cs_personne(String nom, int lage) {
        this.nom = nom;
        this.lage = lage;
    }

    public cs_personne() {

    }

    @Override
    public String toString() {
        return "cs_personne{" +
                "nom='" + nom + '\'' +
                ", lage=" + lage +
                '}';
    }
}

