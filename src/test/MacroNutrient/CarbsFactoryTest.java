package MacroNutrient;

import Macronutrient.CarbsFactory;
import Macronutrient.MacronutrientFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarbsFactoryTest {

    @Test
    void getValidFood() {
        MacronutrientFactory carbsFactory = CarbsFactory.getInstance();
        String noRestrictionFood = carbsFactory.getValidFood("No Restriction");
        String paleoFood = carbsFactory.getValidFood("Paleo");
        String veganFood = carbsFactory.getValidFood("Vegan");
        String nutAllergyFood = carbsFactory.getValidFood("Nut Allergy");

        assertNotEquals("No valid carbs", noRestrictionFood);
        assertEquals("Pistachio", paleoFood);
        assertNotEquals("Cheese", veganFood);
        assertNotEquals("Pistachio", nutAllergyFood);
    }

    @Test
    void getInstance() {
        MacronutrientFactory carbsFactory = CarbsFactory.getInstance();

        assertNotNull(carbsFactory);
    }
}