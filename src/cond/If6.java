package cond;

public class If6 {
  public static void main(String[] args) {
    int price = 100;
    int age = 12;
    int discount = 0;

    if (price >= 10000) {
      discount = discount + 1000;
      System.out.println("10000원 이상 구매, 1000원 할인");

    } else if (age <= 10) {
      discount = discount + 1000;
      System.out.println("10살 이하, 1000원 할인");
    } else {
      System.out.println("할인 없음");
    }

    System.out.println("총 할인 금액: " + discount + "원");

    if (true)
      System.out.println("if문에서 실행됨"); // 코드 블럭 생략 가능하나 권장하지 않음
      System.out.println("if문에서 실행 안됨"); // 코드 블럭이 없으면 if문과 상관 없기 때문에 그냥 출력

  }
}
