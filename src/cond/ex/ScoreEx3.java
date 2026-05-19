package cond.ex;

public class ScoreEx3 {

  public static void main(String[] args) {

    // if문 중복 계산 과정을 제거 리팩토링

    int score = 50;

    System.out.println("score: " + score);

    if (score < 0 || score > 100) {
      System.out.println("잘못된 출력입니다.");
    } else {

      switch (score / 10) {
        case 10:
        case 9:
          System.out.println("A");
          break;
        case 8:
          System.out.println("B");
          break;
        case 7:
          System.out.println("C");
          break;
        case 6:
          System.out.println("D");
          break;
        default:
          System.out.println("F");
      }
    }
  }
}
