/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intity;

import java.util.logging.Logger;

/**
 *
 * @author Hieunngc01023
 */
public class Table {
    String tableName;
    Boolean status;

    public Table() {
    }

    public Table(String tableName, Boolean status) {
        this.tableName = tableName;
 
        this.status = status;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
 

    

    
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
}
