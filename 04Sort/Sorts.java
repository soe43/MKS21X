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
	
    /**Insertion sort of an int array.
     *Upon completion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void insertionSort(int[] data){
	int temp;
	for(int i = 1;i < data.length;i++){
	    for(int k = i; k > 0;k--){
		if(data[k] < data[k-1]){
		    temp = data[k];
		    data[k] = data[k-1];
		    data[k-1] = temp;
		}
	    }
	}
    }

    /**Bubble sort of an int array.
     *Upon commpletion, the elements of the array will be in increasing order.
     *@param data  the elements to be sorted.
     */
    public static void bubbleSort(int[] data){
	

	for(int i = 0; i < data.length-1;i++){
	    int counter = 0;
	    if(data[i] > data[i+1]){
		counter++;
		int temp = data[i];
		data[i] = data[i+1];
		data[i+1] = temp;
	    }
	}
	    if(counter == 0){
		return;
	    }
	    else{
		counter = 0;
	    }
    }

    public static void main(String[]args){
	name();
	int[] yo = new int[] {64, 25, 12, 22, 11};
	int[] bo = new int[] {32, 456, 34, 81, 13, 123};
	int[] bub = new int[] {123, 1234, 12347, 1231, 301, 54, 15, 96};
	selectionSort(yo);
	System.out.println(Arrays.toString(yo));
	insertionSort(bo);
	System.out.println(Arrays.toString(bo));
	bubbleSort(bub);
	System.out.println(Arrays.toString(bub));

    }
    
}
