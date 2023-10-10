import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
/*


        String str = "025";



        //string 은 char배열임!!!! 맞다!!
        int num = str.length();
        int countone = 0;
        int countzero=0;
        // int[]는 고정크기 arraylist는 가변크기.
        int[] arr;
        ArrayList<Integer> arrr = new ArrayList<Integer>();




        for(int i =0;i<num;i++){

        }

//        int number = Integer.parseInt(str);
        System.out.println(num);

*/      String numeric = "01101101";



    }
    public int[] solution(String s) {

        int countzero = 0;
        int size = s.length();
        ArrayList<Integer> arrone = new ArrayList<Integer>();

        for(int i = 0;i<size;i++) {
            int temp = Integer.parseInt(s[i]);

            if(temp==1) {
                arrone.add(temp);
            }
            else {
                countzero++;
            }
        }


        int[] answer = {};
        return answer;
    }
}
