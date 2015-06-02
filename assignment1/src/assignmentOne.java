/*
 * Justin Goldsmith
 * June 1, 2015
 * CPT167 Vaseashta
 * Assignment 1 - Source Code
 * 
 * Version 1.4.2
 */

//import the Scanner class from the java.util package
import java.util.Scanner;
import java.text.DecimalFormat;

public class assignmentOne {
    public static void main(String[] args){
        
        //Create a scanner object to receive direct user input
        //Create a DecimalFormat object to format monetary values 
        //to display in x.xx format
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        String school = "TTC";
        double discountPrcnt = 0.37;
        
        for (int i=0; i<50; i++){
            System.out.println("\r\n");
            i++;
        }
        
        //Create a title area and give it to jazz it up a bit
        System.out.println("Welcome to Justin's Assignment 1 Program!");
        System.out.println("*****************************************");
        System.out.println();
        
        //prompt user for input then assign input using the scanner obj
        //we created on line 17
        System.out.print("What is your name? ");
        String name = input.nextLine();
        
        System.out.println("It's very nice to meet you, " + name + ".");
        System.out.println("");
        
        System.out.print("So, " + name + " how many years have you been attending " + school + "? ");
        String years = input.nextLine();
        System.out.println("");
        respondToYears(years);
        
        System.out.print("So how many items are you buying today, " + name + "? ");
        int itemQty = input.nextInt();
        System.out.print("And what is the price on the pricetag? ");
        double itemPrc = input.nextDouble();
        double discountPrc = calculateDiscountPrice(itemQty, itemPrc, discountPrcnt);
        System.out.println();
        
        System.out.println("OK, " + name + ", here's what we've got...\n");
        System.out.println("Your name is: " + name);
        System.out.println("Years at " + school + ": " + years);
        System.out.println("Total items: " + itemQty);
        System.out.println("Item price: $" + df.format(itemPrc));
        System.out.println();
        System.out.println("Good news! Everyone gets a 37% discount today!");
        System.out.println("So each item is only $" + df.format(itemPrc - (itemPrc * discountPrcnt)));
        System.out.println();
        System.out.println("That brings your total to $" + df.format(discountPrc));
        System.out.println();
        
        System.out.println("HAVE A GREAT DAY!");
        //program terminates here
    }
    
    
    //A method to respond conditionally to the value given for years
    public static void respondToYears(String years){
        
        if (years.equals(years)){
            int yearsInt = Integer.parseInt(years);
            
            if (yearsInt > 4){
                System.out.println("Taking all the time you need, I see...");
                System.out.println("");
            } else {
                System.out.println("I hope you're enjoying it so far!");
                System.out.println("");
            }
        }
    }
    
    
    //A method to calculate the discounted price and return the calculated value
    public static double calculateDiscountPrice(double itemQty, double itemPrc, double discountPrcnt){
        double discount;
        double discountPrc;
        double totalPrc;
        //double itemQtyInt; // = Integer.parseInt(itemQty);
        //double itemPrcInt; // = Integer.parseInt(itemPrc);
        
        totalPrc = itemQty * itemPrc;
        discount = totalPrc * discountPrcnt;
        discountPrc = totalPrc - discount;
        
        return discountPrc;
    }
    
}
