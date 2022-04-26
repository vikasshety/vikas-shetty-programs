package com;

public class program4 {
	public static void main(String[] args) 
	{
		System.out.print("{");
		int[] arr1={1,2,3,4,5,6,7,8,9};
		for (int i=0;i<=arr1.length-1;i++)
		{
			int Count=0;
			int[] arr2={1,2,8,9,12,46,76,82,15,20,30};
			for (int j=0;j<=arr2.length-1;j++){	
				if(arr2[j]%arr1[i]==0){
					Count++;
				}
			}
			System.out.print(arr1[i]+":"+Count);
			if(i<(arr1.length)-1)
			{
				System.out.print(", ");
			}
		}
		System.out.println("}");	
	}
}
