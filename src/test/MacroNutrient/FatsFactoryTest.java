package MacroNutrient;

import Macronutrient.FatsFactory;
import Macronutrient.MacronutrientFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FatsFactoryTest {

    @Test
    void getValidFood() {
        MacronutrientFactory fatsFactory = FatsFactory.getInstance();
        String noRestrictionFood = fatsFactory.getValidFood("No Restriction");
        String paleoFood = fatsFactory.getValidFood("Paleo");
        String veganFood = fatsFactory.getValidFood("Vegan");
        String nutAllergyFood = fatsFactory.getValidFood("Nut Allergy");

        assertNotEquals("No valid fats", noRestrictionFood);
        assertNotEquals("Sour cream", paleoFood);
        assertNotEquals("Sour cream", veganFood);
        assertNotEquals("Tuna", veganFood);
        assertNotEquals("Peanuts", nutAllergyFood);
    }

    @Test
    void getInstance() {
        MacronutrientFactory fatsFactory = FatsFactory.getInstance();

        assertNotNull(fatsFactory);
    }
}