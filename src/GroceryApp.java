
import java.util.ArrayList;
import java.util.Scanner;

/* This is Grocery Invoivce Application
 * The programs accepts the name, price and quantity of two grocery items
 * it calculates the cost of each item by multiplying the cost with the quantity
 * It displays all the details of the groceries including the cost
 * calculates the total purchase by adding the costs of each grocery items
 *
*/

public class GroceryApp {
    public static void main(String[] args){

        // ask the name of the grocery , price and quantitiy

        Scanner input = new Scanner(System.in);
        // initialize purchaseTotal to zero
        double purchaseTotal=0;
        System.out.println("Welcome to Grocery Invoice Application !");
        // declare the variables in array list

        ArrayList<String> name =new ArrayList<String>();
        ArrayList<Double> price =new ArrayList<Double>();
        ArrayList<Integer> quant =new ArrayList<Integer>();
        ArrayList<Double> totalcost =new ArrayList<Double>();
        int count=0;
        System.out.println("PLease Enter the details for first grocery app ");

        // Enter the name , price and quantity of two Grocery items

        while(count<2) {

            System.out.println("Please enter the name of the Grocery Item:  ");
            String name1= input.next();
            name.add(name1);
            System.out.println("Please enter the price of the Grocery Item: ");
            double price1 = input.nextDouble();
            price.add(price1);
            System.out.println("Please enter the quantity  of the first Item: ");
            int Quant1 = input.nextInt();
            quant.add(Quant1);
            count++;
        }

        System.out.println("  ******* Grocery Invoice Application ******** ");
        System.out.println("Item Name"+"\t\t" + "Price"+"\t\t"+ "Quantity"+"\t\t" +"Cost");

        for(int i=0;i<2;i++){

            double cost = price.get(i)*quant.get(i);                            //this calculates the cost of the grocery item by price*quantity
            totalcost.add(cost);                                                 // Adds the the cost into the array list
            purchaseTotal = purchaseTotal+totalcost.get(i);                      // computes the total purchase
            System.out.println(name.get(i)+ "\t\t\t"+ "$"+price.get(i)+
            "\t\t"+ quant.get(i) +"\t\t\t"+"$"+totalcost.get(i));                  // outputs the details on the screen

        }

        // outputs the total purchase purchase
        System.out.println("\nTotal purchase Amount : "+ purchaseTotal+"\n");



    }
}
