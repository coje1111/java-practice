package cond.ex;

public class DistanceEx5 {

  public static void main(String[] args) {
    //거리에 따른 운송 수단 선택하기

    int distance = 9;

    System.out.println("distance: " + distance);

    if (distance <= 1) {
      System.out.println("도보를 이용하세요.");

    } else if (distance <= 10) {
      System.out.println("자전거를 이용하세요.");

    } else if (distance <= 100) {
      System.out.println("자동차를 이용하세요.");

    } else {
      System.out.println("비행기를 이용하세요.");
    }
  }
}
