class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder result = new StringBuilder();
        int brackets = 0;
        List<Integer> index = new ArrayList<Integer>();
        for(char a : s.toCharArray()) {
            if(a == '(') {
                result.append(a);
                brackets++;
                index.add(result.length()-1);
            } else if(a == ')') {
                if(brackets > 0) {
                    result.append(a);
                    brackets--;
                }
            } else result.append(a);
        }
        if(brackets == 0) return result.toString();
        else {
            int n = index.size(), i = 1;
            while(brackets > 0) {
                result.deleteCharAt(index.get(n - i));
                i++;
                brackets--;
            }
            return result.toString();
        }
    }
}