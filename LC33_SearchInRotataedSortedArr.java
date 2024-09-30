package DSA;

public class LC33_SearchInRotataedSortedArr {
    public int search(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            //check if left part is sorted
            if(nums[low]<=nums[mid]){
                //now check for target is present between first half
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }//if left part is not sorted then the right is and do same for searching
            else{
                if (nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }

            }

        }

        return -1;
    }
}
