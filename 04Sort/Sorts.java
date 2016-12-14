import java.util.Arrays;
public class Sorts{
    /**EDIT THIS METHOD TO MATCH YOUR NAME 
     */
    public static String name(){
	return "06.Soe.William"; 
    }
    
    /**Selection sort of an int array. 
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void selectionSort(int[] data){  
	for (int i = 0; i < data.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < data.length; j++)
                if (data[j] < data[index])
                    index = j;
		
	       
            int smallerNumber = data[index]; 
            data[index] = data[i];
            data[i] = smallerNumber;
        }
    }
		
    

    public static void main(String[]args){
	int[] yo = new int[] {64, 25, 12, 22, 11};
	selectionSort(yo);
	System.out.println(Arrays.toString(yo));
    }
    
}
