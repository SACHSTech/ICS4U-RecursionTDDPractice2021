package recursiontdd;
public class Group6{
  public static boolean array6(int[] nums, int index){
    if(nums.length == 0 || index > nums.length-1){
      return false;
    }
    if(nums[index] == 6){
      return true;
    }
    return array6(nums, index + 1);
  }
}