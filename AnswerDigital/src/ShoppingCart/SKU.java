package ShoppingCart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;
import java.math.*;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Vector;
/**
 *
 * @author Sophie
 */
public class SKU implements Serializable {
    
    private String productCode;
    private String description;
    private BigDecimal price;
    private String offer;
    
    private ArrayList productCodeArray;
    private ArrayList descriptionArray;
    private ArrayList priceArray;
    private ArrayList offerArray;
    
    public String delimeter = ", ";
    
    private Vector items;
    

    public static void main(String[] args) throws FileNotFoundException {

        // System.out.println(sku.getProductCode());
    }
    
    @Override
    public boolean equals(Object obj){
           return (this == obj);    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.productCode);
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.price);
        hash = 89 * hash + Objects.hashCode(this.items);
        return hash;
    }
    
    
    public void readFile() throws FileNotFoundException{
        
        
        Scanner scanner = new Scanner(new File(getClass().getResource("/resources/products.txt").getFile()));
        
            ArrayList<String> productCodeColumn = new ArrayList<String>();
            ArrayList<String> descriptionColumn = new ArrayList<String>();
            ArrayList<String> priceColumn = new ArrayList<String>();        
            ArrayList<String> offerColumn = new ArrayList<String>();
            
        while(scanner.hasNext()){
        String curLine = scanner.nextLine();
        String[] splitted = curLine.split("\t");
        String productCode = splitted[0].trim();
        String description = splitted[1].trim();
        String price = splitted[2].trim();
        String offer = splitted[3].trim(); //NOTE if Offer column is empty program will crash, add whitespace to Offer column after a tab to prevent this/will add a way to prevent this if I have time
        
        if(!"Product Code".equals(productCode)){
            productCodeColumn.add(productCode);
            this.setProductCode(productCodeColumn);
        }
        if(!"Description".equals(description)){
            descriptionColumn.add(description);
            this.setDescription(descriptionColumn);
        }
        if(!"Price".equals(price)){
            priceColumn.add(price);
            this.setPrice(priceColumn);
        }
        if(!" ".equals(price)){
            offerColumn.add(offer);
            this.setOffer(offerColumn);
        }
    }
        
    // System.out.println(productCodeColumn); //Debugging - Print productCode Array
    // System.out.println(descriptionColumn); //Debugging - Print description Array
    // System.out.println(priceColumn); //Debugging - Print price Array
    
    
    /*
    		System.out.println("STOCK LIST");
		System.out.println("--------------");
		for (int i = 0; i < productCodeColumn.size(); i++) {
                    int x = i + 1;
                        System.out.println("Item " + x);
			System.out.print(productCodeColumn.get(i));
                        System.out.print(delimeter);
                        System.out.print(descriptionColumn.get(i));
                        System.out.print(delimeter);
                        System.out.print(priceColumn.get(i));
                        System.out.println();
		}
    */
             
            scanner.close(); //REMEMBER TO CLOSE THE SCANNER

    }
    
    
    
    //GET Value for productCode
    public ArrayList getProductCode() {
        return productCodeArray;
    }
    
    //GET Value for desription
    public ArrayList getDescription() {
        return descriptionArray;
    }
    
    //GET Value for price
    public ArrayList getPrice() {
        return priceArray;
    }
 
    public ArrayList getOffer() {
        return offerArray;
    }
    
    //SET Value for productCode
    public void setProductCode(ArrayList productCodeColumn) {
       ArrayList<String> productCodeArray = new ArrayList<String>();
       this.productCodeArray = productCodeColumn;
    }

    //SET Value for desription
    public void setDescription(ArrayList descriptionColumn) {
       ArrayList<String> descriptionArray = new ArrayList<String>();
       this.descriptionArray = descriptionColumn;
    }

    //SET Value for price
    public void setPrice(ArrayList priceColumn) {
       ArrayList<String> priceArray = new ArrayList<String>();
       this.priceArray = priceColumn;
    }
    
    public void setOffer(ArrayList offerColumn) {
       ArrayList<String> offerArray = new ArrayList<String>();
       this.offerArray = offerColumn;
    }

    

    
    
     
    
}
