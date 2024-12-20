package ArrayList;

import java.util.ArrayList;

public class TwoDList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>()); // create ArrayList inside a ArrayList
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(3); //First get the arraylist then add the elements into it
            }
        }
        System.out.println(list);
    }
}
