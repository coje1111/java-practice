package cond.ex;

public class DistanceEx4 {

  public static void main(String[] args) {
    //거리에 따른 운송 수단 선택하기
    //switch문으로 도전했으나 case가 알맞지 않아 실패.

    int discance = 6;

    switch (discance) {
      case 1:
        if (discance <= 1) {
          System.out.println("도보를 이용하세요.");
        }
        break;

      case 5:
        if (discance <= 10) {
          System.out.println("자전거를 이용하세요.");
        }
        break;

      case 25:
        if (discance <= 100) {
          System.out.println("자동차를 이용하세요.");
        }
        break;

      case 150: if (discance > 100) {
        System.out.println("비행기를 이용하세요.");
      }
    }
  }
}
