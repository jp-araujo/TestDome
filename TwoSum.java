// https://www.testdome.com/questions/63472
import java.util.*;
public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        HashMap<Integer, Integer> indicesMap = new HashMap<>();

        for(int i = 0; i < list.length-1 ; i++){
            if(indicesMap.containsKey(sum-list[i])){
                return new int[] {indicesMap.get(sum-list[i]), i};
            }else{
                indicesMap.put(list[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);

        }
    }
}