package Pizza;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PizzaTest {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final PrintStream originalOut = System.out;
    Pizza testPizza = new Pizza("Pizza Chain", "Medium", false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false);

    @BeforeAll
    public static void setUpStream() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public static void restoreStream() {
        System.setOut(originalOut);
    }

    @Test
    public void pizzaConstructor() {
        assertNotNull(testPizza);
    }

    @Test
    public void pizzaGetToppingCount() {
        int toppingCount = testPizza.getToppingCount();

        assertEquals(0, toppingCount);
    }

    @Test
    public void pizzaEat() {
        String expectedPrintString = "Pizza Chain Medium has 0 toppings:\n|-> \n";
        testPizza.eat();

        assertEquals(expectedPrintString, outContent.toString());
    }
}
