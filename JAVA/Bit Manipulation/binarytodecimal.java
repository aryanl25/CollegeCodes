
public class binarytodecimal {
    
    public static void b2d(int binnum){
        int power=0;
        int decnum=0;
        while(binnum>0){
            int lastdig;
            lastdig=binnum%10;
            binnum=(int)(binnum/10);
            decnum+=lastdig*Math.pow(2,power);
            power++;
            
        }
        System.out.println(decnum);


    }
    public static void main(String args[]){

        b2d(111);
    }
    
}
