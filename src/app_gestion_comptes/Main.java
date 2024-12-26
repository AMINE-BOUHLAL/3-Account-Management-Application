package app_gestion_comptes;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<cs_utilisateur> ARLutls = new ArrayList<>();
    static ArrayList<cs_role> ARLrole = new ArrayList<>();

    // static ArrayList<cs_role> ARLrole = new ArrayList<>();

    public static void add() {
        cs_utilisateur obj_utls = new cs_utilisateur();
        cs_role obj_role = new cs_role();
        System.out.println("-Add name:");
        obj_utls.name = scanner.nextLine();
        System.out.println("-Add age:");
        obj_utls.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("-Add email:");
        obj_utls.email = scanner.nextLine();
        System.out.println("-Add password:");
        obj_utls.password = scanner.nextLine();
        System.out.println("-Add role:");
        obj_role.role= scanner.nextLine(); //
        System.out.println(" User added successfully.");
        ARLutls.add(obj_utls);
    }

    public static void search() {
        System.out.println("give the username you want to search :");
        String nom = scanner.nextLine();
        for (int i = 0; i < ARLutls.size(); i++) {
            if (ARLutls.get(i).name.equals(nom)) { // get (i) thqeq mn les valeurs li f'variable nom  f'arraylist wach fihom nom li dkhl user
                System.out.println(" -name :" + ARLutls.get(i).name);
                System.out.println(" -age  :" + ARLutls.get(i).age);
                System.out.println(" -email:" + ARLutls.get(i).email);
                System.out.println(" -password:" + ARLutls.get(i).password);
            }
        }
    }

    public static void modifie() {
        cs_utilisateur obj_utls = new cs_utilisateur();
        cs_role obj_role = new cs_role();
        System.out.println("-Give the username you want to modify :");
        String name = scanner.nextLine();
        for (int i =0; i < ARLutls.size(); i++) {
            if (ARLutls.get(i).name.equals(name)) {
                System.out.println("-Give the new name:");
                obj_utls.name = scanner.nextLine();
                System.out.println("-Give the new age :");
                obj_utls.age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("-Give the new email :");
                obj_utls.email = scanner.nextLine();
                System.out.println("-Give the new password :");
                obj_utls.password = scanner.nextLine();
                System.out.println("-Give the new role:");
                obj_role.role= scanner.nextLine();
                ARLutls.set(i, obj_utls);//
                System.out.println("   Modified successfully.");
            }
        }
}

    public static void main(String[] args) {
        int choix;

        do {
            System.out.println("MENU");
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
                    search();
                    break;
                case 3:
                    modifie();
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
