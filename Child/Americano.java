package Child;

import Parent.Espresso;

public class Americano extends Espresso{
    
    private String fill;

    public Americano(String name, double price, String topping, String fill) {
        super(name, price, topping);
        this.fill = fill;
    }


    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    //Polymorphism here to have the make drink fill with the getFill() method
    public void makeDrink(){
        System.out.println("Pulling shots and making " + getName());
        System.out.println("Adding " + getFill() + " to finish " + getName());
    }
}