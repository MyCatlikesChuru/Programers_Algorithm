package Test;

public class test2 {
    public static void main(String[] args) {

        test2 test2 = new test2();
        test2.solution(10);
    }

    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<n;i++){
            if((n%i) == 1){
                answer = i;
                break;
            }
        }

        return answer;
    }
}
