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
public class Total {
    private String nameTable;
    private Float total;

    public Total() {
    }

    public Total(String nameTable, Float total) {
        this.nameTable = nameTable;
        this.total = total;
    }

   

  

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getNameTable() {
        return nameTable;
    }

    public void setNameTable(String nameTable) {
        this.nameTable = nameTable;
    }
    
    
}
