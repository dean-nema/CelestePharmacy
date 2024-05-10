
package com.mycompany.celestepharmacy;

import java.sql.Date;

/**
 *
 * @author ssstepbro
 */
public class EndOfDay {
    //variables
    private double change = 0;
    private double floatt = 0;
    private double computerSales =0;
    private double  totalExpenses = 0;
    private Date date = null;
    private double collectedAmount =0;
    private double totalCollected = 0;
    private double totalMade = 0;
    private double tillAmount = 0;
    private String shift = "";
    private int eid = 0;
    
    //constructors 

    public EndOfDay() {
        change = 0;
        computerSales = 0;
        totalExpenses = 0;
        date = null;
        collectedAmount =0;
        totalMade = 0;
        tillAmount =0;
        floatt = 0;
        shift = "";
        eid = 0;
    }
    public EndOfDay(int accId, double change, double collected, double till, double tCollected, String shift, Date date) {
        this.eid = accId;
        this.change = change;
        this.collectedAmount = collected;
        this.tillAmount = till;
        this.totalCollected = tCollected;
        this.shift = shift;
        this.date = date;
    }
    
    public EndOfDay(Double ch, double comp, double totExp, Date date, double coll,double totcol, double totMad, double till, double ft, String sh, int eid){
        this.change = ch;
        this.computerSales = comp;
        this.totalExpenses = totExp;
        this.date = date;
        this.collectedAmount = coll;
        this.totalCollected = totcol;
        this.totalMade = totMad;
        this.tillAmount = till;
        this.floatt = ft;
        this.shift = sh;
        this.eid = eid;
    }
    
    //getters

    public double getFloatt() {
        return floatt;
    }

    public String getShift() {
        return shift;
    }

    public int getEid() {
        return eid;
    }
    
    

    public double getChange() {
        return change;
    }

    public double getComputerSales() {
        return computerSales;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public Date getDate() {
        return date;
    }

    public double getCollectedAmount() {
        return collectedAmount;
    }

    public double getTotalCollected() {
        return totalCollected;
    }

    public double getTotalMade() {
        return totalMade;
    }

    public double getTillAmount() {
        return tillAmount;
    }
    
    //setters

    public void setFloatt(double floatt) {
        this.floatt = floatt;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }
    
    

    public void setChange(double change) {
        this.change = change;
    }

    public void setComputerSales(double computerSales) {
        this.computerSales = computerSales;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCollectedAmount(double collectedAmount) {
        this.collectedAmount = collectedAmount;
    }

    public void setTotalCollected(double totalCollected) {
        this.totalCollected = totalCollected;
    }

    public void setTotalMade(double totalMade) {
        this.totalMade = totalMade;
    }

    public void setTillAmount(double tillAmount) {
        this.tillAmount = tillAmount;
    }
    
    //toString

    @Override
    public String toString() {
        return "EndOfDay{" + "change=" + change + ", floatt=" + floatt + ", computerSales=" + computerSales + ", totalExpenses=" + totalExpenses + ", date=" + date + ", collectedAmount=" + collectedAmount + ", totalCollected=" + totalCollected + ", totalMade=" + totalMade + ", tillAmount=" + tillAmount + ", shift=" + shift + ", eid=" + eid + '}';
    }

    

    
   
    
}
