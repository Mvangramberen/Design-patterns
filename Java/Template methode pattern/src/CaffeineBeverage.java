/**
 * Created by Mickaël on 29/08/2017.
 * Je maakt een template aan de hand van abstracte klasse. De instanties die overschreven moeten worden maak je abstract
 * En de gemeenschappelijke zaken definieer je gewoon in de abstracte "template" klasse.
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling the water");
    }

    void pourInCup(){
        System.out.println("Pouring out the beverage");
    }
}
