import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] getIntegers() {
        System.out.println("Enter a list of integers separated by commas");
        Scanner k = new Scanner(System.in);
        String input = k.nextLine();
        String[] split = input.split(",");


        //Array for input
        int[] list = new int[split.length];
        int j = 0;
        String test = "";
        int length = input.length();
        //Iterate through each character in string and put the integers in an array
        for (int i = 0; i < length; i++) {


            //Check if character is an integer and add to the string
            if (input.charAt(i) != ',') {
                test += input.charAt(i);
            } else {
                list[j] = Integer.parseInt(test);
                test = "";
                j++;
            }

        }

        //For the last integer in the test variable
        list[j] = Integer.parseInt(test);
        test = "";

        return list;
    }

    //method to print array
    static void printArray(int[] plist){
        System.out.println("Print method: " + Arrays.toString(plist));
    }


    //method to sort array
    static void sortArray(int[] slist){
        Arrays.sort(slist);
    }


    public static void main(String... args){
        int[] mainlist = getIntegers();

        printArray(mainlist);

        System.out.println("Now sorting array...");

        sortArray(mainlist);

        printArray(mainlist);
    }
}
