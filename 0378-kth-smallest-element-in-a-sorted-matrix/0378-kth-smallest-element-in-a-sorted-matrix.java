class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> Max_heap = new PriorityQueue<>(Collections.reverseOrder());
        int n = matrix.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                Max_heap.add(matrix[i][j]);
                if(Max_heap.size()>k){
                    Max_heap.poll();
                }
            }
        }
        return Max_heap.poll();
    }
}