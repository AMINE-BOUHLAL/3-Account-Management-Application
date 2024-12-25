package app_gestion_comptes;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<cs_utilisateur> ARLutls = new ArrayList<>();
    static ArrayList<cs_role> ARLrole = new ArrayList<>();
    public static void add() {
        cs_utilisateur obj_utls = new cs_utilisateur();
        System.out.println("Add name:");
        obj_utls.nom = scanner.nextLine();
        System.out.println("Add age:");
        obj_utls.lage = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Add email:");
        obj_utls.email = scanner.nextLine();
        System.out.println("Add password:");
        obj_utls.password = scanner.nextLine();
        ARLutls.add(obj_utls);
        System.out.println("Utilisateur ajouté avec succès !");
    }

    public static void main(String[] args) {
        int choix;

        do {
            System.out.println("\nMENU");
            System.out.println("1- Ajouter");
            System.out.println("2- Rechercher");
            System.out.println("3- Modifier");
            System.out.println("4- Supprimer");
            System.out.println("5- Afficher");
            System.out.println("6- Quitter");
            System.out.print("Choisir une option: ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    add();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
                    break;
            }

        } while (choix != 6);
    }
}
