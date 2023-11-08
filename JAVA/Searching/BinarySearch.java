package Searching;

public class BinarySearch {
    public static int BS(int array[], int key){
        int start=0;
        int end=array.length-1;

        while(start<=end){
            int mid= (start+end)/2;
            
            if(array[mid]==key){
                return mid;
            }
            if(array[mid]>key){
                end=mid-1;
            }
            if(array[mid]<key){
                start=mid+1;
            }
            
        }
        return -1;



    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8,123,1234,12345,12385};
        int key=12385;
        System.out.println("Index for key is: " + BS(numbers,key));

    }
    
}
