package Sorting;

//import java.util.Arrays;
//this gives you inbuilt sorting with command Arrays.sort(arr) OR Arrays.sort(arr,startingindex,endingindex (ending index not inclusive)) with TC O(n log n)

//import java.util.Collections;
//this gives you access to Arrays.sort(arr,Collections.reverseOrder()) or Arrays.sort(arr,si,ei(non inclusive),Collections.reverseOrder()) which can sort in descending order (NOTE: only works on Integer type array and not int type as Integer type means object array of class integer)
public class BasicSorting {
    public static void main(String args[]){
        int num[]={1,45,5,2,7};
        CountingSort(num);
        PrintArr(num);
            
    }

    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
//bubble sorting is when adjacent elements are being constantly swapped by comparison till we get sorted array
    public static void BubbleSort(int arr[]){
        int n=arr.length;
        for(int turn=0;turn<=arr.length-1;turn++){
            for(int j=0;j<n-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

    }

    public static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
    }
//Selection sort is when you take smallest element and insert it at start (select smallest from unsorted part and insert in sorted part)
    public static void SelectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minpos=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }


    }
    
    public static void InsertionSort(int arr[]){
        //first we make for loop for comparison and sorting of i'th element in the unsorted part into the sorted part
        for(int i=1;i<arr.length;i++){
            //while loop pushes the sorted elements forward till we get the index where the i'th element is found a location in the sorted array
            int temp=arr[i];
            int j=i-1;
            while(arr[j]>temp && j>=0){
                arr[j+1]=arr[j];
                j--;
            }
            //now all elements are pushed forward and the index j+1 is empty for the i'th element to be inserted
            arr[j+1]=temp;
        }


    }
//counting sort is used when the range of numbers is less which can give worst case time complexities as low as o(n), it is done by recording frequencies of the given array in a different array called count of size +1 than original array to include 0 and according to frequencies, the original array is updated in ascending order through the count array which stores frequency of element which is equal to index (index=element;frequency(index) is stored in count[index])

    public static void CountingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(arr[i],largest);

        }
         
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
                while(count[i]>0){
                arr[j]=i;
                count[i]--;
                j++;

            }
        }
    
    
    }
}
