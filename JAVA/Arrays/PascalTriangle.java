package Arrays;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        PascTr(a);
        sc.close();

        

    }

    

    public static void PascTr(int rows){

        int matrix[][] = new int[rows][rows];
        matrix[0][0]=1;
        matrix[1][1]=1;
        for(int i=0;i<rows;i++){            
            for(int j=0;j<=i;j++){
                if(i==0 && j==0){
                    continue;
                }
                if(i==1 && j==1){
                    continue;
                }
                if(j==0){
                    matrix[i][j]=1;
                    continue;
                }
                if(j!=0){
                    matrix[i][j]=matrix[i-1][j]+matrix[i-1][j-1];
                }
                    
            }
        }

        //to print matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                if(matrix[i][j]!=0){
                    System.out.print(matrix[i][j]+" ");
                }
                else if(matrix[i][j]==0){
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        

    }




    
}
