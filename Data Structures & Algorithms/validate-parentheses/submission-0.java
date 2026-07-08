class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '('); 
        map.put(']', '[');
        map.put('}', '{');

        for(char i: s.toCharArray()){
            if(i == '(' || i == '[' || i == '{'){
                stack.push(i);
            }else{
                
                if (stack.isEmpty()) {
                    return false;
                }

                if(stack.peek() == map.get(i)){
                    stack.pop();
                } else return false;
            }
        }
        return stack.isEmpty();
    }
}
