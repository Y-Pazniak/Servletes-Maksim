package Model;

import Repository.DrinksList;

public class RandomCustomer {
    public DrinksList askForADrink() {
        DrinksList[] drinks = DrinksList.values();
        int randomDrinkNumber = (int) (Math.random() * drinks.length);
        return drinks[randomDrinkNumber];
    }
}
