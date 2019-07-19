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

    private PropertyChangeSupport propertySupport;

    public Saving() {
        propertySupport = new PropertyChangeSupport(this);
    }

    public String getSavingDescription() {
        return savingDescription;
    }

    public String getSavingType() {
        return savingType;
    }


    public void setSavingDescription(String savingDescriptionInput) {
        String oldValue = sampleProperty;
        sampleProperty = savingDescriptionInput;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }

    public void setSavingType(String savingTypeInput) {
        String oldValue = sampleProperty;
        sampleProperty = savingTypeInput;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }

    public Double getTotalSaving(){
        return totalSaving;
    }
    
    public void setTotalPrice(Double totalSavingCalc){
        this.totalSaving = totalSavingCalc;
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

}
