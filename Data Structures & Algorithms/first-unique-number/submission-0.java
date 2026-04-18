class FirstUnique {
    private HashMap<Integer, Integer> freqMap;
    private Queue<Integer> queue;

    public FirstUnique(int[] nums) {
        freqMap = new HashMap<>();
        queue = new LinkedList<>();

        for(int i : nums){
            add(i);
        }

    }
    
    public int showFirstUnique() {
        while(!queue.isEmpty() && freqMap.get(queue.peek()) > 1){
            queue.poll();
        }

        return queue.isEmpty() ? -1 : queue.peek();
    }
    
    public void add(int value) {
            freqMap.put(value, freqMap.getOrDefault(value, 0) + 1);
            queue.offer(value);
        
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
