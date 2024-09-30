package DSA;
//This problem is same as LC33 but contains duplicates which increases the one edge case which is the  arr[low]==arr[mid]==arr[high] but we have to handle it by triming the low and high

public class LC81_SearchInRotatedSortedArrII {
    public boolean search(int[]nums,int target){
        int low=0;
        int high=nums.length-1;
        
        while(low<=high){
            int mid=(high+low)/2;
            if(nums[mid]==target){
                return true;
            }

            //handle the edgecase of arr[low]==arr[mid]==arr[high]
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                high -=1;
                low  +=1;
                continue;
            }


            //same as first 
            //check if left part is sorted
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[high]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}
