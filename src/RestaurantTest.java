public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.setNameOfDish("corndog");
        dish.setCostInCents(900);
        dish.setWouldRecommend(true);
        System.out.println("The " + dish.getNameOfDish() + "only" + dish.getCostInCents() + "cents. Do I " +
                "recommend? It's " + dish.isWouldRecommend());
        dish.eat();
    }
}
