package JavaBasics;

public class Patterns {
    
    public static void HollowRect(int totrows,int totcols){
        for(int i=1;i<=totrows;i++){
            System.out.println();
            for(int j=1;j<=totcols;j++){
                if(i==1 || j==1 || i==totrows || j==totcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        }
    }
    public static void main(String args[]){
        HollowRect(13,21);

    }

}