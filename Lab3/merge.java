import java.util.*;
public class merge{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int length = sc.nextInt();
		int array[] = new int[length];
			for(int i = 0; i < length; i++) {
				System.out.print("Enter elements of array : ");
				int element = sc.nextInt();
				array[i] = element;
			}
			System.out.println("Before sorting: ");
			for (int j=0;j<array.length;j++) {
				System.out.print(" "+array[j]);
			}

		merge obj = new merge();
		obj.merge(array);
		System.out.println();
		obj.printarray(array);
	}

	void merge(int array[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) 
            L[i] = array[l + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = array[m + 1 + j]; 
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                array[k] = L[i]; 
                i++; 
            } 
            else { 
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) { 
            array[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts array[l..r] using 
    // merge() 
    void sort(int array[], int l, int r) 
    { 
        if (l < r) { 
            // Find the middle point 
            int m = (l + r) / 2; 
  
            // Sort first and second halves 
            sort(array, l, m); 
            sort(array, m + 1, r); 
  
            // Merge the sorted halves 
            merge(array, l, m, r); 
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int array[]) 
    { 
        int n = array.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(array[i] + " "); 
        System.out.println(); 
    } 



}