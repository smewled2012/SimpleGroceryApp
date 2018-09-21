import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/* This is Grocery Invoivce Application
 * The program accepts the name and price of two grocery items
 * the quantity of the two grocery items is randomly generated between 1 and 10
 * it calculates the cost of each item by multiplying the cost with the quantity
 * It displays all the details of the groceries including the cost
 * calculates the total purchase by adding the costs of each grocery items
 * if your purchase is greater than 20 it will tell you you spend alot
 * otherwise it will thank you and finish
 *
 */

public class GroceryAppBonus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        double purchaseTotal=0;
        System.out.println("Welcome to Grocery Invoice Application !");

        ArrayList<String> name =new ArrayList<String>();
        ArrayList<Double> price =new ArrayList<Double>();
        ArrayList<Integer> quant =new ArrayList<Integer>();
        ArrayList<Double> totalcost =new ArrayList<Double>();
        int count=0;
        System.out.println("PLease Enter the details for first grocery app ");


     // Enter the details of two grocery items
        while(count<2) {

            System.out.println("Please enter the name of the Grocery Item:  ");
            String name1= input.next();
            name.add(name1);
            System.out.println("Please enter the price of the Grocery Item: ");
            double price1 = input.nextDouble();
            price.add(price1);
            int Quant1=rand.nextInt((9) + 1) +1;     // this generates a random number for the quantity from 1 to 10
            quant.add(Quant1);
            count++;
        }

        System.out.println("  ******* Grocery Invoice Application ******** ");
        System.out.println("Item Name"+"\t\t" + "Price"+"\t\t"+ "Quantity"+"\t\t" +"Cost");

        for(int i=0;i<2;i++){

            double cost = price.get(i)*quant.get(i);
            totalcost.add(cost);
            purchaseTotal = purchaseTotal+totalcost.get(i);
            System.out.println(name.get(i)+ "\t\t\t"+ "$"+price.get(i)+
                    "\t\t"+ quant.get(i) +"\t\t\t"+"$"+totalcost.get(i) );
        }
        System.out.println("\n\nTotal purchase Amount : "+ purchaseTotal+"\n");


        if(purchaseTotal>20){
            System.out.println("\nYou spent too much today......");
        }
        else{
            System.out.println("\nThank you for shopping at my market!");
        }


    }
}
