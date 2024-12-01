/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessapp;

/**
 *
 * @author AFF COMPUTERS
 */
public class Textile extends Business{
    private final double naturalTextile = 25;
    private int  itemsSold;
    private double  textileCost;
    private double upgradeCost;
    private double grant;

    public Textile(String businessName, double revenue, int itemsSold, double textileCost, double upgradeCost) {
        super( businessName, revenue);
        this.itemsSold = itemsSold;
        this.textileCost = textileCost;
        this.upgradeCost = upgradeCost;
    }

    public int getItemsSold() {
        return itemsSold;
    }

    public double getTextileCost() {
        return textileCost;
    }

    public double getUpgradeCost() {
        return upgradeCost;
    }

    public void setItemsSold(int itemsSold) {
        this.itemsSold = itemsSold;
    }

    public void setTextileCost(double textileCost) {
        this.textileCost = textileCost;
    }

    public void setUpgradeCost(double upgradeCost) {
        this.upgradeCost = upgradeCost;
    }

    @Override
    public String toString() {
        return  "Textile{"+" Name="+ super.businessName+", Revenue=" +super.revenue  + ", itemsSold=" + itemsSold + ", textileCost=" + textileCost + ", upgradeCost=" + upgradeCost + '}';
    }
    

    //action methods
    public void textileCalc(){
        
    }
    @Override
    public double costCalc(){
        return (textileCost*itemsSold)+upgradeCost -grant;
    }
    public double plasticCalc(){
        return itemsSold * naturalTextile;
    }
    public int esgCalc(){
        return (((int)naturalTextile*itemsSold)/100)*7;
    }


}


