

//Selection sort
//Idea from triangle print


import java.util.*;
public class prob4{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                
                 int[] arr = {4,3,6,2,8};
                 selection(arr,arr.length-1,0,0);
                 System.out.println(Arrays.toString(arr));
          }
        public static void selection(int [] arr,int r,int c ,int max ){
            if(r==0){
                return;
            }
            if(c<r){
                if(arr[c]>arr[max])
                {
                    selection(arr,r,c+1,c);
                }
                else{
                   selection(arr,r,c+1,max);
                }
                

            }
            else{
                int temp = arr[r-1];
                arr[r-1] = arr[max];
                arr[max] = temp;
                selection(arr,r-1,0,0);
        }
}
}