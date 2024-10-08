
/*
my source:
https://www.w3schools.com/java/ref_math_round.asp
*/


package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        
        double tipAmt;  
        tipAmt = (cost*(percent/100.0));
        double totalWtip = tipAmt+ cost;
        double perCostBeforeTip = cost/people;
        double TipPerPerson = tipAmt/people;
        double CostPerPerson = totalWtip/people;

        result.append("-------------------------------\n");
        result.append("Total bill before tip: $"+cost +"\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: "+percent+"%"+"\n");
        result.append("Total tip: $"+ Math.round(tipAmt*100)/100.0+"\n");
        result.append("Total Bill with tip: $"+Math.round(totalWtip*100)/100.0+"\n");
        result.append("Per person cost before tip: $"+Math.round(perCostBeforeTip*100)/100.0+"\n");
        result.append("Tip per person: $"+Math.round(TipPerPerson*100)/100.0+"\n");
        result.append("Total cost per person: $"+Math.round(CostPerPerson*100)/100.0+"\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
       
       
        int people = 6;
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
