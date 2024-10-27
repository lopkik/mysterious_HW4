package Pizza;

public class PizzaDriver {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        PizzaBuilder pizzaHut = new PizzaBuilder("Pizza Hut");
        Pizza pizzaSmall3 = pizzaHut
                .setPepperoni(true).setSausage(true).setMushrooms(true)
                .createPizza("Small");
        pizzaSmall3.eat();
        Pizza pizzaMedium6 = pizzaHut
                .setBacon(true).setOnions(true).setExtraCheese(true)
                .setPeppers(true).setChicken(true).setOlives(true)
                .createPizza("Medium");
        pizzaMedium6.eat();
        Pizza pizzaLarge9 = pizzaHut
                .setSpinach(true).setTomatoAndBasil(true).setBeef(true)
                .setHam(true).setPesto(true).setSpicyPork(true)
                .setHamAndPineapple(true).setPepperoni(true).setSausage(true)
                .createPizza("Large");
        pizzaLarge9.eat();

        // Task 2
        System.out.println("\nTask 2");
        Pizza pizzaHutLarge = pizzaHut
                .setPepperoni(true).setSausage(true).setMushrooms(true)
                .createPizza("Large");
        pizzaHutLarge.eat();
        Pizza pizzaHutSmall = pizzaHut
                .setBacon(true).setOnions(true)
                .createPizza("Small");
        pizzaHutSmall.eat();

        System.out.println();
        PizzaBuilder littleCaesars = new PizzaBuilder("Little Caesars");
        Pizza littleCaesarsMedium = littleCaesars
                .setSpinach(true).setTomatoAndBasil(true).setBeef(true)
                .setHam(true).setPesto(true).setSpicyPork(true)
                .setHamAndPineapple(true).setPepperoni(true)
                .createPizza("Medium");
        littleCaesarsMedium.eat();
        Pizza littleCaesarsSmall = littleCaesars
                .setSausage(true).setMushrooms(true).setBacon(true)
                .setOnions(true).setSpinach(true).setTomatoAndBasil(true)
                .createPizza("Small");
        littleCaesarsSmall.eat();

        System.out.println();
        PizzaBuilder dominos = new PizzaBuilder("Dominos");
        Pizza dominosSmall = dominos.setBeef(true).createPizza("Small");
        dominosSmall.eat();
        Pizza dominosLarge = dominos
                .setHam(true).setPesto(true).setSpicyPork(true)
                .createPizza("Large");
        dominosLarge.eat();
    }
}
