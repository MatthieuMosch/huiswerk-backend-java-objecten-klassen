public class ApplePieRecipe {
    private Ingredient[] ingredients = new Ingredient[]{
            new Ingredient("ongezouten roomboter", 200, "gram"),
            new Ingredient("witte bastard suiker", 200, "gram"),
            new Ingredient("zelfrijzend bakmeel", 400, "gram"),
            new Ingredient("ei", 1, "stuk(s)"),
            new Ingredient("vanillesuiker", 8, "gram"),
            new Ingredient("zout", 1, "snuf"),
            new Ingredient("zoetzure appels", 1.5, "kilo"),
            new Ingredient("kristal suiker", 75, "gram"),
            new Ingredient("kaneel", 3, "theelepels"),
            new Ingredient("paneermeel", 15, "melon")};

    public ApplePieRecipe() {
    }

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
        heatOven();;
        splitEgg();;
        mixIngredients();
        cutApples();
        greaseTray();
        prepareTray();
        addApples();
        makeStrips();
        addStrips();
        bakePie();
    }

    private void heatOven() {
        System.out.println("- Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    private void splitEgg() {
        System.out.println("- Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    private void mixIngredients() {
        System.out.println("- Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    private void cutApples() {
        System.out.println("- Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    private void greaseTray() {
        System.out.println("- Vet de springvorm in en bestrooi deze met bloem.");
    }

    private void prepareTray() {
        System.out.println("- Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    private void addApples() {
        System.out.println("- Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    private void makeStrips() {
        System.out.println("- Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    private void addStrips() {
        System.out.println("- Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    private void bakePie() {
        System.out.println("- Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

}
