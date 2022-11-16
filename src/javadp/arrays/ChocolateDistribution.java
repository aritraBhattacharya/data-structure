package javadp.arrays;

import java.util.ArrayList;
import java.util.Collections;

/*
* Given an array of n integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.*/

public class ChocolateDistribution {
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        int minDiff = 0;
        Collections.sort(a);
        for(int i=0; i+m<=a.size();i++){
            int min = a.get(i);
            int max = a.get(i+m-1);
            if(i==0){
                minDiff = max-min;
            }
            else{
                if(max-min<minDiff){
                    minDiff = max-min;
                }
            }
        }

        return minDiff;
    }
}
