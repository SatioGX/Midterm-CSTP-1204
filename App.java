import Child.Americano;
import Child.Cappuccino;
import Child.Latte;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import Parent.Espresso;

public class App {
    public static void main(String[] args) throws Exception {

        boolean ordering = true;
        double bill = 0;
        ArrayList orderDetails = new ArrayList();

        //A Do While loop to allow multiple drinks
        do{
            System.out.println("WELCOME TO BANANA CAFE\n");
            System.out.println("What drink would you like?\nPick a number.\n1.Espresso\n2.Americano\n3.Cappuccino\n4.Latte\n");     
            //Try catch block to find errors and exit gracefully if incorrect value is given      
            try {
                Scanner drinkChoice = new Scanner(System.in);
                int choice = drinkChoice.nextInt();
                //Switch statment for choices
                switch(choice){
                    case 1:
                        System.out.println("Espresso\n");
                        Espresso espresso = new Espresso("Espresso", 0.99, "None");
                        espresso.makeDrink();
                        System.out.println();
                        espresso.setTopping(espresso.chooseTopping());
                        bill += espresso.getPrice();
                        espresso.drinkDetails();
                        orderDetails.add(espresso);
                        break;
                    case 2:
                        Espresso americano = new Americano("Americano", 1.99, "None", "Water");
                        americano.makeDrink();
                        System.out.println();
                        americano.setTopping(americano.chooseTopping());
                        bill += americano.getPrice();
                        americano.drinkDetails();
                        orderDetails.add(americano);
                        break;
                    case 3:
                        System.out.println("Cappuccino\n");
                        Espresso cappuccino = new Cappuccino("Cappuccino", 2.99, "None", "Foam");
                        cappuccino.makeDrink();
                        System.out.println();
                        cappuccino.setTopping(cappuccino.chooseTopping());
                        bill += cappuccino.getPrice();
                        cappuccino.drinkDetails();
                        orderDetails.add(cappuccino);
                        break;      
                    case 4:
                        System.out.println("Latte\n");
                        Espresso latte = new Latte("Latte", 3.99, "None", "Milk");
                        latte.makeDrink();
                        System.out.println();
                        latte.setTopping(latte.chooseTopping());
                        bill += latte.getPrice();
                        latte.drinkDetails();
                        orderDetails.add(latte);
                        break;
                    default: System.out.println(choice + " is not a choice.\n");
                }
            } catch (Exception e) {
                System.out.println("Enter a number please.");
            }

            System.out.println("Would you like to continue?\n1. Yes\n2. No");
            Scanner order = new Scanner(System.in);
            String anotherDrink = order.nextLine();
            if(anotherDrink.equalsIgnoreCase("yes") || anotherDrink.equalsIgnoreCase("y") || Integer.parseInt(anotherDrink) == 1){
                ordering = true;
                System.out.println();
            }else if(anotherDrink.equalsIgnoreCase("no") || anotherDrink.equalsIgnoreCase("n") || Integer.parseInt(anotherDrink) == 2){
                ordering = false;
                System.out.println();
            }
        }while(ordering == true);

        //Final total of the bill taht will display with the format $#.##
        DecimalFormat decimalFormat = new DecimalFormat("#.##");      
        System.out.println("Total number of drinks: " + orderDetails.size());
        System.out.println("Your total bill is: $" + decimalFormat.format(bill) + "\nHave good day :)");
    }

}
