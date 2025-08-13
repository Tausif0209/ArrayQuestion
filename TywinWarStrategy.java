import java.util.Arrays;

public class TywinWarStrategy {
  public int minSoldiers(int[] arr, int k) {
        int[] rem=new int[arr.length];
        for(int i=0;i<arr.length;i++) rem[i]=(arr[i]%k==0)?0:k-arr[i]%k;
        Arrays.sort(rem);
        int ans=0;
        int idx=arr.length%2==0?arr.length/2:arr.length/2+1;
        for(int i=0;i<idx;i++) ans+=rem[i];
        return ans;
    }
}
