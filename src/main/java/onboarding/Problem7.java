package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> myFriend = new ArrayList<>();
        List<List<String>> theirFriend = new ArrayList<>();
        List<String> listName = new ArrayList<>();
        List<Integer> listScore = new ArrayList<>();

        // Who is my friend?
        for(int i=0; i<friends.size(); i++){
            if(friends.get(i).get(0).equals(user)){
                myFriend.add(friends.get(i).get(1));
                listName.add(friends.get(i).get(1));
                listScore.add(0);
            }
            else if(friends.get(i).get(1).equals(user)){
                myFriend.add(friends.get(i).get(0));
                listName.add(friends.get(i).get(0));
                listScore.add(0);
            }
            else{
                theirFriend.add(friends.get(i));
            }
        }

        return listName;
    }
}
