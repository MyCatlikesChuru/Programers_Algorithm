package Level1;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Optional;

public class SecretMap {
    public static void main(String[] args) {
        SecretMap secretMap = new SecretMap();
        System.out.println(Arrays.toString(secretMap.solution(
                5,
                new int[]{9, 20, 28, 18, 11},
                new int[]{30, 1, 21, 17, 28}
        )));
    }
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};

        String s1 = Integer.toBinaryString(9);
        String s2 = Integer.toBinaryString(30);

        System.out.println(s1);
        System.out.println(s2);
        String result = "";
        for(int i=0; i<n; i++){

            if('1' == s1.charAt(i)){
                result += "#";
            } else {
                result += " ";
            }
        }
        System.out.println(result);

        return answer;
    }
}
