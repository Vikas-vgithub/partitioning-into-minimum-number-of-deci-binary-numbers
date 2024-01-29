class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(int i=0; i<n.length(); i++){
            char c = n.charAt(i);
            int a=Integer.parseInt(String.valueOf(c));  
            if(a>max){
                max=a;
            }
        }
        return max;
    }
}
