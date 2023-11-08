package Strings;

public class Strings {
    

    public static void main(String args[]){
    
    String path= "aabbqqcc";
    System.out.println(compress(path));
    

    }

    public static String compress(String str){
        String newstr="";
        

        // for(int i=1;i<str.length();i++){
        //     Integer count=1;
        //     while(){

        //         if(count==1 && str.charAt(i-1)!=str.charAt(i)){
        //             newstr+=str.charAt(i-1)+count.toString();
        //         }
        //     }
        // }

        return newstr;
    }




    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir=='N'){
            y++;
            }
            if(dir=='S'){
            y--;
            }
            if(dir=='E'){
            x++;
            }
            if(dir=='W'){
            x--;
            }

        }
        return (float)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
}