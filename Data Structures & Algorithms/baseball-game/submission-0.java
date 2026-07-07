class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();

        for(String c: operations){
            switch (c) {
                case "+" -> record.push(record.get(record.size() - 1) + record.get(record.size() - 2));
                case "D" -> record.push(record.peek() * 2);
                case "C" -> record.pop();
                default -> record.push(Integer.valueOf(c));
            }
        }
        int totalSum = 0;
        for(int i: record){
            totalSum += i;
        }

        return totalSum;
    }
}