public class uniqueNumber {
    public int findUnique(int[] arr) {
        int res=0;
        for(int el:arr) res^=el;
        return res;
    }
}
