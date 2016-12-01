public class ReferenceBook extends LibraryBook{
    private String collection;

    public ReferenceBook(String author,String title,String isbn, String callNumber,String collection){
	super(author,title,isbn,callNumber);
	this.collection = collection;
    }


public String getCollection(){
    return collection;
}

public void setCollection(String collection){
    this.collection = collection;
}

public void checkout(String patron, String due){
    System.out.println("Cannot check out reference book.");
}

public void returned(){
    System.out.println("Reference book could not have been checked out-return impossible.");
}

public String circulationStatus(){
    return "Non-circulating reference book.";
}

 public String toString(){
	return getTitle()+"\nBy: "+getAuthor()+"\nISBN: "+getISBN()+"\nCall Number: "+getCallNumber()+"\nCollection: "+collection+"\nCirculation Status: "+circulationStatus();
    }
}

