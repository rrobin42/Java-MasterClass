import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> contacts;
    Scanner s = new Scanner(System.in);

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact){
        if(!findContact(contact.getName())) {
            contacts.add(contact);
            System.out.println(contact.getName() + " has been added.");
        }
        else{
            System.out.println(contact + " is already in the your phone.");
        }
    }

    public boolean findContact(String contactName){
        boolean found = false;

        for(int i = 0; i<this.contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if(contact.getName().equals(contactName)){
                found = true;
            }
        }
        return found;
    }

    public int findContact(Contact contact){
        int position = 0;
        for(int i = 0; i<this.contacts.size(); i++){
            if(contact.getName().equals(contacts.get(i).getName())){
                position = i;
            }
        }
        return position;
    }

    public void modifyContact(String oldName, String newName){

        if(findContact(oldName)){


            int position = findContact(new Contact(oldName));
            contacts.get(position).setName(newName);
            System.out.println("Enter new contact number");
            contacts.get(position).setNumber(s.nextLine());
            System.out.println("Contact has been updated.");
        }
        else{
            System.out.println("Contact was not found.");
        }
    }

    public void removeContact(Contact contact){
        int contactPosition = findContact(contact);
        if(contactPosition>=0){
            contacts.remove(contactPosition);
            System.out.println("Contact has been removed.");
        }
        else{
            System.out.println("Contact was not found.");
        }
    }

    public void printContacts(){
        System.out.println("hello");
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " " + contact.getNumber());
        }
    }
}
