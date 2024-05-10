
package com.mycompany.celestepharmacy;

import java.sql.Date;
/**
 *
 * @author ssstepbro
 */
public class Sales {
    // variables
    private String item = "";
    private int amount = 0;
    private int  cost = 0;
    private String  department = "";
    private Date date = null;
    private int sid = 0;
    //constructor
    //default constructor

    public Sales() {
        item = "";
        amount = 0;
        cost = 0;
        department = "";
        date = null;
        sid = 0;
    }
    //parameterised constructor
    public Sales(int said,String item, int amount, int cost, String department, Date date){
        this.sid = said;
        this.item = item;
        this.amount = amount;
        this.cost = cost;
        this.department = department;
        this.date = date;
       
    }
    
    //setters

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
    
    

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
    
    //getters

    public Date getDate() {
        return date;
    }

    public int getSid() {
        return sid;
    }

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
    //methods
    
     public String[] toTable(){
         String[] data = {String.valueOf(sid), item, String.valueOf(amount), String.valueOf(cost), String.valueOf(department), String.valueOf(date)  };
                
        return data;
    }
    //toString

    @Override
    public String toString() {
        return "Sales{" + "item=" + item + ", amount=" + amount + ", cost=" + cost + ", department=" + department + ", date=" + date + ", sid=" + sid + '}';
    }
    
    
}
