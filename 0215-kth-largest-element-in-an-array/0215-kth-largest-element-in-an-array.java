class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>heap = new PriorityQueue<>();

        for(int num : nums){
            if(heap.size() < k){
                heap.add(num);
            }
            else{
                if(num > heap.peek()){
                    //[3,2,8]
                    //<3,8> remove the min number
                    heap.poll();//remove the number
                    //and add larger num 
                    heap.add(num);
                }
            }
        }
        return heap.peek();
    }
}