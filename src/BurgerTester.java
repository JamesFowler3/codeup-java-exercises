public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools bt = new BurgerTools();
        bt.mostPopularTopping = "Lettuce";
        bt.averageDaysBeforeExperation = 3;
        bt.tempatureWhenCooked = 100;
        bt.grill();
    }
}
