package Arrays;
public class Subarray {
    
    public static void printSubA(int array[]){
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            int start=i;
            int sum=0;
            
            
            for(int j=i;j<array.length;j++){
                int end=j;
                sum+=array[j];
                for(int k=start;k<=end;k++){
                    System.out.print(array[k]+" ");

                }
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
        int number[]={1,-2,-7,-1,3};
        printSubA(number);

    }
    
}
