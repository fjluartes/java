import java.util.Arrays;

public class heapAlgo {
    public static void perm(int[] list, int n){
        if(n == 1) {
            System.out.println(Arrays.toString(list));
        } else {
            for(int i=0; i<n; i++) {
                perm(list,n-1);

                int j = ( n % 2 == 0 ) ? i : 0; 

                int t = list[n-1];              
                list[n-1] = list[j];
                list[j] = t;                
            }
        }
    }


    public static void main(String[] args) {

        int[] list = new int[]{1,2,3}; 
        perm(list, list.length);

    }
}

