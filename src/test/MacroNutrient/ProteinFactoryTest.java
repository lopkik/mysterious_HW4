package MacroNutrient;

import Macronutrient.MacronutrientFactory;
import Macronutrient.ProteinFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProteinFactoryTest {

    @Test
    void getValidFood() {
        MacronutrientFactory proteinFactory = ProteinFactory.getInstance();
        String noRestrictionFood = proteinFactory.getValidFood("No Restriction");
        String paleoFood = proteinFactory.getValidFood("Paleo");
        String veganFood = proteinFactory.getValidFood("Vegan");
        String nutAllergyFood = proteinFactory.getValidFood("Nut Allergy");

        assertNotEquals("No valid protein", noRestrictionFood);
        assertNotEquals("Tofu", paleoFood);
        assertEquals("Tofu", veganFood);
        assertNotEquals("No valid protein", nutAllergyFood);
    }

    @Test
    void getInstance() {
        MacronutrientFactory proteinFactory = ProteinFactory.getInstance();

        assertNotNull(proteinFactory);
    }
}