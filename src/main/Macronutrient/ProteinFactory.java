package Macronutrient;

public class ProteinFactory extends MacronutrientFactory{
    private final String[] options = {"Fish", "Chicken", "Beef", "Tofu"};
    private static ProteinFactory proteinFactory = null;

    private ProteinFactory(){}

    @Override
    public String getValidFood(String dietPlan) {
        if (dietPlan.equalsIgnoreCase("no restriction")) {
            return options[(int)(Math.random() * 4)];
        } else if (dietPlan.equalsIgnoreCase("paleo")) {
            return options[(int)(Math.random() * 3)];
        } else if (dietPlan.equalsIgnoreCase("vegan")) {
            return options[3];
        } else if (dietPlan.equalsIgnoreCase("nut allergy")) {
            return options[(int)(Math.random() * 4)];
        } else {
            return "No valid protein";
        }
    }

    public static ProteinFactory getInstance() {
        if (proteinFactory == null)
            proteinFactory = new ProteinFactory();
        return proteinFactory;
    }
}
