package onboarding;

import java.util.List;
import java.util.ArrayList;
public class Problem3 {
    public static int solution(int number) {
        List<Integer> num = new ArrayList<>();
        int answer = 0;
        int n;

        // split each numbers, put them in the list
        for (int i = 1; i <= number; i++) {
            n=i;
            while(n>0){
                num.add(n%10);
                n/=10;
            }
        }

        return answer;
    }
}
