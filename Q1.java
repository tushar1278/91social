package questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	
	public static int input_Time()
	{
		
		Scanner input= new Scanner(System.in);
		Scanner input1= new Scanner(System.in);
		
		
		System.out.println("Enter Total Number of Trains\n"); 
		
		int a= input.nextInt();
		int[] arrival=new int[a];
		int[] dep= new int[a];
		for(int i=0;i<a;i++) {
		System.out.println("Enter Arrival in HHMM\n");
		arrival[i]=input1.nextInt();
		System.out.println("Enter Departure in HHMM\n");
		dep[i]=input1.nextInt();
			
		}
		Arrays.sort(arrival);
		Arrays.sort(dep);
		
		int p_no=platforms(arrival,dep);
		return p_no;
		
		
	}
	
	public static int platforms(int[] arrival, int[] dep)
	{
		int trains=arrival.length;
		int plat_no=0;
		int pneed=0;
		int j=0;
		for(int i=0;i<trains;)
		{
			{
				if(arrival[i]<=dep[j])
				{
					
						plat_no++;
					i++;					
				}else
				{
					plat_no--;
					j++;
				}				
			}	
			if(plat_no>pneed) {
				pneed=plat_no;
			}
		}		
		return pneed
				;		
	}
	
	public static void main(String[] args) {
		
		
		int p_no=input_Time();
		
		
		System.out.println("Max Number of Platforms required are:"+p_no);
	}

	
	
	
}
