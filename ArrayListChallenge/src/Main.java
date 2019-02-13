import java.util.Scanner;

public class Main {

    static MobilePhone mobile = new MobilePhone("910");

    public static void main(String... args){
        boolean quit = false;
        Scanner s = new Scanner(System.in);

        String choice;
        String name;
        String number;
        String newName;
        while(!quit) {
            System.out.println("1 print, 2 add, 3 modify, 4 delete, 5 quit");
            choice = s.nextLine();


            switch (choice) {

                case "1":
                    mobile.printContacts();
                    break;
                case "2":
                    System.out.println("Please enter contact name");
                    name = s.nextLine();
                    System.out.println("Please enter contact number");
                    number = s.nextLine();
                    addContact(name, number);
                    break;
                case "3":
                    System.out.println("Please enter contact name");
                    name = s.nextLine();
                    System.out.println("Please enter new contact name");
                    newName = s.nextLine();
                    updateContact(name, newName);
                    break;
                case "4":
                    System.out.println("Please enter contact name");
                    name = s.nextLine();
                    deleteContact(name);
                    break;
                case "5":
                    quit = true;
                    break;
                    default:break;

            }

        }

    }

    static void addContact(String name, String number){
        mobile.addContact(new Contact(name, number));
    }
    static void updateContact(String oldName, String newName){
        mobile.modifyContact(oldName, newName);
    }
    static void deleteContact(String name){
        mobile.removeContact(new Contact(name));
    }

}
