package Java.Practiceleet;
import java.util.*;

public class insertion {
    public static void main(String[] args) {
       int[] arr = {5,1,-2,4,0};
       for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j>0;j--){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
       }
       System.out.println(Arrays.toString(arr));
    }
    
}