/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShoppingCart;

import java.beans.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author scollin3
 */
public class Saving implements Serializable {

    private String savingDescription;
    private String savingType;
    private String saving;
    private Double totalSaving = 0.0;

    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";

    private String sampleProperty;



    public Saving() {
        
    }

    public String getSavingDescription() {
        return savingDescription;
    }

    public String getSavingType() {
        return savingType;
    }


    public void setSavingDescription(String savingDescriptionInput) {

    }

    public void setSavingType(String savingTypeInput) {

    }

    public Double getTotalSaving(){
        return totalSaving;
    }
    
    public void setTotalPrice(Double totalSavingCalc){
        this.totalSaving = totalSavingCalc;
    }

}
