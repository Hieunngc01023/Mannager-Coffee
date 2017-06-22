/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intity;

import java.util.Date;

/**
 *
 * @author Win 8.1 Version 2
 */
public class Store {
    private String gooodsName;
    private float quantity;
    private String unit;
    private float price;
    private Date dateImport;
    
    public Store() {
    }

    public Store(String gooodsName, float quantity, String unit, float price, Date dateImport) {
        this.gooodsName = gooodsName;
        this.quantity = quantity;
        this.unit = unit;
        this.price = price;
        this.dateImport = dateImport;
    }

    public String getGooodsName() {
        return gooodsName;
    }

    public float getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public float getPrice() {
        return price;
    }

    public Date getDateImport() {
        return dateImport;
    }

    public void setGooodsName(String gooodsName) {
        this.gooodsName = gooodsName;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDateImport(Date dateImport) {
        this.dateImport = dateImport;
    }

    public void getDateImport(java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
