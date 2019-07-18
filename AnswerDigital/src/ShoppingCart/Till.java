/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShoppingCart;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sophie
 */
public class Till {
        ArrayList currentBasket;    
        ArrayList<String> basket = new ArrayList<String>();
           
    public ArrayList scan(String enteredCode){

       SKU sku = new SKU();
       

           basket.add(enteredCode);
           this.setBasket(basket);
       
       
       return basket;
    }
    
    public ArrayList getReceipt(ArrayList currentItems){
        ArrayList<String> finalReceipt = new ArrayList<String>();
        
        return finalReceipt;
    }
    
    public ArrayList getBasket(){
        return currentBasket;
    }
    
    public void setBasket(ArrayList basket){
       ArrayList<String> currentBasket = new ArrayList<String>();
       this.currentBasket = basket;
    }
}
