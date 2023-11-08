package Arrays;
public class KadaneAlgoSubarraySum {
    
    public static void kadanes(int array[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            cs+=array[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Max Subarray sum is: "+ms);

    }
    
    public static void main(String args[]){
        int number[]={1,-2,6,-1,3}; 
        kadanes(number);

    }
    
}
