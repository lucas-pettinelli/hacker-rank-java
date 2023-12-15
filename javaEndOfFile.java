import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (scan.hasNextLine()) {
            count++;
            String string =  scan.nextLine();
            System.out.println(count + " " + string);
        }
        scan.close();
    }
  
}
