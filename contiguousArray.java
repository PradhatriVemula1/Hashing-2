class Solution {
    public int findMaxLength(int[] nums) {
        int rsum=0,max=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                rsum--;
            }else rsum++;
            if(map.containsKey(rsum)){
                max=Math.max(max,i-map.get(rsum));
            } else map.put(rsum,i);
        } return max;
    }
}