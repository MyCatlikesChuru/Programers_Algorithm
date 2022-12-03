package Level1.Hash;

import java.util.HashMap;
import java.util.*;

/*
* 완주하지 못한 선수
* */
public class Maraton {
    public static void main(String[] args) {
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        for (int i = 0; i < completion.length; i++) {
//            if (!participant[i].equals(completion[i])) {
//                return participant[i];
//            }
//        }
//        return participant[participant.length-1];
        Maraton maraton = new Maraton();

        String[] participant = {"leo","papa","jons"} ;
        String[] completion = {"papa","jons"} ;
        System.out.println(maraton.solution(participant,completion));

    }
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hashMap = new HashMap<>();

        for(String player : participant){
            hashMap.put(player, hashMap.getOrDefault(player,0) + 1);
        }

        for(String player : completion){
            hashMap.put(player, hashMap.get(player) - 1);
        }

        for(String key : hashMap.keySet()){
            if(hashMap.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
