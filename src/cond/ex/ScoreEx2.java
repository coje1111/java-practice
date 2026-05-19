package cond.ex;

public class ScoreEx2 {

  public static void main(String[] args) {

    // if문 중복 계산 과정을 제거 리팩토링

    int score = 101;

    System.out.println("score: " + score);

    if (score < 0 || score > 100) {
      System.out.println("잘못된 출력입니다.");

    } else if (score >= 90) {
      System.out.println("출력: 학점은 A입니다.");

    } else if (score >= 80) {
      System.out.println("출력: 학점은 B입니다.");

    } else if (score >= 70) {
      System.out.println("출력: 학점은 C입니다.");

    } else if (score >= 60) {
      System.out.println("출력: 학점은 D입니다.");

    } else {
      System.out.println("출력: 학점은 F입니다.");

    }
  }
}
