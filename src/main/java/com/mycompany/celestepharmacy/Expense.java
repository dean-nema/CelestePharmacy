
package com.mycompany.celestepharmacy;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author ssstepbro
 */
public class Expense {
    //local variables
    private String description = "";
    private int expId = 0;
    private double amount = 0.0;
    private Date date = null;

    
    //constructors 
    
    public Expense() {
        description = "";
        amount = 0.0;
        date = null;
        expId = 0;
    }
    
    public Expense(int expid, String desc, Double amt, Date date){
        this.expId = expid;
        this.description = desc;
        this.amount = amt;
        this.date = date;
    }
    
    //getters

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public int getExpId() {
        return expId;
    }
    
    //setters

    public void setDescription(String Description) {
        this.description = Description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setExpId(int expId) {
        this.expId = expId;
    }
    
    
    //methods
    
    public String[] toTable(){
         String[] data = {String.valueOf(expId), description, String.valueOf(amount), String.valueOf(date),  };
                
        return data;
    }
    
    //toString

    @Override
    public String toString() {
        return "Expense{" + "Description=" + description + ", amount=" + amount + ", date=" + date + '}';
    }
    
    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        
        Date date = new Date(now);
       // Expense a = new Expense("Dean", 90.0, date);
//        String[] data = a.toTable();
//        System.out.println(data[2]);
      
        
    }
    
}
