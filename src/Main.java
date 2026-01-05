public class Main {
    public static void main(String[] args) {

        int price = 12000;
        int quantity = 3;
        boolean isVip = false;

        int totalPrice = price * quantity;
        double discountRate;

        if (isVip) {
            discountRate = 0.2;
        } else if (totalPrice >= 30000) {
            discountRate = 0.1;
        } else if (totalPrice >= 10000) {
            discountRate = 0.05;
        } else {
            discountRate = 0;
        }

        int discountAmount = (int) (totalPrice * discountRate);
        int finalPrice = totalPrice - discountAmount;

        System.out.println(finalPrice);
    }
}


