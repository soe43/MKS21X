import java.util.Iterator;

public class SuperArrayIterator{
    private int[] data;
    private int size;

    
    public SuperArrayIterator(){
	data = new int[10];
	size = 0;
    }

    public SuperArrayIterator(int capacity){
	if(capacity < 0){
	    throw new IllegalArgumentException();
	}
	data = new int[capacity];
	size = 0;
    }

    public int size(){
	return size;
    }

    public boolean add(int n){
	if(size + 1 > data.length){
	    this.grow();
	}
	else{
	    data[size] = n;
	    size++;
	}
	return true;
    }

    public void grow(){
	int[] temp = new int[2 * size];
	for(int i = 0;i < size;i++){
	    temp[i] = data[i];
	}
	data = temp;
    }

    public void clear(){
	int[] temp = new int[size];
	data = temp;
    }

    public boolean isEmpty(){
	return(size == 0);
    }

    public int set(int index, int element){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	int ans = data[index];
	data[index] = element;
	return ans;  
}


    public int get(int index){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
    }
    else{
	return data[index];
    }
}

     public void add(int index, int element){
	 if(index < 0 || index > size()){
	     throw new IndexOutOfBoundsException();
	 }
	if (size >= data.length-1) {
	    grow();
      	}
	for (int j = size; j >= index; j--) {
	    data[j+1] = data[j];
	}
	data[index] = element;
	size++;
}		    

    public int remove(int index){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	int x = data[index];
	for (int j = index; j < size; j++){
	    data[j] = data[j+1];
	}
	size--;
	return x;
    }

    public int[] toArray(){
	int[] temp = new int[size];
	for(int i = 0;i < size;i++){
	    temp[i] = data[i];
	}
	return temp;
    }

    public int indexOf(int i){
	int x = 0;
	for(int j = 0;j < size;j++){
	    if(data[j] == i){
		x = j;
	    }
	    else{
		x = -1;
	    }
	}
	return x;
    }

    public int lastIndexOf(int i){
	int x = 0;
	for(int j = size;j > -1;j--){
	    if(data[j] == i){
		x = j;
	    }
	    else{
		x = -1;
	    }
	}
	return x;
    }
    
    public String toString(){
	String ans = "";
	if(size == 0){
	          ans ="[]";
	    }
	for(int i = 0;i < size;i++){
	    if(i == 0){
		  ans+="["+data[i]+",";
	    }
	    else if(i == size - 1){
		  ans+=" "+data[i]+"]";
	    }
	    else{
		  ans+=" "+data[i]+",";
	    }
	}
	return ans;
    }

    public String toStringDebug(){
	String ans = "";	
	for(int i = 0;i < data.length;i++){
	    if(i > size - 1){
		if(i == 0){
		    ans+="[ _,";
		}
		else if(i == data.length - 1){
		    ans+=" _]";
		}
		else{
		    ans+=" _,";
		}
	    }
	    else{
	    if(i == 0){
		  ans+="["+data[i]+",";
	    }
	    if(i == data.length - 1){
		ans +=" "+data[i]+"]";
	    }
	    else if(i > 0 && i < data.length){
		  ans+=" "+data[i]+",";
	    }
	    }
	}
	return ans;
    }
}
		
