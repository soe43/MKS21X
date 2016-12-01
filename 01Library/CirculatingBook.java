public class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;

    public CirculatingBook(String title,String author,String isbn,String callNumber){
	super(title,author,isbn,callNumber);
	currentHolder = null;
	dueDate = null;
}

    public String getHolder(){
	return currentHolder;
    }

    public String getDue(){
	return dueDate;
    }

    private void setHolder(String newHolder){
	currentHolder = newHolder;
    }

    private void setDue(String newDue){
	dueDate = newDue;
    }

    public void checkout(String patron, String due){
	setHolder(patron);
	setDue(due);
    }

    public void returned(){
	setHolder(null);
	setDue(null);
    }

    public String circulationStatus(){
	if(currentHolder != null){
	return "Checked out to: "+currentHolder+"\nDue: "+dueDate;
	}
	else{
	    return "Book on the shelves.";
	}
    }

    public String toString(){
	return getTitle()+"\nBy: "+getAuthor()+"\nISBN: "+getISBN()+"\nCall Number: "+getCallNumber()+"\nCirculation Status: "+circulationStatus();
    }
    
}
