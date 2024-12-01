/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessapp;

/**
 *
 * @author AFF COMPUTERS
 */
public class Restaurant extends Business {
    private  int compostable;
    private double disposableCost;
    private int unitsSold;
    private double distributorCost;
    
    

    public Restaurant(String businessName, double revenue, int unitsSold, double distributorCost, int compostable) {
        super( businessName, revenue);
        this.unitsSold = unitsSold;
        this.distributorCost = distributorCost;
        this.compostable =compostable;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public double getDistributorCost() {
        return distributorCost;
    }

    public int getCompostable() {
        return compostable;
    }
    

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }

    public void setDistributorCost(double distributorCost) {
        this.distributorCost = distributorCost;
    }

    @Override
    public String toString() {
        return "Restaurant{"+" Name="+ super.businessName+", Revenue=" +super.revenue + "compostable=" + compostable + ", unitsSold=" + unitsSold + ", distributorCost=" + distributorCost + '}';
    }
    
    //action methods
    @Override
    public double costCalc(){
        return (disposableCost*unitsSold)+distributorCost;
    }
    public double plasticCalc(){
        return ((compostable*unitsSold)/100)*7;
    }
    
    
    
}
