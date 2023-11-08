package Arrays;
public class SpiralMatrix {
    public static void main(String args[]){
        int eg[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiral(eg);

    }

    public static void printSpiral(int matrix[][]){
        int startRow= 0;
        int endRow= matrix.length-1;
        int startCol= 0;
        int endCol =matrix[0].length-1;  
        while(startRow<=endRow && startCol<=endCol){
            
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            for(int i=endCol-1;i>=startCol;i--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
}
    

