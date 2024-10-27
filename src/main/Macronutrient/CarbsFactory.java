package Macronutrient;

public class CarbsFactory extends MacronutrientFactory{
    private final String[] options = {"Cheese", "Bread", "Lentils", "Pistachio"};
    private static CarbsFactory carbsFactory = null;

    private CarbsFactory(){}

    @Override
    public String getValidFood(String dietPlan) {
        if (dietPlan.equalsIgnoreCase("no restriction")) {
            return options[(int)(Math.random() * 4)];
        } else if (dietPlan.equalsIgnoreCase("paleo")) {
            return options[3];
        } else if (dietPlan.equalsIgnoreCase("vegan")) {
            return options[(int)(Math.random() * 3) + 1];
        } else if (dietPlan.equalsIgnoreCase("nut allergy")) {
            return options[(int)(Math.random() * 3)];
        } else {
            return "No valid carbs";
        }
    }

    public static MacronutrientFactory getInstance() {
        if (carbsFactory == null)
            carbsFactory = new CarbsFactory();
        return carbsFactory;
    }
}
