package Arrays;
public class PrefixSumSubarray {
    public static void printSubA(int array[]){
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        
        
        int prefix[]=new int[array.length];
            prefix[0]=array[0];
            for(int i=1;i<prefix.length;i++){
                prefix[i]=prefix[i-1]+array[i];
            }

        for(int i=0;i<array.length;i++){
            int sum=0;   
            
            for(int j=i;j<array.length;j++){
                sum= i == 0 ? prefix[j]:prefix[j]-prefix[i-1];
                
               
                System.out.println("    sum of subarray: "+ sum);
                if(sum<=minsum){
                minsum=sum;
                }

            }
            if(sum>=maxsum){
                maxsum=sum;
            }
            
            System.out.println();
        }
        System.out.println("Max sum is: "+ maxsum +"\nMin sum is: " + minsum);
    }
    public static void main(String args[]){
        int number[]={1,-2,6,-1,3};
        printSubA(number);

    }
    
}
