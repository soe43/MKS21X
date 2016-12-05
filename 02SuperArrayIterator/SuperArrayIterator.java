import java.util.Iterator;
import java.util.NoSuchElementException;

public class SuperArrayIterator implements Iterator<String>{
    private SuperArray thisOne;
    private int currentIndex;
    
    public SuperArrayIterator(SuperArray ThisOne){
	thisOne = ThisOne;
	currentIndex = 0;
    }

    public boolean hasNext(){
	return thisOne.size() - 1 > currentIndex;
    }
	
    public String next(){
	if(hasNext()){
	    currentIndex++;
	    return thisOne.get(currentIndex - 1);
	}
	else{
	    throw new NoSuchElementException();
	}
    }
    
    public void remove(){
	throw new UnsupportedOperationException();
    }
}
