/**
 * Created by Mickaël on 30/08/2017.
 */

function observer(){

    // Array voor bij te houden welke displays er aan de observer moeten toegevoegd worden
    var aObservers = [];

    // Registreren van de displays
    this.registerObserserver = function(observer){
        aObservers.push(observer);
        console.log("De observer is geregistreerd");
    }

    // Alle geregistreerde displays op de hoogte houden van veranderingen
    this.notifieObservers = function(){

        aObservers.forEach(function(item)   {
                                            observer.notifie(item);
                                            });

    }


    // Een display verwijderen ( niet meer op de hoogte houden van veranderingen )
    this.removeObserver = function(observer){
        var indexOfElement = aObservers.indexOf(observer);
        aObservers.splice(indexOfElement,1);
    }

    // De statussen worden per display weer gegeven
    this.notifie = function(item){
        console.log(item.name);
    }
}

// De displays. Elke display kan anders zijn, zolang ze maar dezelfde structuur behouden.
var display = function(name){
    this.name = name;
}


    // Aanmaken van displays voor aan de observer toe te voegen
    var display1 = new display("Eerste display");
    var display2 = new display("Tweede display");
    var display3 = new display("Derde display");

    // Observer object aanmaken
    var observer = new observer();

    // displays registreren bij de observer
    observer.registerObserserver(display1);
    observer.registerObserserver(display2);
    observer.registerObserserver(display3);

    // Alle displays notifieeren
    observer.notifieObservers();

    // Display verwijderen uit de observer
    observer.removeObserver(display2);
    observer.notifieObservers();

