/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShoppingCart;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sophie
 */
public class Store implements Offers {

    public static void main(String[] args) throws FileNotFoundException {

        SKU sku = new SKU();
        sku.readFile();

        Store store = new Store();
        store.stockList();
        
        

        Till till = new Till();

        System.out.println("Enter desired Product Codes from the list above to add to cart, or \"*\" to finish: ");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String enteredCode = myObj.nextLine();  // Read user input 

        while (!enteredCode.equalsIgnoreCase("*")) {
            
            if ((sku.getProductCode().contains(enteredCode))){

            till.scan(enteredCode); 

            } else if (!(sku.getProductCode().contains(enteredCode))) {
                System.out.println("Please enter a valid Product Code! (or \"*\" to finish): ");
            }
            
           // System.out.println(enteredCode); //DEBUGGING - Check it's reading the right input
           enteredCode = myObj.nextLine();    

        }
        
        /*
        System.out.println("BASKET");
        System.out.println("--------------");
        for (int i = 0; i < till.getBasket().size(); i++) {
            int x = i + 1;
            System.out.println("Item " + x);
            System.out.print(till.getBasket().get(i));
            System.out.println();
        }
        System.out.println("--------------------------------");
        */
        
        System.out.println(till.getBasket());
    }

    //A method to display the Stock List read from the file
    public void stockList() throws FileNotFoundException {

        SKU sku = new SKU();
        sku.readFile();

        System.out.println("STOCK LIST");
        System.out.println("--------------");
        for (int i = 0; i < sku.getProductCode().size(); i++) {
            int x = i + 1;
            System.out.println("Item " + x);
            System.out.print(sku.getProductCode().get(i));
            System.out.print(sku.delimeter);
            System.out.print(sku.getDescription().get(i));
            System.out.print(sku.delimeter);
            System.out.print(sku.getPrice().get(i));
            System.out.println();
        }
        System.out.println("--------------------------------");
    }
  

    @Override
    public BigDecimal totalSavings(int quantity, BigDecimal itemprice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
