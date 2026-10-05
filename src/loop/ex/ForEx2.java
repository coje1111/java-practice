package loop.ex;

public class ForEx2 {

  public static void main(String[] args) {
    int num = 2;
    for (int count = 1; count <= 10; count++) {
      System.out.println(num);
      num += 2;
    }

    /* 이렇게도 가능하나 보기 복잡함
    for (int num = 2, count = 1; count <= 10; num += 2, count++) {
      System.out.println(num);
     */
    }
  }
