package questions;

public class Q2 {
	
	
	public static void main(String[] args) {
		
		
	//	int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}; -> second input
				
	//int K = 3;
		
		int arr[]= {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		int K=4;
		
		contigouos_Array(arr,K);
			
	}
	
	public static void contigouos_Array(int arr[], int k) {
		
		for(int i=0;(i+k)<=arr.length;i++) {
			int number=arr[i];
			for(int j=i;j<(i+k);j++) {
				if(number<arr[j]) {
					number=arr[j];
				}			
			}
			System.out.println(number);
			
		}
		
	}
	
	

}
