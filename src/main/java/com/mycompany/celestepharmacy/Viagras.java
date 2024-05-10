
package com.mycompany.celestepharmacy;

/**
 *
 * @author ssstepbro
 */
public class Viagras {
    //variables
    private String name = "";
    private int amount = 0;
    private int cost = 0;
    //constructors
    //default constructor

    public Viagras() {
        this.name = " ";
        this.amount = 0;
        this.cost = 0;
    }
   
    //parameterised constructor
    public Viagras(String name, int amount, int cost) {
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

    public  int getCost() {
        return cost;
    }
    
    //toString

    @Override
    public String toString() {
        String st = "Name = " + name + ", Amount = " + amount + ", Cost = " + cost;
        return st ;
    }
    
    //methods
    public void addAmount(int num){
        amount += num;
    }
    
    public void subAmount(int num){
        amount-=num;
    }
    
    public int calcCost(int amnt){
        return amnt*cost;
    }
    //toFile
    
    
}
