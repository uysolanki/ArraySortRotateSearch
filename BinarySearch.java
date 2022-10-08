
public class BinarySearch {

	public int search(int[] arr, int right, int s) {
		// TODO Auto-generated method stub
		int pivot=right/2;
		if(arr[pivot]==s)
				return pivot;
		else if(s>=arr[0])
			return modifysearch(arr,0,pivot-1,s);
		else
			return modifysearch(arr,pivot+1,right,s);
			
	}

	private int modifysearch(int[] arr, int left, int right, int s) {
		if(left>right)
			return -1;
		
		int mid=(left+right)/2;
		
			if(s==arr[mid])
				return mid;
			else if(s>arr[mid])
				return modifysearch(arr, (mid+1), right, s);
			else
				return modifysearch(arr,  left, (mid-1), s);
	}

}
