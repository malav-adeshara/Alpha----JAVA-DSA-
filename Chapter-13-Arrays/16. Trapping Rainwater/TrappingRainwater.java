public class TrappingRainwater {
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trappe Rainwater = " + calculatedTrappedRainwater(height));
    }

    public static int calculatedTrappedRainwater(int height[]) {
        int leftMaxBoundries[] = new int[height.length];
        leftMaxBoundries[0] = height[0];
        for(int i = 1; i < height.length; i++) {
            leftMaxBoundries[i] = Math.max(leftMaxBoundries[i-1], height[i]);
        }

        int rightMaxBoundries[] = new int[height.length];
        rightMaxBoundries[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i >= 0; i--) {
            rightMaxBoundries[i] = Math.max(rightMaxBoundries[i+1], height[i]);
        }

        int trappedWater = 0;
        for(int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMaxBoundries[i], rightMaxBoundries[i]);
            trappedWater += (waterLevel - height[i]);
        }

        return trappedWater;
    }
}
