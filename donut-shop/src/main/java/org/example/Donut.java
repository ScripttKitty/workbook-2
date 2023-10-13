package org.example;

public class Donut {


    //Variables
    String type;
    String description;
    int calories;
    double price;

    //Default Constructor
    Donut(){
}

//Parameterized constructor
public Donut(String type, int calories, double price, String description){
        this.type = type;
        this.calories = calories;
        this.price = price;
        this.description = description;
}


//toString method
public String toString() {

return "Donut: " + type +
           "\nCalories: " + calories +
            "\nPrice: " + price +
            "\nDescription: " + description +"\n"

        ;

}


}
