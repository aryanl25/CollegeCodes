package Arrays;
public class SearchIn2DArray {

    public static void main(String args[]){
        int eg[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        StaircaseSearch(eg,16);

    }

    public static boolean StaircaseSearch(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.print("The index of key is "+row+","+col);
                return true;
            }
            else if(key>matrix[row][col]){
                row++;
            }
            else if(key<matrix[row][col]){
                col--;
            }
        }
        System.out.println("Key not found");
        return false;

    }

}
