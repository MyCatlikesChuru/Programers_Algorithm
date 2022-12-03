package Level1.Hash;

import java.util.*;
import java.util.stream.Collectors;

/*
* 폰켓몬
* */
public class Poketmon {
    public static void main(String[] args) {
        Poketmon poketmon = new Poketmon();
        System.out.println(poketmon.solution(new int[]{3,3,3,2,2,2}));
    }
    public int solution(int[] nums) {

        // Stream으로 푸는 방법
//        Integer collect = Arrays.stream(nums)
//                .boxed()
//                .collect(
//                        Collectors.collectingAndThen(
//                                Collectors.toSet(),
//                                phonekekmons -> Integer.min(phonekekmons.size(), nums.length / 2)
//                        )
//                );

        int answer = 0;
        int half = (int) nums.length / 2 ;
        Set<Integer> hashSet = new HashSet<>();

        for(Integer num : nums){
            hashSet.add(num);
        }

        return (hashSet.size() > half) ? half : hashSet.size();
    }
}
