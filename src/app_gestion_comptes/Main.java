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
        System.out.println("-Add name    :");
        obj_utls.name = scanner.nextLine();
        System.out.println("-Add age     :");
        obj_utls.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("-Add email   :");
        obj_utls.email = scanner.nextLine();
        System.out.println("-Add password:");
        obj_utls.password = scanner.nextLine();
        System.out.println("-Add role  :");
        obj_role.role = scanner.nextLine();
        System.out.println(" User added successfully.");
        ARLutls.add(obj_utls);
        ARLrole.add(obj_role);
    }

    public static void search() {
        System.out.println("give the username you want to search :");
        String nom = scanner.nextLine();
        for (int i = 0; i < ARLutls.size(); i++) {
            if (ARLutls.get(i).name.equals(nom)) { // get (i) thqeq mn les valeurs li f'variable nom  f'arraylist wach fihom nom li dkhl user
                System.out.println(" -name    :" + ARLutls.get(i).name);
                System.out.println(" -age     :" + ARLutls.get(i).age);
                System.out.println(" -email   :" + ARLutls.get(i).email);
                System.out.println(" -password:" + ARLutls.get(i).password);
                System.out.println(" -role    :" + ARLrole.get(i).role);
            }
            else {
                System.err.println(" there is no user." );
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
            else {
                System.err.println(" -there is no user to modify :" );
            }
        }
    }

    public static void show(){
        System.out.println("-Give the username you want to show :");
        String nom = scanner.nextLine();
        if (ARLutls.isEmpty()) {
            System.out.println("La liste des livres est vide");
        }
        else {
            for (int i = 0; i < ARLutls.size(); i++) {
                System.out.println(" -name    :" + ARLutls.get(i).name);
                System.out.println(" -age     :" + ARLutls.get(i).age);
                System.out.println(" -email   :" + ARLutls.get(i).email);
                System.out.println(" -password:" + ARLutls.get(i).password);
                System.out.println(" -role    :" + ARLrole.get(i).role);
            }
        }

    }

    public static void delete()  {
        cs_utilisateur obj_utls = new cs_utilisateur();
        cs_role obj_role = new cs_role();
        System.out.println("-Give the username you want to delete :");
        String name = scanner.nextLine();
        for (int i =0; i < ARLutls.size(); i++) {
            if (ARLutls.get(i).name.equals(name)) {
                ARLutls.remove(i);
            }
            else{
                System.err.println("wrong option try again ");
            }
        }
        System.out.println("deleted user successfully.");
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("MENU");
            System.out.println("1- Add");
            System.out.println("2- Search");
            System.out.println("3- Modifie");
            System.out.println("4- Deleter");
            System.out.println("5- Show");
            System.out.println("6- Exit");
            System.out.print("choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
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
                    delete();
                    break;
                case 5:
                    show();
                    break;
                case 6:
                    System.out.println("Byy !");
                    break;
                default:
                    System.err.println("Errue try again");
                    break;
            }

        } while (choice != 6);
    }
}
