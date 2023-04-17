public class MinimunArray{
        public static void main(String[] args){
        int[] minimum = {2,3,4,5,6,1,7,8,9,10};
        int[] min = {20,30,40,50,60,70,80,90,15,100};
        System.out.println("le minimum est : " + new MinimunArray().min(minimum));
        System.out.println("le minimum est : " + new MinimunArray().min(min));
    }
       
     public int min(int [] minimum){
        int min = minimum[0];
          for(int i = 0; i<minimum.length; i++){
             if(minimum[i]< min) min = minimum[i];
          }  
          return min;
     }
}
