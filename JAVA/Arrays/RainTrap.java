package Arrays;

public class RainTrap {
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        TrapWater(height);

    }

    public static void TrapWater(int height[]){
        int n= height.length;

        int leftmax[]= new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        
        }


        int rightmax[]= new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }


        int traprain[]= new int[n];
        for(int i=0;i<n;i++){
            traprain[i]=Math.min(rightmax[i],leftmax[i])-height[i];
        }

        int totalrain = 0;
        for(int i=0;i<n;i++){
            totalrain+=traprain[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(traprain[i]+" ");
        }
        System.out.println();
        System.out.println("The total rainwater trapped is: "+totalrain);






    }
    
}
