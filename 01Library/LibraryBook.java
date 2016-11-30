abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    public LibraryBook(String title,String author,String isbn,String callNumber){
	this.setTitle(title);
	this.setAuthor(author);
	this.setISBN(isbn);
	this.callNumber = callNumber;
    }

    public setCallNumber(String newCallNumber){
	callNumber = newCallNumber;
    }

    public getCallNumber(){
	return callNumber;
    }

    abstract void checkout(String patron, String due){}

    abstract void return(){}

    abstract String circulationStatus(){}

    public int compareTo(LibraryBook o){
	return (this.getCallNumber).compareTo(o.getCallNumber);
    }

    public String toString(){
	return title+"\nBy: "+author+"\nISBN: "+isbn+"\nCall Number: "+callNumber+"\nCirculation Status: "+circulationStatus();
    }
}
