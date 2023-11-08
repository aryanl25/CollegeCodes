package Arrays;
public class DiagonalSum {
    public static void main(String args[]){
        int eg[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        DGSum(eg);

    }

    public static void DGSum(int matrix[][]){
        int sum=0;
        
        // for(int i=0;i<matrix[0].length;i++){
        //     for(int j=0;j<matrix.length;j++){
        //         if(i==j || i+j==matrix[0].length-1){
        //             sum1+=matrix[i][j];
        //         }
        //     }
        // } O(n^2)
        for(int i=0;i<matrix.length;i++){
            sum+= matrix[i][i];
            if(i!=matrix.length-i-1)// so that col and row equal element shudnt be added as already added in above line of code hence:
                sum+= matrix[i][matrix.length-i-1];// here i and matrix.length-i-1 shudnt be equal
        }
        System.out.print(sum);
        

    }
    
}
