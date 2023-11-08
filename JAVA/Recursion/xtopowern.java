package Recursion;
public class xtopowern {

    public static void main(String args[]){
        System.out.println(xraisedton(5,2));

    }
    
    public static int xraisedton(int x,int n){
        
        
        if(n<=1){
            return x;

        }
        else{
            x= x* xraisedton(x,n-1);
        }

        return x;

        
        
    }
}
