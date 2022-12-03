package Level2;

import java.util.Arrays;

public class GetMinMaxString {
    public String getMinMaxString(String s) {

        String[] strs = s.split(" ");
        int max = Arrays.stream(strs).mapToInt(i -> Integer.parseInt(i)).max().orElse(0);
        int min = Arrays.stream(strs).mapToInt(i -> Integer.parseInt(i)).min().orElse(0);

        return min + " " + max;
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}
