package Level1.StackQueue;

import java.util.*;
import java.util.stream.Collectors;

public class HateSameNumber {
    public static void main(String[] args) {
        HateSameNumber hateSameNumber = new HateSameNumber();
        System.out.println(Arrays.toString(hateSameNumber.solution(new int[]{1,1,3,3,0,1,1})));
        System.out.println(Arrays.toString(hateSameNumber.solution(new int[]{4,4,4,3,3})));
    }
    public int[] solution(int []arr) {
        int buff = -1;
        List<Integer> arrayList = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if(buff == arr[i]){
                continue;
            }else {
                buff = arr[i];
                arrayList.add(buff);
            }
        }
        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}
