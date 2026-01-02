public class Main {
    public static void main(String[] args) {

        int burgerPrice = 5200;
        int quantity = 2;

        double discountRate = 0.15;

        int totalPrice = burgerPrice * quantity;
        int discountAmount = (int) (totalPrice * discountRate);
        int finalPrice = totalPrice - discountAmount;


        System.out.println(finalPrice);
    }
}
