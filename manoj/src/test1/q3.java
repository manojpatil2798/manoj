package test1;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t--!=0){
		        int n=sc.nextInt();
		        int []a=new int[n];
		        
		        for(int i=0;i<n;i++){
		            a[i]=sc.nextInt();
		        }
		        int leftcount=0;
		        int rightcount=0;
		        
		        for(int i=0;i<n/2;i++){
		            if(a[i+1]-a[i]==1 && a[0]==1){
		                leftcount++;
		            }
		        }
		        for(int i=n/2;i<n-1;i++){
		            if(a[i]-a[i+1]==1){
		                rightcount++;
		            }
		        }
		        if(leftcount==n/2 && rightcount==n/2){
		            System.out.println("yes");
		        }
		        else{
		            System.out.println("no");
		        }
		    }

	}

}
