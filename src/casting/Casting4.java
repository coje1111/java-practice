package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // 같은 타입끼리의 계산은 같은 타입의 결과가 나온다.
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2; // int 타입의 결과가 나왔으나 자동 형변환이 일어나 1.0이 된다.
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2; // 계산이 큰 범위의 타입으로 자동 형변환이 일어난다. int < double
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2; // 명시적 형변환을 사용해 double 타입으로 나타난다.
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double result = (double) a / b; // int형끼리의 나눗셈을 명시적 형변환으로 소수점까지 나타냈다.
        System.out.println("result = " + result);
    }
}
