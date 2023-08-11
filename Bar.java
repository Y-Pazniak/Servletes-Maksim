import Model.Factory.DrinksFactory;
import Model.RandomCustomer;
import Repository.Drinks.Drink;

public class Bar {

    public static void main(String[] args) {
        Bar bar = new Bar();
        DrinksFactory drinksFactory = new DrinksFactory();
        for (int i = 0; i < 100; i++) {
            bar.makeAnOrder(new RandomCustomer(), drinksFactory);
        }
    }

    private void makeAnOrder(RandomCustomer customer, DrinksFactory drinksFactory) {
        Drink drink = drinksFactory.getDrink(customer.askForADrink());
        System.out.println(drink.getClass());

    }
}