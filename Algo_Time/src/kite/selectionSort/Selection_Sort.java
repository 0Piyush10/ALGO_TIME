package kite.selectionSort;
//  Piyushraj Singh
public class Selection_Sort {
	     static void selection_Sort(int arr[]) {
			
			int array_Length=arr.length;
			for(int i=0;i<array_Length-1;i++) {
				int min_Index=i;
				for(int j=i+1;j<array_Length;j++) {
	                  if(arr[j]<arr[min_Index]) {
	                	   min_Index=j;  
	                    }
	                  }
				
				int temp=arr[min_Index];
				arr[min_Index]=arr[i];
				arr[i]=temp;
			}
		}
	
	static {
		int arr[]= {12,45,77989,7878,3};
		selection_Sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {}
}
