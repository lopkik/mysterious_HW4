package Macronutrient;

public class FatsFactory extends MacronutrientFactory{
    private final String[] options = {"Sour cream", "Tuna", "Avocado", "Peanuts"};
    private static FatsFactory fatsFactory = null;

    private FatsFactory(){};

    @Override
    public String getValidFood(String dietPlan) {
        if (dietPlan.equalsIgnoreCase("no restriction")) {
            return options[(int)(Math.random() * 4)];
        } else if (dietPlan.equalsIgnoreCase("paleo")) {
            return options[(int)(Math.random() * 3 + 1)];
        } else if (dietPlan.equalsIgnoreCase("vegan")) {
            return options[(int)(Math.random() * 2) + 2];
        } else if (dietPlan.equalsIgnoreCase("nut allergy")) {
            return options[(int)(Math.random() * 3)];
        } else {
            return "No valid fats";
        }
    }

    public static FatsFactory getInstance() {
        if (fatsFactory == null)
            fatsFactory = new FatsFactory();
        return fatsFactory;
    }
}
