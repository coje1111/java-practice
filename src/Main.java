public class Main {
    public static void main(String[] args) {

        int price = 15000;
        int quantity = 2;
        boolean isVip = false;
        boolean isMember = true;

        int totalPrice = price * quantity;
        double discountRate;

        if (isVip) {
            discountRate = 0.2;
        } else if (totalPrice >= 30000) {
            discountRate = 0.1;
        } else if (isMember && quantity >= 2) {
            discountRate = 0.05;
        } else {
            discountRate = 0.0;
        }

        int discountAmount = (int) (totalPrice * discountRate);
        int afterDiscountPrice = totalPrice - discountAmount;

        int shippingFee;
        if (afterDiscountPrice < 40000) {
            shippingFee = 3000;
        } else {
            shippingFee = 0;
        }

        int pointUsed;
        if (isVip) {
            pointUsed = 5000;
        } else {
            pointUsed = 0;
        }

        int finalPay = afterDiscountPrice + shippingFee - pointUsed;

        if (finalPay < 0) {
            finalPay = 0;
        }
        System.out.println(totalPrice);
        System.out.println(discountAmount);
        System.out.println(shippingFee);
        System.out.println(pointUsed);
        System.out.println(finalPay);
    }
}


