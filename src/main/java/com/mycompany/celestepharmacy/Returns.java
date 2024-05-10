
package com.mycompany.celestepharmacy;

import java.sql.Date;

/**
 *
 * @author ssstepbro
 */
public class Returns {
    //variables
    private String item = "";
    private int amount = 0;
    private int cost = 0;
    private String department = "";
    private Date date = null;
    
    //Constructor

    public Returns() {
        item = "";
        amount =0;
        cost = 0;
        department = "";
        date = null;
    }
    
    public Returns(String item, int amount , int cost, Date date, String dp){
        this.item = item;
        this.amount = amount;
        this.cost= cost;
        this.department = dp;
        this.date = date;
    }
    
    //setters

    public void setItem(String item) {
        this.item = item;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
    //getters

    public String getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }

    public int getCost() {
        return cost;
    }

    public String getDepartment() {
        return department;
    }

    public Date getDate() {
        return date;
    }
    
    
    //toString 

    @Override
    public String toString() {
        return "Returns{" + "item=" + item + ", amount=" + amount + ", cost=" + cost + ", department=" + department + ", date=" + date + '}';
    }

   
    
}
