import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    private String customerName = "";
    private ArrayList<Double> transactions;
    private double balance;
    Scanner s = new Scanner(System.in);

    public Customer(String customerName, ArrayList<Double> transactions, double balance) {
        this.customerName = customerName;
        this.transactions = transactions;
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void withdraw(){
        System.out.println("How much would you like to withdraw?");
        double withdraw = s.nextDouble();
        s.nextLine();
        transactions.add(-withdraw);
        balance -= withdraw;
    }

    public void deposit(){
        System.out.println("How much would you like to deposit?");
        double deposit = s.nextDouble();
        s.nextLine();

        transactions.add(deposit);
        balance += deposit;
    }

    public void showTransactions(){
        for(int i =0;i<transactions.size(); i++){
            System.out.println(transactions.get(i).doubleValue());
        }
    }
}
