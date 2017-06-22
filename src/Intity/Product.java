/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intity;

/**
 *
 * @author Hieunngc01023
 */
public class Product
{
    private String namTable;
    private String productID;
    private String type;
    private String name;
    private float price;
    private int number;
    private float money;
    public Product() {
    }

    public Product(String namTable, String productID, String type, String name, float price, int number, float money) {
        this.namTable = namTable;
        this.productID = productID;
        this.type = type;
        this.name = name;
        this.price = price;
        this.number = number;
        this.money = money;
    }

   

    
   
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getNamTable() {
        return namTable;
    }

    public void setNamTable(String namTable) {
        this.namTable = namTable;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
    
    
}
