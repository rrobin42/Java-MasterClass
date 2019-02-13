import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        List<String> carSaved;
        while(!quit){
            System.out.println("1 to start");
            choice = Integer.parseInt(s.nextLine());
            if(choice == 1){
                ISaveable car1 = new Honda("civic", 120);
                carSaved = car1.write();
                car1.read(carSaved);
            }
            else {
                quit = true;
            }
        }
    }

    static void saveObject(ISaveable object){
        for(int i = 0; i<object.write().size(); i++){
            System.out.println("Saving "+ object.write().get(i));
        }
    }
}
