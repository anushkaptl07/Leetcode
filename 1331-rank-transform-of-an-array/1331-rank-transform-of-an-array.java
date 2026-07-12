class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.offer(num);
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        while (!pq.isEmpty()) {
            int curr = pq.poll();
            if (!map.containsKey(curr)) {
                map.put(curr, rank++);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}