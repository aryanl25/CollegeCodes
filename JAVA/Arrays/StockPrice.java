package Arrays;
public class StockPrice {
    public static void main(String args[]){
        int stock[]={7,1,5,3,6,4};
        StockCheck(stock);

    }

    public static int StockCheck(int stock[]){
        int n=stock.length;
        int prft=0;
        int DayBuy=0;
        int DaySell=0;
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                int profit=0;
                profit=stock[j]-stock[i];
                if(profit>prft){
                    DayBuy=i+1;
                    DaySell=j+1;
                }
                prft=Math.max(profit,prft);
                
            }
        }
        System.out.println("Best time to buy stock is day "+DayBuy+" and best time to sell it is day "+DaySell+" with profit of: "+prft);
        if(prft>0){
            return prft;
        }
        else{
            return 0;
        }
    }
    
}
/*
 * optimized code for StockCheck(){
 *  int buyprice=Integer.MAX_VALUE;
 *  int maxprofit=0;
 *  for(int i=0;i<stock.length;i++){
 *      if(buyprice<stock[i]){
 *      int profit=stock[i]-buyprice;
 *      maxprofit=Math.max(maxprofit,profit):
 *          }
 *      else{
 *      buyprice=stock[i];    
 *      }
 *  return maxprofit;
 * }
 * 
 * }
 */
