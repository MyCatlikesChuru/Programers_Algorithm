package Level2.Hash;

import java.util.Arrays;

/*
* 전화번호 목록
* */
public class PhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        System.out.println(phoneBook.solution(new String[]{"119", "97674223", "1195524421"})); // 기대치 : false
        System.out.println(phoneBook.solution(new String[]{"123","456","789"})); // 기대치 : true
        System.out.println(phoneBook.solution(new String[]{"12","123","1235","567","88"})); // 기대치 : false
    }

    public boolean solution(String[] phone_book) {

        /*
        * 방법 1. 배열을 sort하여 앞에서 부터 비교한다.
        * 방법 2. Map에 전화번호 목록을 전체 저장 후, 문자열의 앞자리부터 Key값으로 조회하기
        * */

        Arrays.sort(phone_book);

        for(int i=0; i<phone_book.length-1; i++){

            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;
    }
}
