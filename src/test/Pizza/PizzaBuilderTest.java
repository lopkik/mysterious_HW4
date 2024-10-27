package Pizza;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaBuilderTest {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStream() {
        outContent.reset();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStream() {
        System.setOut(originalOut);
    }

    @Test
    public void pizzaBuilderConstructor() {
        PizzaBuilder pizzaChain = new PizzaBuilder("Pizza Chain");
        Pizza basePizza = pizzaChain.createPizza("Small");
        basePizza.eat();
        String expectedPrintString = "Pizza Chain Small has 0 toppings:\n|-> \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void createPizza() {
        PizzaBuilder pizzaChain = new PizzaBuilder("Pizza Chain");
        Pizza testPizza = pizzaChain.setPepperoni(true).setSausage(true).setMushrooms(true).createPizza("Small");
        testPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 3 toppings:\n|-> Pepperoni, Sausage, Mushrooms, \n";

        assertEquals(expectedPrintString, outContent.toString());
        outContent.reset();

        Pizza secondPizza = pizzaChain.createPizza("Medium");
        secondPizza.eat();
        String secondExpectedPrintString = "Pizza Chain Medium has 0 toppings:\n|-> \n";

        assertEquals(secondExpectedPrintString, outContent.toString());
    }

    @Test
    public void setPepperoni() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setPepperoni(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Pepperoni, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setSausage() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setSausage(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Sausage, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setMushrooms() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setMushrooms(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Mushrooms, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setBacon() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setBacon(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Bacon, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setOnions() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setOnions(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Onions, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setExtraCheese() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setExtraCheese(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Extra cheese, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setPeppers() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setPeppers(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Peppers, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setChicken() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setChicken(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Chicken, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setOlives() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setOlives(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Olives, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setSpinach() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setSpinach(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Spinach, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setTomatoAndBasil() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setTomatoAndBasil(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Tomato and basil, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setBeef() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setBeef(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Beef, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setHam() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setHam(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Ham, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setPesto() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setPesto(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Pesto, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setSpicyPork() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setSpicyPork(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Spicy pork, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }

    @Test
    public void setHamAndPineapple() {
        Pizza newPizza = new PizzaBuilder("Pizza Chain").setHamAndPineapple(true).createPizza("Small");
        newPizza.eat();
        String expectedPrintString = "Pizza Chain Small has 1 toppings:\n|-> Ham and pineapple, \n";

        assertEquals(expectedPrintString, outContent.toString());
    }
}
