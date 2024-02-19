package edu.iu.habahram.pizzashop.model;

public class NewYorkStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        PizzaFactory pizzaFactory = new ChicagoPizzaFactory();
        return pizzaFactory.createPizza(item);
    }
}
