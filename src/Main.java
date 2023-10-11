import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
/*
       //string 은 char배열임!!!!
        // int[]는 고정크기 arraylist는 가변크기.
*/      String numeric = "1111111";
        Solution sol = new Solution();
        sol.solution(numeric);

    }
}
class Solution {
    public int[] solution(String s) { // 01110 들어옴

        int countzero=0; // 제거되는 0의갯수 담을변수
        int size = s.length(); //처음에 받는 s의 배열크기
        ArrayList<Integer> convertintarr = new ArrayList<Integer>();

        for(int i=0;i<size;i++){ // 처음 받은 문자열배열 정수배열로 바꾸기
            char chatAtIndexi = s.charAt(i);
            int temp = Integer.parseInt(String.valueOf(chatAtIndexi));
            convertintarr.add(temp);
//            System.out.println(stointarr.get(i)); 여긴 잘 됐음.
        }

        size = convertintarr.size();//5


        int countbinary = 0; //이진변환 횟수
        boolean sizeoverone = true;

// 초기화 시킬 위치를 잘 생각해서 넣어야댐. 안그러면 게속 쌓여서 무한루프 돈다.

        while(sizeoverone) {
            ArrayList<Integer> arrone = new ArrayList<Integer>(); // 0 빼고 1만 담을 배열
            ArrayList<Integer> convertintarr2 = new ArrayList<>(); //
            for(int i = 0;i<size;i++) { // 이진정수배열 0빼고 1만 새로 담는 루프
                int temp = convertintarr.get(i);
                if(temp==1) {
                    arrone.add(temp); // 0제거1만담기..길이를 int로받고 이진변환 해야됨
                }
                else {
                    countzero++;
                }
            } // arrone = 111 얘가 초기화가 안됏음
            size=arrone.size(); //길이를 int로 받은거. // 3 나와야댐. ㅇㅇ나옴.

            String binary = Integer.toBinaryString(size); // 1의갯수 size -> 이진변환 코드
            int finalsize = binary.length(); // 이진변환결과사이즈? -> 2
            sizeoverone = finalsize>1;// -> true
            countbinary++;

//            System.out.println(finalsize);
            for(int i=0;i<finalsize;i++){ // 문자열 binary 정수배열로 바꾸기
                char chatAtIndexi = binary.charAt(i);
                int temp = Integer.parseInt(String.valueOf(chatAtIndexi));
                convertintarr2.add(temp); // error
            }
            convertintarr = convertintarr2;
            size=finalsize;

        }

        int[] answer = {countbinary,countzero};
        System.out.printf("이진변환횟수 : %d\n",countbinary);
        System.out.printf("제거된0의갯수 : %d",countzero);

        return answer;


    }
}

