public class Main {
    public static void main(String[] args) {

        int price = 12900;
        int quantity = 3;

        double discountRate = 0.12;
        double vatRate = 0.10;

        int totalPrice = price * quantity;
        int discountAmount = (int) (totalPrice * discountRate);
        int discountedPrice = totalPrice - discountAmount;
        int vatAmount = (int) (discountedPrice * vatRate);
        int finalPrice = discountedPrice + vatAmount;

        System.out.println(finalPrice);
    }
}
