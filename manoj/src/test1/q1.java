package test1;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		String s=sc.nextLine();
		for (int i = 0; i < n; i++) 
	{
			String s=sc.next();
			int ia[]=new int[128];
			char ca[]=new char[128];
			for (int j = 0; j < s.length(); j++)
			{
				ia[s.charAt(j)]=0;
				
				int cnt=0;
				for (int k = 0; k < s.length(); k++) 
				{
					if(s.charAt(k)==s.charAt(j) && ia[s.charAt(j)]==0)
						cnt++;
				}
				ia[s.charAt(j)]=cnt;
				ca[s.charAt(j)]=s.charAt(j);
			}
		int arrcnt=0;
			for (int j = 0; j < ia.length; j++) 
			{
				if(ia[j]>0)
					arrcnt++;
			}
			System.out.println(arrcnt);
			char ac[]=new char[arrcnt];
			int index=0;
			for (int k = 0; k < s.length(); k++) 
			{
				int rank=0;
				for (int j = 0; j < k; j++) 
				{
					if(s.charAt(k)==s.charAt(j))
						rank++;
				}
				if(rank==0)
					ac[index++]=s.charAt(k);
			}
			int ic[]=new int[arrcnt];
			int index1=0;
			for (int k = 0; k < ia.length; k++) 
			{
				if(ia[k]>0)
					ic[index1++]=ia[k];
			}

			for (int k = 0; k < ic.length; k++) 
			{
				for (int j = k+1; j < ic.length; j++) 
				{
					if(ic[k]>ic[j])
					{
						int temp=ic[k];
						ic[k]=ic[j];
						ic[j]=temp;
						
						char temp1=ac[k];
						ac[k]=ac[j];
						ac[j]=temp1;
						
					}
				}
			}
			System.out.println(Arrays.toString(ac));
			System.out.println(Arrays.toString(ic));
			int cnt1=ic[0];
			int cnt2=ic[1];
			int total=0;
			for (int k = 2; k < ic.length; k++)
			{
				total=cnt1+cnt2;
				cnt1=cnt2;
				cnt2=total;
			}
			if(total==ic[ic.length-1])
				System.out.println("Dynamic");
			else
				System.out.println("Not");
		}
	}
}
