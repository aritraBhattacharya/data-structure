package javadp.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    static List<List<Integer>> finalResult = new ArrayList<>();
    public static List<List<Integer>> combinationSumWithoutDuplication(List<Integer>candidates, int target) {


        identifyPossibility(candidates,target,new ArrayList<Integer>());

        finalResult.forEach(list->{
            System.out.println("---------------\n");
            StringBuilder stringBuilder = new StringBuilder();
            list.forEach(it-> {
                stringBuilder.append(it.toString());
                stringBuilder.append(", ");
            });
            System.out.println(stringBuilder);
        });

        return finalResult;
    }
    public static List<List<Integer>> combinationSumWithDuplication(List<Integer>candidates, int target) {


        identifyPossibilityWithDuplicate(candidates,target,new ArrayList<Integer>());

        finalResult.forEach(list->{
            System.out.println("---------------\n");
            StringBuilder stringBuilder = new StringBuilder();
            list.forEach(it-> {
                stringBuilder.append(it.toString());
                stringBuilder.append(", ");
            });
            System.out.println(stringBuilder);
        });

        return finalResult;
    }

    private static void identifyPossibility(List<Integer> subArray,int iTarget, List<Integer> backStack){
        if(subArray.size()==1) {
            if (subArray.get(0) == iTarget) {
                List<Integer> iRes = new ArrayList<>();
                iRes.addAll(backStack);
                iRes.add(subArray.get(0));
                finalResult.add(iRes);

            }
        }
        else{
            List<Integer> iRes1 = new ArrayList<>();
            iRes1.addAll(backStack);
            // do not include the 1st element in the computation and try to create the sum with the rest
            identifyPossibility(subArray.subList(1,subArray.size()),iTarget,iRes1);

            // include the 1st element,
            // if itarget becomes 0 if included then save the backstack in final result
            // else proceed with the computation after including

            int includedTarget = iTarget-subArray.get(0);
            List<Integer> iRes2 = new ArrayList<>();
            iRes2.addAll(backStack);
            iRes2.add(subArray.get(0));
            if(includedTarget==0){
                finalResult.add(iRes2);
            }
            else {
                identifyPossibility(subArray.subList(1, subArray.size()), includedTarget, iRes2);
            }

        }
    }
    private static void identifyPossibilityWithDuplicate(List<Integer> subArray,int iTarget, List<Integer> backStack){
        if(subArray.size()==1) {
            if (subArray.get(0) == iTarget) {
                List<Integer> iRes = new ArrayList<>();
                iRes.addAll(backStack);
                iRes.add(subArray.get(0));
                finalResult.add(iRes);

            }
        }
        else{
            List<Integer> iRes1 = new ArrayList<>();
            iRes1.addAll(backStack);
            // do not include the 1st element in the computation and try to create the sum with the rest
            identifyPossibility(subArray.subList(1,subArray.size()),iTarget,iRes1);

            // include the 1st element,
            // if itarget becomes 0 if included then save the backstack in final result
            // else proceed with the computation after including

            int includedTarget = iTarget-subArray.get(0);
            List<Integer> iRes2 = new ArrayList<>();
            iRes2.addAll(backStack);
            iRes2.add(subArray.get(0));
            if(includedTarget==0){
                finalResult.add(iRes2);
            }
            else {
                identifyPossibility(subArray, includedTarget, iRes2);
            }

        }
    }


    private static void printMethod(List<Integer> subArray,int iTarget, List<Integer> backStack){
        StringBuilder sb1 = new StringBuilder();
        sb1.append("---------------------------------------------------");
        sb1.append("\n");
        sb1.append("subset = ");
        subArray.forEach(it-> {
            sb1.append(it.toString());
            sb1.append(", ");
        });

        sb1.append("\n");

        sb1.append("itarget = "+iTarget);
        sb1.append("\n");
        sb1.append("backstack = ");
        backStack.forEach(it-> {
            sb1.append(it.toString());
            sb1.append(", ");
        });
        sb1.append("\n");
        sb1.append("---------------------------------------------------");
        System.out.println(sb1);
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,2,3,4);
        System.out.println("----------- without duplication");
        CombinationSum.combinationSumWithoutDuplication(input,6);
        System.out.println("----------- with duplication");
        CombinationSum.combinationSumWithDuplication(input,6);
    }

}


