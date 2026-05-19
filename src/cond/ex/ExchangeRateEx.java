package cond.ex;

public class ExchangeRateEx {

  public static void main(String[] args) {
    //거리에 따른 운송 수단 선택하기

    int dollar = 10;

    if (dollar < 0) {

      System.out.println("잘못된 금액입니다.");
    } else if (dollar == 0) {

      System.out.println("환전할 금액이 없습니다.");
    } else {

      int won = (dollar * 1300);

      System.out.println("환전 금액은 " + won + "원입니다.");
    }
  }
}
