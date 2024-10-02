package DSA;

import java.util.ArrayList;

public class GFG_chocolateDistribution {
    
    public long findMinDiff(ArrayList<Integer> a,int n,int m){
        //inbuilt for the sorting 
        Collections.sort(a);
        long currDiff=0;
        long minDiff=Integer.MAX_VALUE;
        for(int i=0;i<=n-m;i++){
            currDiff=a.get(i+m-1)-a.get(i);
            minDiff=Math.min(currDiff,minDiff);


        }
return minDiff;
    }
}
