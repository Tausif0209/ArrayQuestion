import java.util.HashSet;

public class uniqueNumber3 {
   public int getSingle(int[] arr) {
        HashSet<Integer> appearOnce=new HashSet<>();
        HashSet<Integer> appearTwice=new HashSet<>();
        for(int el:arr){
            if(appearTwice.contains(el)) continue;
            if(appearOnce.contains(el)) {
                appearOnce.remove(el);
                appearTwice.add(el);
            } else appearOnce.add(el);
        }
        int ans=-1;
        for(int el:appearOnce) ans=el;
        return ans;
    }
}
