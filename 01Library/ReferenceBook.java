public class ReferenceBook extends LibraryBook{
    private String collection;

    public ReferenceBook(String title,String author,String isbn, String callNumber,String collection){
	this.setTitle(title);
	this.setAuthor(author);
	this.setISBN(isbn);
	this.setCallNumber(callNumber);
	this.collection = collection;
    }


public String getCollection(){
    return collection;
}

public void setCollection(String collection){
    this.collection = collection;
}

public void checkout(String patron, String due){
    throw new UnsupportedOperationException();
}

public void returned(){
    throw new UnsupportedOperationException();
}

public String circulationStatus(){
    return "Non-circulating reference book.";
}

 public String toString(){
	return getTitle()+"\nBy: "+getAuthor()+"\nISBN: "+getISBN()+"\nCall Number: "+getCallNumber()+"\nCollection: "+collection+"\nCirculation Status: "+circulationStatus();
    }
}

