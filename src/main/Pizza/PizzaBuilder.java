package Pizza;

public class PizzaBuilder {
    private final String pizzaChainName;
    private boolean pepperoni = false;
    private boolean sausage = false;
    private boolean mushrooms = false;
    private boolean bacon = false;
    private boolean onions = false;
    private boolean extraCheese = false;
    private boolean peppers = false;
    private boolean chicken = false;
    private boolean olives = false;
    private boolean spinach = false;
    private boolean tomatoAndBasil = false;
    private boolean beef = false;
    private boolean ham = false;
    private boolean pesto = false;
    private boolean spicyPork = false;
    private boolean hamAndPineapple = false;

    public PizzaBuilder(String pizzaChainName) {
        this.pizzaChainName = pizzaChainName;
    }

    public PizzaBuilder setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }
    public PizzaBuilder setSausage(boolean sausage) {
        this.sausage = sausage;
        return this;
    }
    public PizzaBuilder setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
        return this;
    }
    public PizzaBuilder setBacon(boolean bacon) {
        this.bacon = bacon;
        return this;
    }
    public PizzaBuilder setOnions(boolean onions) {
        this.onions = onions;
        return this;
    }
    public PizzaBuilder setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
        return this;
    }
    public PizzaBuilder setPeppers(boolean peppers) {
        this.peppers = peppers;
        return this;
    }
    public PizzaBuilder setChicken(boolean chicken) {
        this.chicken = chicken;
        return this;
    }
    public PizzaBuilder setOlives(boolean olives) {
        this.olives = olives;
        return this;
    }
    public PizzaBuilder setSpinach(boolean spinach) {
        this.spinach = spinach;
        return this;
    }
    public PizzaBuilder setTomatoAndBasil(boolean tomatoAndBasil) {
        this.tomatoAndBasil = tomatoAndBasil;
        return this;
    }
    public PizzaBuilder setBeef(boolean beef) {
        this.beef = beef;
        return this;
    }
    public PizzaBuilder setHam(boolean ham) {
        this.ham = ham;
        return this;
    }
    public PizzaBuilder setPesto(boolean pesto) {
        this.pesto = pesto;
        return this;
    }
    public PizzaBuilder setSpicyPork(boolean spicyPork) {
        this.spicyPork = spicyPork;
        return this;
    }
    public PizzaBuilder setHamAndPineapple(boolean hamAndPineapple) {
        this.hamAndPineapple = hamAndPineapple;
        return this;
    }


    public Pizza createPizza(String size) {
        Pizza pizza = new Pizza(pizzaChainName, size, pepperoni, sausage, mushrooms, bacon, onions, extraCheese, peppers, chicken, olives, spinach, tomatoAndBasil, beef, ham, pesto, spicyPork, hamAndPineapple);
        this.pepperoni = false;
        this.sausage = false;
        this.mushrooms = false;
        this.bacon = false;
        this.onions = false;
        this.extraCheese = false;
        this.peppers = false;
        this.chicken = false;
        this.olives = false;
        this.spinach = false;
        this.tomatoAndBasil = false;
        this.beef = false;
        this.ham = false;
        this.pesto = false;
        this.spicyPork = false;
        this.hamAndPineapple = false;
        return pizza;
    }
}
