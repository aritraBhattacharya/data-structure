package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

public class CombinationSum {

    public List<List<Integer>> twoSum(List<Integer>candidates, int target) {
        //-----------------2SUM----------------------------------------------------------------------
        HashMap<Integer,Integer> items = new HashMap<>();
        for (int i=0; i<candidates.size();i++){
            items.put(candidates.get(i), target-candidates.get(i));
        }
        List<List<Integer>> sumResult_2SUM = new ArrayList<>();
        for(int a=0;a<candidates.size();a++){
            if(items.get(candidates.get(a))== (target-candidates.get(a))){
                List<Integer> temp = new ArrayList<>();
                temp.add(candidates.get(a));
                temp.add(items.get(candidates.get(a)));
                sumResult_2SUM.add(temp);
            }
        }
        return sumResult_2SUM;

        //-----------------2SUM--------------------------------------------------------------------------
    }

    public List<List<Integer>> threeSum(List<Integer>candidates, int target) {
        List<List<Integer>> sumResult_3SUM = new ArrayList<>();

        if(candidates.size()==3){
            int tempSum =0;
            for (Integer candidate : candidates) {
                tempSum+=candidate;
            }
            if(tempSum==target){sumResult_3SUM.add(candidates);}
        }
        else{

        }


        return sumResult_3SUM;

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer,Integer> items = new HashMap<>();
        for (int i=0; i<candidates.length;i++){
            items.put(candidates[i], target-candidates[i]);
        }




       // ----------------3 SUM -------------------------------------------------------------------





       // ----------------3 SUM -------------------------------------------------------------------


        // find all combination with unlimited duplication
        for (int j=0; j<candidates.length;j++){
            if(target%candidates[j]==0){
                // combination for only single digit
                List<Integer> iArray = new ArrayList<>();
                for(int k=0;k<target/candidates[j];k++){
                    iArray.add(candidates[j]);
                }
            }
            else{

                for(int l=0;l<=target/candidates[j];l++) {
                    List<Integer> iArray1 = new ArrayList<>();
                    List<Integer> restItems = new ArrayList<>();
                    for(int n=0;n<candidates.length;n++){
                        if(candidates[j]!=candidates[n]){
                            restItems.add(candidates[n]);
                        }
                    }

                    // for values of L --> insert candidates[j] into iArray1 upto Lth index && check if (target - candidates[j]*(L)) can be created from candidates where candidates[j] is not present
                    // L zero means if the given sum is possible without candidates[j]
                    for (int m=0;m<=l;m++){
                        iArray1.add(candidates[j]);
                    }
                    int restSum = target-candidates[j]*l;


                }
            }
        }




        return result;


    }
}


