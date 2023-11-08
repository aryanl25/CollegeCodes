package JavaBasics;



public class checkprime {
    
    public static boolean isPrime(int n){
        boolean isPrime=true;
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
    
    public static void main(String args[]){
        System.out.println(isPrime(12312387));


    }
        

    
}