package MacroNutrient;

import Macronutrient.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void constructor() {
        Customer customer = new Customer("Alice", "No Restriction");

        assertEquals("Alice", customer.getName());
        assertEquals("No Restriction", customer.getDietPlan());
    }

}