public class Main {

    public static void main(String[] args) {
        System.out.println("Appeltaart:\n");
        ApplePieRecipe applePieRecipe = new ApplePieRecipe();
        applePieRecipe.printRecipe();
        System.out.println("\nBananensap:\n");
        BananaJuiceRecipe bananaJuiceRecipe = new BananaJuiceRecipe();
        bananaJuiceRecipe.printRecipe();
    }
}
