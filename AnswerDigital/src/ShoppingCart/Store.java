/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShoppingCart;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sophie
 */
public class Store implements Offers {
    
    public String itemCode;
    public Double totalPrice = 0.0;
    private static DecimalFormat df = new DecimalFormat("0.00");

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
        
        
        System.out.println("RECEIPT");
        System.out.println("--------------");
        for (int i = 0; i < till.getReceipt().size(); i++) {
            int x = i + 1;
            // System.out.println("Item " + x);
            // System.out.print(till.getReceipt().get(i));
            String itemCode = (String) (till.getReceipt().get(i));
            // System.out.println(itemCode);
            //while (sku.getProductCode().contains(itemCode)){
                // System.out.println(itemCode);
                int indexNo = sku.getProductCode().indexOf(itemCode);
                System.out.print(sku.getProductCode().get(indexNo));
                System.out.print("  ");
                System.out.print(sku.getDescription().get(indexNo));
                System.out.print("  ");
                System.out.print(sku.getPrice().get(indexNo));
                String currentPrice = (String) sku.getPrice().get(indexNo);
                till.setTotalPrice(currentPrice);
            //}
            System.out.println();
        }
        System.out.println("");
        System.out.println("Total Price before Savings = " + df.format(till.getTotalPrice()));
        System.out.println("Total Price after Savings = ");
        System.out.println("Total Savings = ");
        System.out.println("--------------------------------");
       
        
        System.out.println(till.getReceipt());
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
            System.out.print(sku.delimeter);
            System.out.print(sku.getOffer().get(i));
            System.out.println();
        }
        System.out.println("--------------------------------");
    }
  

    
    
    
    @Override
    public BigDecimal totalSavings(int quantity, BigDecimal itemprice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
