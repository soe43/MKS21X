abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    public LibraryBook(String title,String author,String isbn,String callNumber){
	this.setTitle(title);
	this.setAuthor(author);
	this.setISBN(isbn);
	this.callNumber = callNumber;
    }

    public void setCallNumber(String newCallNumber){
	callNumber = newCallNumber;
    }

    public String getCallNumber(){
	return callNumber;
    }

    public abstract void checkout(String patron, String due);

    public abstract void returned();

    public abstract String circulationStatus();

    public int compareTo(LibraryBook o){
	return (this.getCallNumber()).compareTo(o.getCallNumber());
    }

    public String toString(){
	return getTitle()+"\nBy: "+getAuthor()+"\nISBN: "+getISBN()+"\nCall Number: "+getCallNumber()+"\nCirculation Status: "+circulationStatus();
    }
}
