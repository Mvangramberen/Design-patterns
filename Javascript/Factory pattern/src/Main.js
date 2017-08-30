/**
 * Created by Mickaël on 30/08/2017.
 */

function pizzaFactory(type){
    switch(type){
        case "fungi":

              // Vergeet de "return new" niet anders gaat hij geen object terug geven. En blijft deze bij gevolg
              // Undefined
              return new createFungi();
              break;
        case "mozarella":
               return new createMozarella();
                break;
    }
}

function createFungi(){
    this.name = "Pizza Fungi";
    this.dough = "thin dough";
    this.topping = "Mushrooms & tomato sauce";
}

function createMozarella(){
    this.name = "Pizza Mozarella"
    this.dough = "Thick dough";
    this.topping = "Mozarella & tomato sauce";
}

function getPizza(pizza){
    console.log(pizza.name + "\nDough : " + pizza.dough + "\nToppings : " + pizza.topping );
}