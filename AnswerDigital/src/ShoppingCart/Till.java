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
        Double totalPrice = 0.0;
           
    public ArrayList scan(String enteredCode){

       SKU sku = new SKU();
       

           basket.add(enteredCode);
           this.setReceipt(basket);
       
       
       return basket;
    }
    
    
    public ArrayList getReceipt(){
        return currentBasket;
    }
    
    public void setReceipt(ArrayList basket){
       ArrayList<String> currentBasket = new ArrayList<String>();
       this.currentBasket = basket;
    }
    
    public Double getTotalPrice(){
        return totalPrice;
    }
    
    public void setTotalPrice(String totalPriceString){
        this.totalPrice = this.totalPrice + Double.parseDouble(totalPriceString);
    }
    
}
