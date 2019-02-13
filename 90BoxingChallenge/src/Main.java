import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String... args) {
        String choice = "";
        boolean quit = false;

        System.out.println("Welcome to the bank.");
        System.out.println("What do you want to do?");


        do {
            System.out.println("1 - add branch, 2 - add customer, 3 - show customers at branch, 4 - show list of branches, 0 - quit" +
                    "5 - withdraw, 6 - deposit, 7 - show customer's log");
            choice = s.nextLine();
            switch (choice) {
                case "1":
                    addNewBranch();
                    break;
                case "2":
                    addCustomer();
                    break;
                case "3":
                    showCustomers();
                    break;
                case "4":
                    showBranches();
                    break;
                case "5":
                    withdraw();
                    break;
                case "6":
                    deposit();
                    break;
                case "7":
                    showCustomerLog();
                    break;
                case "q":
                    quit = true;
                    break;

                default:
                    break;
            }
        }
        while (!quit);



    }

    private static ArrayList<Branch> branches = new ArrayList<Branch>();


    static void addNewBranch(){
        System.out.println("Enter the name of the branch:");
        Branch branch = new Branch(s.nextLine(), new ArrayList<Customer>());
        branches.add(branch);
        System.out.println("Branch has been added.");
    }

    static boolean search(String branchName){
        boolean found = false;
        for(int i = 0; i<branches.size(); i++){
            if(branchName.equals(branches.get(i).getName())){
                found = true;
            }
        }
        return found;
    }

    static Branch getBranch(String name){
        Branch branch = null;

        for(int i = 0; i<branches.size(); i++){
            if(name.equals(branches.get(i).getName())){
                branch = branches.get(i);
            }
        }
        return branch;
    }

    static void addCustomer(){
        System.out.println("Enter the name of the branch:");
        String branchName = s.nextLine();

        if(search(branchName)){
            Branch branch = getBranch(branchName);
            branch.addCustomer();
        }
        else{
            System.out.println("Could not find branch with that name.");
        }



    }

    static void showCustomers(){
        System.out.println("Enter the name of the branch:");
        String branchName = s.nextLine();
        if(search(branchName)){
            getBranch(branchName).showCustomers();
        }
        else{
            System.out.println("Branch was not found.");
        }

    }

    static void withdraw(){
        System.out.println("Enter the name of the branch:");
        String branchName = s.nextLine();
        if(search(branchName)){
            getBranch(branchName).withdraw();
        }
        else{
            System.out.println("Branch was not found.");
        }
    }

    static void deposit(){
        System.out.println("Enter the name of the branch:");
        String branchName = s.nextLine();
        if(search(branchName)){
            getBranch(branchName).deposit();
        }
        else{
            System.out.println("Branch was not found.");
        }
    }

    static void showBranches(){
        for(int i = 0; i<branches.size(); i++) {
            System.out.println(branches.get(i).getName());
        }
    }

    static void showCustomerLog(){
        System.out.println("Enter the name of the branch:");
        String branchName = s.nextLine();
        if(search(branchName)){
            getBranch(branchName).show();
        }
        else{
            System.out.println("Branch was not found.");
        }
    }
}
