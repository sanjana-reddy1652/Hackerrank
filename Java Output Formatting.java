//Java Output Formatting
/* 

Sample Input
java 100
cpp 65
python 50

Sample Output

================================
java           100 
cpp            065 
python         050 
================================

*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x);//%-15s = 15 spaces %03d = padding with 0 %n = new line
            }
            System.out.println("================================");

    }
}

