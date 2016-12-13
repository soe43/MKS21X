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
	int least = data[0];
	for(int nextSlot = 0;nextSlot < data.length - 1;nextSlot++){
	for(int compare = 1;compare < data.length - 1;compare++){
	    if(data[i] < least){
	        least = data[i];
	    }
	    if(i = data.length){
		
	    }
	}
    }
		
    }

    public static void main(String[]args){
	int[] yo = new int[] {64, 25, 12, 22, 11};
	selectionSort(yo);
	System.out.println(Arrays.toString(yo));
    }
    
}
