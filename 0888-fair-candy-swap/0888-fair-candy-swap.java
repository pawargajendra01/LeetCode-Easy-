class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int[] result = new int[2];
        int aliceTotal = 0;
        int bobTotal = 0;

        for (int i = 0; i < aliceSizes.length; i++) {
            aliceTotal += aliceSizes[i];
        }

        for (int i = 0; i < bobSizes.length; i++) {
            bobTotal += bobSizes[i];
        }
        int aliceTotalfinal = aliceTotal;
        int bobTotalfinal = bobTotal;

        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                aliceTotal += bobSizes[j] - aliceSizes[i];
                bobTotal += aliceSizes[i] - bobSizes[j];
                if (aliceTotal == bobTotal) {
                    result[0] = aliceSizes[i];
                    result[1] = bobSizes[j];
                }
                aliceTotal = aliceTotalfinal;
                bobTotal = bobTotalfinal;
            }
        }
        return result;
    }
}