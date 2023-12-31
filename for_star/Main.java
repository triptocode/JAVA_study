import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("숫자를 입력해주세요.");
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        sc.close();

        for (int i = 1; i <= 2 * number - 1; i++) {
            String stars = "";

            // 공백 개수 저장 변수
            int spaceWidth = 0;

            // 별 개수 저장 변수
            int starWidth = 0;

            if (i == 1 || i == 2 * number - 1) {
                for (int j = 1; j <= 2 * number - 1; j++) {
                    stars += "*";
                }

            } else if (i < number) {
                // 윗부분

                // 윗부분의 변환된 i의 값을 저장할 int 변수
                int upperI = i - 1;
                starWidth = number - upperI;

                // 공백 1, 3, 5...
                spaceWidth = 2 * upperI - 1;

            } else {
                // 아랫부분

                // 아랫부분의 변환된 i의 값을 저장할 int 변수
                int lowerI = i - number + 1;
                starWidth = lowerI;
                spaceWidth = 2 * number - 2 * lowerI - 1;
            }

            // 왼쪽 별 담당 j for문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            // 공백 담당 j for문
            for (int j = 1; j <= spaceWidth; j++) {
                stars += " ";
            }

            // 오른쪽 별 담당 j for문
            for (int j = 1; j <= starWidth; j++) {
                stars += "*";
            }

            System.out.println(stars);
        }
    }
}