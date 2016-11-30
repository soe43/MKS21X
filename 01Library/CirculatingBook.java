public class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;

    public CirculatingBook(String title,String author,String isbn,String callNumber){
	this.setTitle(title);
	this.setAuthor(author);
	this.setISBN(isbn);
	this.setCallNumber(callNumber);
	currentHolder = null;
	dueDate = null;
}
}
