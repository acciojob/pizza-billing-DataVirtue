package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean extraTopping;
    private boolean paperBag;

    public void setPrice(int price) {
        this.price = price;
    }

    public Boolean getVeg() {
        return isVeg;
    }

    public void setVeg(Boolean veg) {
        isVeg = veg;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public boolean isExtraTopping() {
        return extraTopping;
    }

    public void setExtraTopping(boolean extraTopping) {
        this.extraTopping = extraTopping;
    }

    public boolean isPaperBag() {
        return paperBag;
    }

    public void setPaperBag(boolean paperBag) {
        this.paperBag = paperBag;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            bill = "Base Price Of The Pizza: 300";
        }else{
            this.price = 400;
            bill = "Base Price Of The Pizza: 400";
        }
        extraCheese = false;
        extraTopping = false;
        paperBag = false;

    }

    public Pizza() {
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraCheese)
            return;

        this.price+=80;
        bill+="\n" + "Extra Cheese Added: 80";
        extraCheese = true;

    }

    public void addExtraToppings(){
        // your code goes here
        if(extraTopping)
            return;

        if(isVeg){
            this.price+=70;
            bill+="\n" + "Extra Toppings Added: 70";
        }else{
            this.price+=120;
            bill+="\n" + "Extra Toppings Added: 120";
        }
        extraTopping = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(paperBag)
            return;

        this.price+=20;
        bill+="\n" + "Paperbag Added: 20";
        paperBag = true;
    }

    public String getBill(){
        // your code goes here

        return this.bill + "\n" + "Total Price: " + this.price + "\n";
    }
}
