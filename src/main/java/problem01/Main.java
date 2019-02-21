package problem01;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
	
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		int min1 = 0, min2 = 0, max1 = 0 , max2 = 0, max=0;
		int check=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				
				if(min1 > arr[i] || min2 > arr[i]) {
					if(min1>=min2) {
						min1=arr[i];
					}
					else
						min2=arr[i];
					if(max < min1*min2) {
						max = min1*min2;
						check=0;
					}
					continue;
				}
				
			}
			if(arr[i]>0) {
				if(max1 < arr[i] || max2 < arr[i]) {
					if(max1<=max2) {
						max1=arr[i];
					}
					else
						max2=arr[i];
					if(max < max1*max2) {
						max = max1*max2;
						check=1;
					}
						
					continue;
				}
				
			}
			
		}
		
		if(check == 0) {
			System.out.println("[" + min1 + "," + min2 + "]");
		}
		else
			System.out.println("[" + max1 + "," + max2 + "]");
	}
}
