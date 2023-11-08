public class BitOperationsSetClearGet {

    public static int getithbit(int n, int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setithbit(int n, int i){
        int bitmask=1<<i;
        return (bitmask | n);
    }
    
    public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return (bitmask&n);
    }

    public static int updateithbit(int n,int i,int j){
        if(j==0){
            return clearithbit(n,i);
        }

        
        else {
            return setithbit(n,i);
        }
    }

    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)==0){
                n=n>>1;
            }
            else if((n&1)==1){
                count++;
                n=n>>1;
            }
        }
        return count;
    }


    public static int FastExponentiation(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans= ans * a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(countsetbits(16));

    }


}
