public class Main {
    public static void main(String[] args) {

        int price = 12900;
        int quantity = 3;
        String grade = "VIP";

        int totalPrice = price * quantity;
        double discountRate;

// 조건문 작성
        if (grade.equals("VIP")) {
            discountRate = 0.2;
        } else if (totalPrice >= 30000) {
            discountRate = 0.1;
        } else {
            discountRate = 0.0;
        }

        int discountAmount = (int)(totalPrice * discountRate);
        int finalPrice = totalPrice - discountAmount;

        System.out.println(grade);
        System.out.println(discountRate);
        System.out.println(discountAmount);
        System.out.println(finalPrice);
        //26-01-04 조건문이 어떻게 굴러가는가 이해중
    }
}


