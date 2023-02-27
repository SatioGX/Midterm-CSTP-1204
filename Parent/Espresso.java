package Parent;

import java.util.Scanner;

public class Espresso {
    private String name;
    private double price;
    private String topping;

    public Espresso(String name, double price, String topping) {
        this.name = name;
        this.price = price;
        this.topping = topping;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTopping() {
        return topping;
    }
    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void makeDrink(){
        System.out.println("Pulling shots and making " + getName());
    }

    public void addTopping(){
        System.out.println("Press a number to choose topping: \n1. Cinnimon Dolce \n2. Caramel Drizzle \n3. Chocolate Flakes");
        setTopping(topping);
        System.out.println("Adding toppings " + getTopping());
    }
    public void drinkDetails(){
        System.out.println("Your drink is: " + getName());
        System.out.println("Topping: " + getTopping());
        System.out.println("Price: " + getPrice());
        System.out.println();
    }

    //method for choosing topping. This method will work for all classes that extend espresso
    public String chooseTopping(){
        boolean toppingChoose = false;
        String topping = "No Choice Made.";
        System.out.println("Choose a topping?\nPick a number.\n1.No Topping\n2.Cinnamon\n3.Caramel Drizzle\n4.Chocolate Flakes\n");
        Scanner toppingChoice = new Scanner(System.in);
        int choice = toppingChoice.nextInt();
            switch(choice){
                case 1:
                    topping = "No Topping";
                    toppingChoose = false;
                    return topping;

                case 2:
                    topping = "Cinnamon";
                    toppingChoose = false;
                    break;
                case 3:
                    topping = "Caramel Drizzle";
                    toppingChoose = false;
                    break;     
                case 4:
                    topping = "Chocolate Flakes";
                    toppingChoose = false;
                    break;
                default: System.out.println(choice + " is not a choice.");
                toppingChoose = true;
            }            
        return topping;

        
    }
}
