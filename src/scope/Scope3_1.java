package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        /* temp의 비효율적 메모리사용, 코드 복잡성 증가.
        if문 안에서만 사용하기 때문에 밖에서 쓰면 헷갈릴 수 있음
         */
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
