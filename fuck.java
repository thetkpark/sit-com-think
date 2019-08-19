public class fuck {
  public static int makeChocolate(int small, int big, int goal) {
    int a = 0;
    for(int i=0;i<big;i++){
      int temp = a + 5;
      if(temp>goal) break;
      a = a + 5;
      System.out.println(a);
    }
    if(a==goal) return 0;
        
    int count = 0;
    for(int i=0;i<small;i++){
      int temp = a + 1;
      if(temp>goal) break;
      a = a + 1;
      count++;
      System.out.println(a);
    }
    if(a==goal) return count;
    return -1;
  }

  public static int sum67(int[] nums) {
    boolean isSix = false;
    int result = 0;
    for(int i=0;i<nums.length;i++){
      
      if(nums[i] == 6) {
        isSix = true;
        continue;
      }
      if(nums[i] == 7 && isSix){
        isSix = false;
        continue;
      }
      if(isSix == true) continue;
      
      result = result + nums[i];
    }
    
    return result;
    
  }

  public static boolean either24(int[] nums) {
    boolean four = false;
    boolean one = false;
    for(int i=0;i<nums.length-1;i++){
      if(nums[i] == 2 && nums[i+1] == 2) one = true;
      if(nums[i] == 4 && nums[i+1] == 4) four = true;
    }
    System.out.println(one);
    System.out.println(four);
    if(one && four) return false;
    
    if(one||four) return true;
    return false;
  }

  public static int[] notAlone(int[] nums, int val) {
    int[] result = new int[nums.length];
    for(int i=0;i<nums.length;i++){
      if(nums[i]==val){
        if(nums[i-1]!=val && nums[i+1]!=val){
          int bigger;
          if(nums[i-1]>=nums[i+1]) bigger = nums[i-1];
          else bigger=nums[i+1];
          result[i] = bigger;
          continue;
        }
        result[i] = nums[i];
      }
    }
  }
  
  
    

      
  public static void main (String[] args) {
    //System.out.println(makeChocolate(4,1,5));
    int[] a = {1,2,2};
    //System.out.println(sum67(a));
    System.out.println(either24(a));
  }
}
  