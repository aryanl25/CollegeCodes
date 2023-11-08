package JavaBasics;
import java.util.*;
public class printprime {
     public static boolean isPrime(int n){
        boolean isPrime=true;
        if(n==2){
            return true;
        }
        if(n<0 || n==1){
            return false;
        }
        
        for(int i=2;i<=(int)(Math.sqrt(n));i++){
            if(n%i==0){
                isPrime=false;
            }
            else{
                continue;
            }
        }
        return isPrime;
    }

    public static void printPr(int x,int y){
        for(int i=x;i<=y;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
        }

    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER RANGE OF PRIME NOS TO PRINT");
        int a=sc.nextInt(); 
        int b=sc.nextInt();
        printPr(a,b);
        sc.close();
        


    }
    
}
