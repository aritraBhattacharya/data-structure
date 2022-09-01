package arrays;

public class RainWaterTrapping {
    public int trap(int[] height) {

        if (height.length == 0 || height.length == 1) {
            return 0;
        }

        int[] prevMax = new int[height.length];
        int[] postMax = new int[height.length];
        int prevMaxValue = 0;
        int postMaxValue = 0;
        int result = 0;

        for (int i = 0, j = height.length - 1; i < height.length && j >= 0; i++, j--) {
            prevMax[i] = prevMaxValue;
            if (prevMaxValue < height[i]) prevMaxValue = height[i];

            postMax[j] = postMaxValue;
            if (postMaxValue < height[j]) postMaxValue = height[j];
        }
        for (int a = 0; a < height.length; a++) {
            int heightDiff = Math.min(prevMax[a], postMax[a]);
            if (heightDiff > height[a]) {
                result += heightDiff - height[a];
            }
        }
        return result;
    }
}
