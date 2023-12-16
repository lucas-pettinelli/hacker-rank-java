import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static boolean flag;
    static int B, H;
    
    static{
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        if(B > 0 && H > 0){
            flag=true;
        }else{
                System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        scan.close();
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}
