package Macronutrient;

public class MacronutrientDriver {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice", "No Restriction");
        createMeal(alice.getDietPlan());
        Customer bob = new Customer("Bob", "Paleo");
        createMeal(bob.getDietPlan());
        Customer charlie = new Customer("Charlie", "Vegan");
        createMeal(charlie.getDietPlan());
        Customer david = new Customer("David", "Nut Allergy");
        createMeal(david.getDietPlan());
        Customer erin = new Customer("Erin", "No Restriction");
        createMeal(erin.getDietPlan());
        Customer frank = new Customer("Frank", "Paleo");
        createMeal(frank.getDietPlan());
    }

    public static void createMeal(String dietPlan) {
        MacronutrientFactory carbFactory = MacronutrientFactoryCreator.createFactory("carbs");
        MacronutrientFactory proteinFactory = MacronutrientFactoryCreator.createFactory("protein");
        MacronutrientFactory fatsFactory = MacronutrientFactoryCreator.createFactory("fats");

        String carb = carbFactory.getValidFood(dietPlan);
        String protein = proteinFactory.getValidFood(dietPlan);
        String fat = fatsFactory.getValidFood(dietPlan);

        System.out.println(dietPlan + " meal consists of:");
        System.out.println("|-> Carb:    " + carb);
        System.out.println("|-> Protein: " + protein);
        System.out.println("|-> Fat:     " + fat);
    }
}
