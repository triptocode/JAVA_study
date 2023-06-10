package namePkg;
import java.util.*;

public class NameTest {
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("이름을 입력하세요>>");
            String inputName = scanner.next(); // 키보드로부터 이름 입력

            nameList.add(inputName); // ArrayList 컬렉션에 삽입
        }

        // ArrayList에 들어 있는 모든 이름 출력
        for (int i = 0; i < nameList.size(); i++) {
            // ArrayList의 i 번째 문자열 얻어오기
            String result = nameList.get(i);
            System.out.print(result + " ");
//            System.out.println(result);A
        }
        scanner.close();

    } // main 종료
} // class 종료
