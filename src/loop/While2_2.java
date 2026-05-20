package loop;

public class While2_2 {

  public static void main(String[] args) {
    int sum = 0;
    int i = 1;

    sum = sum + i; //sum(0) + 1 -> sum(1)
    System.out.println("i=" + i + " sum=" + sum);
    i++;

    sum = sum + i; //sum(1) + 1 -> sum(3)
    System.out.println("i=" + i + " sum=" + sum);
    i++;

    sum = sum + i; //sum(3) + 1 -> sum(6)
    System.out.println("i=" + i + " sum=" + sum);
  }
}
