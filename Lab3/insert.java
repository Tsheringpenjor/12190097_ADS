import java.util.*;
public class insert{
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
			System.out.println("Befor sorting: ");
			for (int j=0;j<array.length;j++) {
				System.out.print(" "+array[j]);
			}
//----------------------------------------------------------
		
			// for(int i=0;i<array.length;i++)
   //      {
   //          int j = i;

   //          //i is not the first element
   //          while(j>0)
   //          {
   //              //not in order
   //              if(array[j-1] > array[j])
   //              {
   //                  //swapping
   //                  int temp = array[j-1];
   //                  array[j-1] = array[j];
   //                  array[j] = temp;
   //              }
   //              //in order
   //              else
   //              {
   //                  break;
   //              }
   //              j--;
   //          }
   //      }	
        

   //      for(int x : array)
   //      {
   //          System.out.print(" "+x);
   //      }
	//void swap(){

	}

    }

//}



	

		