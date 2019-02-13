import java.util.Scanner;

class Burger{
    private String name;
    private String bread;
    private String meat;
    private String lettuceS = "Lettuce";
    private String cheeseS = "Cheese";
    private String tomatoS = "Tomatoes";
    private String sauceS = "Sauce";
    protected boolean lettuce;
    protected boolean cheese;
    protected boolean tomato;
    protected boolean sauce;
    private double basePrice;
    private double finalPrice = 0;

    public Burger(String name) {
        this.name = name;
    }

    public void buildBurger(){
        this.basePrice = 5.0;
        this.finalPrice += basePrice;

        Scanner scanner = new Scanner(System.in);

        int topping = 0;


            do {
                String hamburger = "hamburger";
                System.out.println("Add toppings. 0 - DONE. 1 - lettuce, 2 - cheese, 3 - tomato, 4 - sauce");
                topping = Integer.parseInt(scanner.nextLine());
                if (topping == 1) {
                    lettuce = true;
                } else if (topping == 2) {
                    cheese = true;
                } else if (topping == 3) {
                    tomato = true;
                } else if (topping == 4) {
                    sauce = true;
                } else if (topping == 0) {
                    break;
                }
            } while (topping != 0);



        if(lettuce){
            this.finalPrice = finalPrice + 0.30;
        }
        if(cheese){
            this.finalPrice = finalPrice + 0.30;
        }
        if(tomato){
            this.finalPrice = finalPrice + 0.30;
        }
        if(sauce){
            this.finalPrice = finalPrice+ 0.30;
        }

        System.out.println("Here is your bill:");
        System.out.println("Burger: " + name);
        System.out.println("with rye bread and beef");
        System.out.println("Base price: $" + basePrice);
        if(lettuce || cheese  || tomato || sauce){
            if(lettuce){
                System.out.println(lettuceS + ": .30");
            }
            if(cheese){
                System.out.println(cheeseS + ": .30");
            }
            if(tomato){
                System.out.println(tomatoS + ": .30");
            }
            if(sauce){
                System.out.println(sauceS + ": .30");
            }
        }
        System.out.println("Final price: " + finalPrice);
    }
}

class Healthy extends Burger{

    private String avocadoS = "Avocado";
    private String pickleS = "Pickle";
    private boolean avocado;
    private boolean pickle;
    private double basePrice;
    private double finalPrice = 0;



    public Healthy(String name) {
        super(name);

    }

    @Override
    public void buildBurger(){
        this.basePrice = 6.0;
        this.finalPrice += basePrice;
        Scanner scanner = new Scanner(System.in);

        int topping;


        do {
            String hamburger = "hamburger";
            System.out.println("Add toppings. 0 - DONE. 1 - lettuce, 2 - cheese, 3 - tomato, 4 - sauce" +
                    ", 5 - avocado, 6 - pickle");
            topping = Integer.parseInt(scanner.nextLine());
            if (topping == 1) {
                lettuce = true;
            } else if (topping == 2) {
                cheese = true;
            } else if (topping == 3) {
                tomato = true;
            } else if (topping == 4) {
                sauce = true;
            } else if (topping == 5) {
                avocado = true;
            } else if (topping == 6){
                pickle = true;
            }
            else if (topping == 0) {
                break;
            }
        } while (topping != 0);



        if(lettuce){
            this.finalPrice = finalPrice + 0.30;
        }
        if(cheese){
            this.finalPrice = finalPrice + 0.30;
        }
        if(tomato){
            this.finalPrice = finalPrice + 0.30;
        }
        if(sauce){
            this.finalPrice = finalPrice+ 0.30;
        }
        if(avocado){
            this.finalPrice = finalPrice + .30;
        }
        if(pickle){
            this.finalPrice = finalPrice +.3;
        }

        System.out.println("Here is your bill:");
        System.out.println("Burger: Healthy");
        System.out.println("with rye bread and beef");
        System.out.println("Base price: $" + basePrice);
        if(lettuce || cheese  || tomato || sauce){
            if(lettuce){
                System.out.println("Lettuce: .30");
            }
            if(cheese){
                System.out.println("Cheese: .30");
            }
            if(tomato){
                System.out.println("Tomato: .30");
            }
            if(sauce){
                System.out.println("Sauce: .30");
            }
            if(avocado){
                System.out.println("Avocado: .30");
            }
            if(pickle){
                System.out.println("Pickle: .30");
            }
        }
        System.out.println("Final price: " + finalPrice);
    }
    }

class Deluxe extends Burger{

    private double finalPrice = 10.0;
    public Deluxe(String name) {
        super(name);
    }

    @Override
    public void buildBurger() {
        System.out.println("Here is your bill");
        System.out.println("Burger: Deluxe");
        System.out.println("with regular bread and beef");
        System.out.println("With Chips and Drink");
        System.out.println("Final Price: " + this.finalPrice);

    }
}


public class Main {


    public static void main(String... args) {
        boolean lettuce = false;
        boolean cheese = false;
        boolean tomato = false;
        boolean sauce = false;

        System.out.println("Welcome to Bill's Burgers!");
        System.out.println("What type of burger would you like? 1 - Basic, 2 - healthy or 3- deluxe?");

        Scanner scanner = new Scanner(System.in);
        int b = Integer.parseInt(scanner.nextLine());

        Burger burger;

        switch(b){
            case 1:
                burger = new Burger("burger");
                burger.buildBurger();
                break;
            case 2:
                burger = new Healthy("healthy");
                burger.buildBurger();
                break;
            case 3:
                burger = new Deluxe("deluxe");
                burger.buildBurger();
                break;
            default:
                break;
        }


    }
}