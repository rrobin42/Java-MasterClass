import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] readIntegers(int count){
        int[] list = new int[count];

        System.out.println("Enter " + count + " numbers for array: ");
        Scanner input = new Scanner(System.in);

        for(int i = 0; i<list.length; i++){
            list[i] = Integer.parseInt(input.nextLine());
        }

        return list;
    }
    static int findMin(int[] l){
        int min = l[0];

        for(int i = 0; i<l.length; i++){
            if(l[i] < min){
                min = l[i];
            }
        }
        return min;
    }

    static void reverse(int[] l){
        int[] rl = new int[l.length];
        int j = 0;
        for(int i = l.length-1; i >= 0; i--){
            rl[j] = l[i];
            ++j;
        }
        System.out.println("These are the numbers you entered: " + Arrays.toString(l));
        System.out.println("These are the numbers in reverse: " + Arrays.toString(rl));
    }

    public static void main(String... args){
        int[] array = readIntegers(5);
        int miniumNumber = findMin(array);
        System.out.println("The minimum number is " + miniumNumber);
        reverse(array);
    }
}
