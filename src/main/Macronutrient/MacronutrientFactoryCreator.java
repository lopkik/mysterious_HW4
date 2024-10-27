package Macronutrient;

public class MacronutrientFactoryCreator {
    public static MacronutrientFactory createFactory(String type) {
        if (type.equalsIgnoreCase("carbs")) {
            return CarbsFactory.getInstance();
        } else if (type.equalsIgnoreCase("protein")) {
            return ProteinFactory.getInstance();
        } else if (type.equalsIgnoreCase("fats")) {
            return FatsFactory.getInstance();
        } else {
            System.out.println("Please specify a valid type");
            return null;
        }
    }
}
