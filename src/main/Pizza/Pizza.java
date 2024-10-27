package Pizza;

public class Pizza {
    private String pizzaChainName;
    private String size;
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private boolean bacon;
    private boolean onions;
    private boolean extraCheese;
    private boolean peppers;
    private boolean chicken;
    private boolean olives;
    private boolean spinach;
    private boolean tomatoAndBasil;
    private boolean beef;
    private boolean ham;
    private boolean pesto;
    private boolean spicyPork;
    private boolean hamAndPineapple;

    public Pizza(String pizzaChainName, String size, boolean pepperoni, boolean sausage, boolean mushrooms, boolean bacon, boolean onions, boolean extraCheese, boolean peppers, boolean chicken, boolean olives, boolean spinach, boolean tomatoAndBasil, boolean beef, boolean ham, boolean pesto, boolean spicyPork, boolean hamAndPineapple) {
        this.pizzaChainName = pizzaChainName;
        this.size = size;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.bacon = bacon;
        this.onions = onions;
        this.extraCheese = extraCheese;
        this.peppers = peppers;
        this.chicken = chicken;
        this.olives = olives;
        this.spinach = spinach;
        this.tomatoAndBasil = tomatoAndBasil;
        this.beef = beef;
        this.ham = ham;
        this.pesto = pesto;
        this.spicyPork = spicyPork;
        this.hamAndPineapple = hamAndPineapple;
    }

    public void eat() {
        int toppingCount = getToppingCount();

        System.out.println(this.pizzaChainName + " " + this.size + " has " + toppingCount + " toppings:");
        System.out.print("|-> ");
        if (this.pepperoni) System.out.print("Pepperoni, ");
        if (this.sausage) System.out.print("Sausage, ");
        if (this.mushrooms) System.out.print("Mushrooms, ");
        if (this.bacon) System.out.print("Bacon, ");
        if (this.onions) System.out.print("Onions, ");
        if (this.extraCheese) System.out.print("Extra cheese, ");
        if (this.peppers) System.out.print("Peppers, ");
        if (this.chicken) System.out.print("Chicken, ");
        if (this.olives) System.out.print("Olives, ");
        if (this.spinach) System.out.print("Spinach, ");
        if (this.tomatoAndBasil) System.out.print("Tomato and basil, ");
        if (this.beef) System.out.print("Beef, ");
        if (this.ham) System.out.print("Ham, ");
        if (this.pesto) System.out.print("Pesto, ");
        if (this.spicyPork) System.out.print("Spicy pork, ");
        if (this.hamAndPineapple) System.out.print("Ham and pineapple, ");
        System.out.print("\n");
    }

    public int getToppingCount() {
        int toppingCount = 0;
        if (this.pepperoni) toppingCount++;
        if (this.sausage) toppingCount++;
        if (this.mushrooms) toppingCount++;
        if (this.bacon) toppingCount++;
        if (this.onions) toppingCount++;
        if (this.extraCheese) toppingCount++;
        if (this.peppers) toppingCount++;
        if (this.chicken) toppingCount++;
        if (this.olives) toppingCount++;
        if (this.spinach) toppingCount++;
        if (this.tomatoAndBasil) toppingCount++;
        if (this.beef) toppingCount++;
        if (this.ham) toppingCount++;
        if (this.pesto) toppingCount++;
        if (this.spicyPork) toppingCount++;
        if (this.hamAndPineapple) toppingCount++;
        return toppingCount;
    }
}
