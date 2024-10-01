package DSA;

public class LC31 {
    public void nextPermutation(int[] nums){
        int ind=0;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }else{
                ind=-1;
            }
        }

        if(ind==-1){
            int low=0;
            int high=n-1;
            while(low<=high){
                int temp=nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
                high--;
                low++;
            }
            return;
        }

        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[ind]){
                int temp=nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }

        int low=ind+1;
        int high=n-1;
    while(low<=high){
        int temp=nums[low];
        nums[low]=nums[high];
        nums[high]=temp;
        high--;
        low++;
    }

    }
}
