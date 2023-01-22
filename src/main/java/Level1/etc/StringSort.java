package Level1.etc;

import java.util.Arrays;

public class StringSort {

    public static void main(String[] args) {
        StringSort stringSort = new StringSort();
        System.out.println(stringSort.solution("Zbcdefg"));
    }

    public String solution(String s) {
        char[] buffer = s.toCharArray();
        Arrays.sort(buffer);
        return new StringBuilder(new String(buffer)).reverse().toString();
    }
}
