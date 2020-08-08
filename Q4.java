package questions;

import java.util.Arrays;

public class Q4 {
	
	public static void main(String[] args) {
		
		
		//	int arr[] = {1, 2, 2, 2, 3, 4, 5, 4, 7, 6, 5, 12}; ->second input
					
		//int K = 70;
			
			int arr[]= {2, 3, 1, 5, 6, 3, 7, 9, 14, 10, 2, 5};
			int K=35;
			Arrays.sort(arr);
			small_Sub(arr,K);
				
		}
	
	public static void small_Sub(int arr[],int k) {
		int sum=0;
		int count=0;
		String checker="no";
		for(int i=arr.length-1;i>0;i--) {	
			sum=sum+arr[i];
			count++;
			if(sum>=k) {
				checker="yes";
				break;
			}


			
		}
		if(checker.equalsIgnoreCase("yes")) {
		System.out.println(count);
		System.out.println("Smallest subsequence with the sum greater than or equal to the given sum K is"+Arrays.toString(Arrays.copyOfRange(arr, arr.length-count, arr.length)));
		}else {
			System.out.println("1");
			System.out.println("Smallest subsequence with the sum greater than or equal to the given sum K is not possible");
		}
		
	}

}
