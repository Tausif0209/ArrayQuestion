import java.util.Arrays;
import java.util.HashSet;

public class uniqueNumber2 {
     public int[] singleNum(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int el:arr){
            if(set.contains(el)) set.remove(el);
            else set.add(el);
        }
        arr=new int[2];
        int i=0;
        for(Integer el:set) arr[i++]=el;
        Arrays.sort(arr);
        return arr;
    }
}
