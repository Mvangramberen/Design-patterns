/**
 * Created by Mickaël on 30/08/2017.
 */

// Basis drank
function coffee(){
    this.name= "Coffee";
    this.price = 1;
}

//  Toevoegingen
function whip(drank){
    this.name = drank.name + ", whip";
    this.price = drank.price + 0.2;
}

//  Toevoegingen
function soy(drank){
    this.name = drank.name + ", soy";
    this.price = drank.price + 0.5;
}

//  Toevoegingen
function caramel(drank){
    this.name = drank.name + ", caramel";
    this.price = drank.price + 0.7;
}

// Basis drank
function tea(){
    this.name = "Tea";
    this.price = 1.5;
}

//  Toevoegingen
function lemon(drank){
    this.name = drank.name + ", lemon";
    this.price = drank.price + 0.1;
}


//  Toevoegingen
function orange(drank){
    this.name = drank.name + ", orange";
    this.price = drank.price + 0.2;
}


//  Toevoegingen
function milk(drank){
    this.name = drank.name + ", milk";
    this.price = drank.price + 0.5;
}

// Soort van toString functie
function getRekening(drank){
    console.log("Besteld : " + drank.name +"\nRekening: " + drank.price);
}


