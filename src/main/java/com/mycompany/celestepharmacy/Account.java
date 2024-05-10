
package com.mycompany.celestepharmacy;

import java.sql.Date;

/**
 *
 * @author ssstepbro
 */
public class Account {
    //variable
    private String item = "";
    private double amount = 0.0;
    private int accId = 0;
    private Date date = null;
    
    //constructors

    public Account() {
        item = "";
        amount = 0;
        accId = 0;
        date = null;
    }
    
    public Account(String item, int amt, int acc, Date date){
        this.item = item;
        this.amount = amt;
        this.accId = acc;
    }
    
    //getters

    public String getItem() {
        return item;
    }

    public double getAmount() {
        return amount;
    }

    public int getAccId() {
        return accId;
    }

    public Date getDate() {
        return date;
    }
    

     //setters
    public void setDate(Date date) {
        this.date = date;
    }
    
    

    public void setItem(String item) {
        this.item = item;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }
    
    //methods
    
    public String[] toTable(){
         String[] data = {String.valueOf(accId), item, String.valueOf(amount), String.valueOf(date),  };
                
        return data;
    }
    
    //toStrings

    @Override
    public String toString() {
        return "Account{" + "item=" + item + ", amount=" + amount + ", accId=" + accId + ", date=" + date + '}';
    }
    
    
    
    
}
