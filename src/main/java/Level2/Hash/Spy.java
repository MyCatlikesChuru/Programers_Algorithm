package Level2.Hash;

import java.util.Arrays;
import java.util.HashMap;

/*
* 전화번호 목록
* */
public class Spy {
    public static void main(String[] args) {
        Spy spy = new Spy();
        System.out.println(spy.solution(new String[][]
                {
                    {"yellow_hat", "headgear"},
                    {"blue_sunglasses", "eyewear"},
                    {"green_turban", "headgear"}
                }
        ));
    }

    public int solution(String[][] clothes) {

        /*
        * 1. Map에 같은 종류의 의상끼리 카운팅하여 숫자를 센다.
        * 2. 의상 종류가 나왔고 해당 수량이 나왔으니, 조합하여 경우의 수를 구한다.
        * (A+1)*(B+1) - 1 = 경우의 수
        * */
        HashMap<String,Integer> hashMap = new HashMap<>();
        int result = 1;

        for (int i=0; i<clothes.length; i++){
            hashMap.put(clothes[i][1], hashMap.getOrDefault(clothes[i][1],0)+1);
        }
        for(String key : hashMap.keySet()){
            result *= hashMap.get(key) + 1;
        }
        return result-1;
    }
}
