package MacroNutrient;

import Macronutrient.MacronutrientFactory;
import Macronutrient.MacronutrientFactoryCreator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MacronutrientFactoryCreatorTest {

    @Test
    void createFactory() {
        MacronutrientFactory carbsFactory = MacronutrientFactoryCreator.createFactory("carbs");
        MacronutrientFactory proteinFactory = MacronutrientFactoryCreator.createFactory("protein");
        MacronutrientFactory fatsFactory = MacronutrientFactoryCreator.createFactory("fats");
        MacronutrientFactory invalidFactory = MacronutrientFactoryCreator.createFactory("invalid");

        assertNotNull(carbsFactory);
        assertNotNull(proteinFactory);
        assertNotNull(fatsFactory);
        assertNull(invalidFactory);
    }
}