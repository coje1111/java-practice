package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        //시작
        temp = a; // int temp = a; 로 간결화 가능
        a = b;
        b = temp;

        //종료

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
