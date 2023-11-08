package Arrays;
public class pairray{
    public static void printpairs(int array[]){
        int tp=0;
        for(int i=0;i<array.length;i++){
            
            int curr=array[i];
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+curr+","+array[j]+")");
                tp++;
            }
            System.out.println(); 
        }
        System.out.println("Total pairs are: "+tp);
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6};
        printpairs(nums);

    }
}