package Model;

import Repository.DrinksList;

//bar customer - class for return the name of the drink (name uses to send to factory)
public class RandomCustomer {
    public DrinksList askForADrink() {
        DrinksList[] drinks = DrinksList.values();
        int randomDrinkNumber = (int) (Math.random() * drinks.length);
        return drinks[randomDrinkNumber];
    }
}
