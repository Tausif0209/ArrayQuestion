import java.util.Arrays;

public class HIndex {
  public int hIndex(int[] citations) {
        int max=0;
        Arrays.sort(citations);
        for(int i=citations.length-2;i>=0;i--) {
            if(citations[i]!=citations[i+1]) max=Math.max(max,Math.min(citations.length-i-1,citations[i+1]));
        }
        return  max=Math.max(max,Math.min(citations.length,citations[0]));
    }
}
