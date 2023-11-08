package JavaBasics;
import java.util.*;

public class elementRepeat{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int indx[]=new int[1000];
        for(int i=0;i<1000;i++){
            indx[i]=-1;
        }

        int mindx=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(indx[arr[i]]!=-1){
                mindx= Integer.min(indx[arr[i]],mindx);

            }
            else{
            indx[arr[i]]=i;}
            

        }

        System.out.println(mindx+1);
        sc.close();




    }

    

}