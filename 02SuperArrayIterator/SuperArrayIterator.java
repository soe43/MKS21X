import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String>{
    private int currentIndex;
    
    public SuperArrayIterator(){
	currentIndex = 0;
    }

    public boolean hasNext(){
	return (currentIndex < size()) && (next() != null);
    }
	
    public String next(){
	currentIndex++;
	return data[currentIndex - 1];
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }
}
