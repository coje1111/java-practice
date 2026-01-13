public class Day01_JavaFoundation {
    public static void main(String[] args) {

    doExercise("스쿼트", 3);
    doExercise("푸쉬업", 0);
}

public static void doExercise(String name, int count) {
    if (count <= 0) {
        System.out.println("안할래요");
    } else {
        for (int i = 1; i <= count; i++) {
            System.out.println(name + " " + i + "회");
        }
    }
}
}
// 과제하다보니 멘붕와서 진짜 기초로 돌아가기로 함. 초조해하지 말고 천천히 다시 시작

