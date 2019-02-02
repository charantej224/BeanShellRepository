

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.ArrayList;
import java.util.List;

class MainStudent {
    public int solution(int[] A) {
        int max = 0;
        // write your code in Java SE 8
        List<Integer> backUpList = new ArrayList<Integer>();
        for (int a : A){
            backUpList.add(a);
        }
        System.out.println(backUpList.size());
        for(int counter = 0;counter < A.length;counter++){
            List<Integer> intList = new ArrayList<Integer>(backUpList);
            System.out.println(counter);
            intList.remove(counter);
            if(checkifSorted(intList)){
                max++;
            }
        }
        return max;

    }

    public boolean checkifSorted(List<Integer> integerList){
        boolean isSOrted = true;
        for(int i = 0; i < integerList.size()-1;i++){
            if(integerList.get(i) > integerList.get(i+1)){
                isSOrted = false;
                break;
            }
        }
        return isSOrted;
    }

    public static void main(String[] args){
    	MainStudent solution = new MainStudent();
        int[] a = {4,5,2,3,4};
        System.out.println(solution.solution(a));
    }

}