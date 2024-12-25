package app_gestion_comptes;

public class cs_utilisateur extends cs_personne {
    String email;
    String password;
    public cs_utilisateur(String nom, int lage, String email, String password) {
        super(nom, lage);
        this.email = email;
        this.password = password;
    }

    public cs_utilisateur() {
        super();
    }

    @Override // pour affichage
    public String toString() {
        return "cs_utilisateur{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", nom='" + nom + '\'' +
                ", lage=" + lage +
                '}';
    }
}
