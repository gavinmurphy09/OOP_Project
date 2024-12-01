/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessapp;

import java.io.Serializable;

/**
 *
 * @author AFF COMPUTERS
 */
public class Business implements Serializable{
    protected String businessName;
    protected double revenue;
    protected double saleAmount;
    protected double overheads;
    protected double profits;

    public Business(){
        
    }
    
    public Business(String businessName, double revenue) {
        this.businessName = businessName;
        this.revenue = revenue;

    }
    
    

    public String getBusinessName() {
        return businessName;
    }

    public double getRevenue() {
        return revenue;
    }

    public double getSaleAmount() {
        return saleAmount;
    }

    public double getOverheads() {
        return overheads;
    }

    public double getProfits() {
        return profits;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public void setOverheads(double overheads) {
        this.overheads = overheads;
    }

    @Override
    public String toString() {
        return "Business{" + "businessName=" + businessName + ", revenue=" + revenue + ", saleAmount=" + saleAmount + ", overheads=" + overheads + ", profits=" + profits + '}';
    }
    


    
    //action methods
    public double costCalc(){
      return revenue;
    }
    public double calcReturn(){
        return profits=saleAmount -overheads;
    }
    public int esg(){
        return 100;
    }
    
    
}
