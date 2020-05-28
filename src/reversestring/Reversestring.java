
package reversestring;

import java.util.Scanner;

public class Reversestring {

    public static void main(String[] args) {
       Scanner sn=new Scanner (System.in);
       String name;
       String m="";
        System.out.println("ENTER THE STRING TO BE REVERSED");
       name=sn.nextLine();
       int len;
       len=name.length();
       for(int i=len-1;i>=0;i--)
       {
           m=m+name.charAt(i);
       }
           System.out.println(m);
    }
    
}
