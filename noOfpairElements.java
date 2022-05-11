import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    int count=1;
	    int p=0;
	    
	     for(int i=0;i<n-1;i++){
	         
	        
	        if(a[i]==a[i+1])
	            count++;
	        
	        else
	         {
	             p=p+(count/2);
	             
	             count=1;
	         }
	        
	     if(i==n-2){
	         p=p+(count/2);
	        
	     }
	     }
	 
	   System.out.println(p);
	    	
	     }
	}