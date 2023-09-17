import Model.Factory.DrinksFactory;
import Model.RandomCustomer;
import Repository.Drinks.Drink;

//main class: creates factory, customer and serves 100 customers to check factory's work
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
