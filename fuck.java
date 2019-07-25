public class fuck {
    public static boolean noTriples(int[] nums) {
        int len = nums.length;
        for(int i = 0;i<len-2;i++){
          int count = 0;
            if(nums[i]==nums[i]) count++;
            if(nums[i+1]==nums[i]) count++;
            if(nums[i+2]==nums[i]) count++;
            if(count==3) return true;
          
        }
        return false;
    }
    public static void main (String[] args) {
        int[] ar = {1, 1, 2, 2, 1};
        boolean result = noTriples(ar);
    System.out.println(result);
    }
}
  