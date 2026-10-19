package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    int count = 0;
    int input = 0;

    System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
/*

    while (true) {
      input = scanner.nextInt();
      if (input == -1) {
        break;
      }
      sum += input;
      count++;
    }
*/

    while ((input = scanner.nextInt()) != -1) {
      sum += input;
      count++;
    }
    System.out.println("입력된 숫자의 합: " + sum);

    if (count > 0) {
      double average = (double) sum / count;
      System.out.println("입력된 숫자의 평균: " + average);
    } else {
      System.out.println("입력한 숫자가 없어 평균을 계산할 수 없습니다.");
    }
/*
    double average = (double) sum / count;
    System.out.println("입력된 숫자의 합: " + sum);
    System.out.println("입력된 숫자의 평균: " + average);
    */
  }
}
