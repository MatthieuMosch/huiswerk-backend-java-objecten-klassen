public class BananaJuiceRecipe {
    private Ingredient[] ingredients = new Ingredient[]{
            new Ingredient("bananen", 2, "grote"),
            new Ingredient("appel", 0.5, "gesneden"),
            new Ingredient("honing", 1, "eetlepel"),
            new Ingredient("melk", 1.5, "kopje"),
    };

    public void printRecipe() {
        printIngredients();
        System.out.println(""); // extra line to visually separate ingredients from steps
        printSteps();
    }

    private void printIngredients() {
        System.out.println("Ingrediënten:");
        for (int i = 0; i < ingredients.length; i++) {
            System.out.println(ingredients[i]);
        }
    }

    private void printSteps() {
        System.out.println("Stappen:");
        washFruit();
        peelFruit();
        addFruit();
        addMilk();
        blendJuice();
        finishingTouch();
        serveJuice();
    }

    private void washFruit() {
        System.out.println("- Was de banenen en de appel en dep ze droog.");
    }

    private void peelFruit() {
        System.out.println("- Pel de bananen en snij ze in plakjes. Schil de appel en snij deze in middelgrote stukjes.");
    }

    private void addFruit() {
        System.out.println("- Doe de plakjes banaan, de stukjes appel, en de honing in de blender.");
    }

    private void addMilk() {
        System.out.println("- Doe de melk in de blender, of water voor een calorie arme versie.");
    }

    private void blendJuice() {
        System.out.println("- Gebruik de blender tot dat het een gladde puree is.");
    }

    private void finishingTouch() {
        System.out.println("- Controleer de consistentie. Voeg extra melk of water toe als het te dik is en ga terug naar de vorige stap.");
    }

    private void serveJuice() {
        System.out.println("- Schenk de bananen sap in glazen en server met een extra schijfje banaan.");
    }
}
