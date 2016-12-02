import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String>{
    private int currentIndex = 0;
    
    public SuperArrayIterator(){}

    public boolean hasNext(){
	return (currentIndex < size()) && (next() != null);
    }
	
    public String next(){
	currentIndex++;
	return this.get(currentIndex - 1);
    }


    public void remove(){
	throw new UnsupportedOperationException();
    }

}
