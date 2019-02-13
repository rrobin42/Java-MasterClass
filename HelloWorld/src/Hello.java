public class Hello {

    public static void main(String args []){
        System.out.println("Hello");

        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 50;
        long longVar = 50000 + 10 * (byteVar+shortVar+intVar);

        float floatVar = (float)5.1;

        System.out.println(longVar);
    }

}
