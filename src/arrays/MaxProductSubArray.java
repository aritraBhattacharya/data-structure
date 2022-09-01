package arrays;

public class MaxProductSubArray {

    // resource:  https://www.youtube.com/watch?v=_swfazM9vnA&ab_channel=CodingNinjas
    public int maxProduct(int[] nums) {
        int maxProductRes = 0;

        int maxTillPoint=1, minTillPoint =1;
        int maxElementInTheArray = nums[0]; // check point 6: this is for Arrays consisting of Only -ve or -Ve & 0s
        boolean maxTillPointHasNeverChanged = true;

        for (int i=0;i<nums.length;i++){
            if(nums[i]>maxElementInTheArray){
                maxElementInTheArray = nums[i];
            }
            if(nums[i]==0){
                /*
                * stop here as multiplying 0 will ruin everything, reset maxTillPoint & minTillPoint
                * check if maxTillPoint is greater than maxProductRes --> if yes then update maxProductRes
                * Start over from i+1
                * */
                if(maxTillPoint>maxProductRes){
                    maxProductRes = maxTillPoint;
                    if(maxTillPoint>1) {
                        maxTillPointHasNeverChanged = false;
                    }
                }
                maxTillPoint = 1;
                minTillPoint = 1;
                i++;
            }
            else if(nums[i]>0){
                maxTillPointHasNeverChanged = false;
                maxTillPoint*=nums[i];
                minTillPoint = Math.min(1,minTillPoint*nums[i]);
                // take thin min of 1 or minTillPoint*nums[i], because it might happen that there were no negative element till nums[i]
                // and we want to keep minTillPoint as small as possible

                if(maxTillPoint>maxProductRes){maxProductRes = maxTillPoint;}

            }
            else if (nums[i]<0){
                maxTillPoint = Math.max(1, minTillPoint*nums[i]); // if there were no -ve element till i, then minTillPoint*nums[i] would become -ve, so take max of 1 & minTillPoint*nums[i]
                if(maxTillPoint!=1){
                    maxTillPointHasNeverChanged = false;
                }
                minTillPoint = maxTillPoint*nums[i];

                if(maxTillPoint>maxProductRes){maxProductRes = maxTillPoint;}
            }
        }

        if(maxTillPointHasNeverChanged){ // check point number 6
            maxProductRes = maxElementInTheArray;
        }

        return maxProductRes;
    }

    public static void main(String[] args) {
        MaxProductSubArray maxProductSubArray = new MaxProductSubArray();
        int[] ip = {0};
        int res = maxProductSubArray.maxProduct(ip);
        System.out.println(res);
    }
}

/* [2,3,-2,4]
   [-2,0,-1]

   1. We will normally traverse the array and at any given index, we will record the highest and lowest (either negative or 1) product that can be achieved till that point.
   2. Keeping track of the highest product is fine but why we are keeping track of minimum product is :
        Because it's supposedly negative. And if the next element in the array is negative then prevMinProduct*a[i] can become the next highest product and the
        prevMaxProduct*a[i] can become next minimum product.

   3. We will continue this till we encounter a 0 element. In that case we will again make maxTillHere = 1 and minTillHere =1 and start over from the next element.

   4. So we are going to stop our operation only when we encounter a 0 element and if we have iterated over the array

   5. in each stopping point we will check the max product we have got till that point and accordingly will update the final result

   6. ** this will work ig the array has at least one +ve element. But if all are -Ve and 0s then we will get max result as 1, as u can see in the code
        whereas the array has only -ve, or -ve and 0s --> so the max result should be -ve or 0.
        TO SOLVE this we have to track the largest element in the array. and if at the end MaxRes > maxElement, that means it is so because all elements are either -ve or 0.
*
*
*
* */
