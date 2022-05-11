import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //String a=Integer.toBinaryString(n);
       // System.out.println(a);
        int b[]=new int[n];
        int xor=0;
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            xor=xor^b[i];
        }
        //every integer occurs twice,one integer occurs only once,print that one integer
        System.out.println(xor);
    }
}