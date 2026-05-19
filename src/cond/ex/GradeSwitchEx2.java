package cond.ex;

public class GradeSwitchEx2 {

  public static void main(String[] args) {

    // 신규 switch문으로 작성

    String grade = "A";

    switch (grade) {

      case "A" -> System.out.println("탁월한 성과입니다!");
      case "B" -> System.out.println("좋은 성과입니다!");
      case "C" -> System.out.println("준수한 성과입니다!");
      case "D" -> System.out.println("발전이 필요합니다!");
      case "F" -> System.out.println("불합격 입니다.");
      default -> System.out.println("잘못된 학점입니다.");
    }
  }
}

