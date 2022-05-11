import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^a[i];
        }
        int cnt=0;
        while(xor!=0){
            if((xor&1)!=0){
                break;
            }
            cnt++;
            xor=xor>>1;
        }
        int xor1=0,xor2=0;
        for(int i=0;i<n;i++){
            if((a[i]&(1<<cnt))!=0)
            xor1=xor1^a[i];
            else
            xor2=xor2^a[i];
        }
        System.out.println(xor1);
        System.out.println(xor2);
    }
}
        //Every integer appears twice,two integers apperas once.we have to prine those two unique integers...