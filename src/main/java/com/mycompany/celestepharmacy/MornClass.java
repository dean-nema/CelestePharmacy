
package com.mycompany.celestepharmacy;

/**
 *
 * @author ssstepbro
 */
public class MornClass {
    //variables
    private String name = "";
    private int amount = 0;
    private int cost = 0;
    
    
    //constructors
    //default constructor

    public MornClass() {
        name = "";
        amount = 0;
        cost = 0;
    }
    
    
   //parameterised constructor
    
    public MornClass(String name, int amount, int cost){
        this.name = name;
        this.amount = amount;
        this.cost = cost;
    }
    
    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
    //getters

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getCost() {
        return cost;
    }
    
    
    
    //toStirng

    @Override
    public String toString() {
        String st = "Name = " + name + ", Amount = " + amount + ", Cost = " + cost;
        return st ;
    }
    
    
    //methods
    
    public void addAmount(int amount){
        this.amount += amount;
    }
    
    public void subAmount(int amount){
        this.amount -= amount;
    }
    
    public int calcCost(int amnt){
        return cost*amnt;
    }
    
    
}
