import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            loop(a, b, n);
        }
    }
    
    static void loop(int a, int b, int n) {
        int sum = a;
        for (int x = 0; x < n; x++) {
            sum += b * (1<<x);
            System.out.print(sum + " ");
        }
        System.out.println();
    }
}
