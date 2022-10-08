import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Elements");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Array Before Sorting");
		System.out.println(Arrays.toString(arr));
		MergeSort ms=new MergeSort();
		ms.sort(arr,0,size-1);
		System.out.println("Array After Sorting");
		System.out.println(Arrays.toString(arr));
		
		int midElement=size/2;  //these many rotations
		
		ArrayRotation ar=new ArrayRotation();
		ar.rotate(arr,midElement);
		
		System.out.println("Array After Rotation");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter Element to Search");
		int s=sc.nextInt();  //s=20
		
		BinarySearch bs=new BinarySearch();
		int index=bs.search(arr,arr.length-1,s);
		if(index==-1)
			System.out.println("NOT FOUND");
		else
			System.out.println(" FOUND AT INDEX "+index);
				
		
	}
}
