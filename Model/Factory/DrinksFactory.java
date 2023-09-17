package Model.Factory;

import Repository.Drinks.Cosmopolitan;
import Repository.Drinks.Drink;
import Repository.Drinks.Mojito;
import Repository.Drinks.PinaColada;
import Repository.DrinksList;

//just simple factory - takes drink's name and returns proper class to work
public class DrinksFactory {

    public Drink getDrink(DrinksList orderedDrink) {
        Drink drinkToReturn;
        switch (orderedDrink) {
            case MOJITO -> drinkToReturn = new Mojito();
            case PINACOLADA -> drinkToReturn = new PinaColada();
            case COSMOPOLITAN -> drinkToReturn = new Cosmopolitan();
            default -> throw new IllegalArgumentException("Wrong drink: " + orderedDrink);
        }
        return drinkToReturn;
    }
}
