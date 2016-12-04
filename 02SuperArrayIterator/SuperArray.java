import java.util.Iterator;

public class SuperArray implements Iterable<String>{
    private String[] data;
    private int size;

    public SuperArray(){
	data = new String[10];
	size = 0;
    }
    
    public SuperArray(int capacity){
	if(capacity < 0){
	    throw new IllegalArgumentException();
	}
	data = new String[capacity];
	size = 0;
    }

    public Iterator<String> iterator(){
	SuperArrayIterator It = new SuperArrayIterator();
	return It;
    }

    public int size(){
	return size;
    }

    public String[] data(){
	return data;
    }
    
    public boolean add(String n){
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
	String[] temp = new String[2 * size];
	for(int i = 0;i < size;i++){
	    temp[i] = data[i];
	}
	data = temp;
    }

    public void clear(){
	String[] temp = new String[size];
	data = temp;
    }

    public boolean isEmpty(){
	return(size == 0);
    }

    public String set(int index, String element){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	String ans = data[index];
	data[index] = element;
	return ans;  
    }
    
    
    public String get(int index){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	else{
	    return data[index];
	}
    }
    
    public void add(int index, String element){
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

    public String remove(int index){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	String x = data[index];
	for (int j = index; j < size; j++){
	    data[j] = data[j+1];
	}
	size--;
	return x;
    }

    public String[] toArray(){
	String[] temp = new String[size];
	for(int i = 0;i < size;i++){
	    temp[i] = data[i];
	}
	return temp;
    }

    public int indexOf(String i){
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

    public int lastIndexOf(String i){
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
		
