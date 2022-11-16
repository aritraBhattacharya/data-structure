package javadp.arrays;

import java.util.HashMap;
import java.util.Map;

public class IsItSubSet {
    // SUB SET - NOT SUB ARRAY
    public String isSubset( long a1[], long a2[], long n, long m) {

        if(m>n) return "No";

        Map<Long,Integer> masterMap = new HashMap<>();
        Map<Long,Integer> subMap = new HashMap<>();

        // take all elements of a1 into the master map
        for(int i=0;i<a1.length;i++){
            if(masterMap.get(a1[i])!=null){
                int count = masterMap.get(a1[i]);
                count++;
                masterMap.put(a1[i],count);
            }
            else{
                masterMap.put(a1[i],1);
            }
        }
        // take al elements of a2 into sub map
        for(int i=0;i<a2.length;i++){
            if(subMap.get(a2[i])!=null){
                int count = subMap.get(a2[i]);
                count++;
                subMap.put(a2[i],count);
            }
            else{
                subMap.put(a2[i],1);
            }
        }
        // ALL ELEMENTS OF A2 HAVE TO BE PRESENT IN THE MASTER MAP
        // **** ALSO THE COUNT OF THAT CHARACTER IN MASTER MAP HAS TO BE GREATER THAN OR EQUAL TO THE SUB MAP COUNT

        String status = "Yes";
        for(int j=0;j<a2.length;j++){
            if(!(masterMap.get(a2[j])!=null && masterMap.get(a2[j])>=subMap.get(a2[j]))){
                status =  "No";
                break;
            }

        }
        return status;

    }
}
