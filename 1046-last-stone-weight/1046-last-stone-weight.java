class Solution {
    public int lastStoneWeight(int[] stones) {
        // 1. Create a Max-Heap and add all stones
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) {
            maxHeap.add(s);
        }

        // 2. Smash stones until 1 or 0 remain
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll(); // Largest
            int stone2 = maxHeap.poll(); // Second largest
            
            if (stone1 != stone2) {
                maxHeap.add(stone1 - stone2); // Put the remainder back
            }
        }

        // 3. Return the last stone or 0 if none left
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}