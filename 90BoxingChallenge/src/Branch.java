import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    private String name;
    private Double amount;
    private ArrayList<Customer> customers;
    Scanner s = new Scanner(System.in);

    public Branch(String name, ArrayList<Customer> customers) {
        this.customers = customers;
        this.name = name;
    }

    void addCustomer(){
        System.out.println("Enter customer name: ");
        String customerName = s.nextLine();
        System.out.println("Enter initial amount: ");
        amount = Double.parseDouble(s.nextLine());
        Customer customer = new Customer(customerName, new ArrayList<Double>(), amount);
        customers.add(customer);
    }

    void withdraw(){
        System.out.println("Enter customer name");
        String name = s.nextLine();
        if(customerExists(name)){
            findCustomer(name).withdraw();
        }
        else{
            System.out.println("Customer was not found.");
        }

    }
    void deposit(){
        System.out.println("Enter customer name");
        String name = s.nextLine();
        if(customerExists(name)){
            findCustomer(name).deposit();
        }
        else{
            System.out.println("Customer was not found.");
        }

    }
    void show(){
        System.out.println("Enter customer name");
        String name = s.nextLine();
        if(customerExists(name)){
            findCustomer(name).showTransactions();
        }
        else{
            System.out.println("Customer was not found.");
        }
    }

    public String getName() {
        return name;
    }

    Customer findCustomer(String n){
        Customer customer = null;
        if(customerExists(n)) {
            for (int i = 0; i < customers.size(); i++) {
                if (n.equals(customers.get(i).getCustomerName())) {
                    customer = customers.get(i);
                }
            }
        }
        else{
            System.out.println("Customer was not found.");
        }
        return customer;
    }

    boolean customerExists(String n){
        boolean found = false;
        for(int i = 0; i<customers.size(); i++){
            if(n.equals(customers.get(i).getCustomerName())){
                found = true;
            }
        }
        return found;
    }

    void showCustomers(){
        for(int i = 0; i<customers.size(); i++){
            System.out.println("Customer name: " + customers.get(i).getCustomerName());
        }
    }
}
