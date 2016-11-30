public class Book{
    private String title;
    private String author;
    private String isbn;

    public Book(){}

    public Book(String title,String author,String isbn){
	this.title = title;
	this.author = author;
	this.isbn = isbn;
    }

    public void setTitle(String newTitle){
	title = newTitle;
    }

    public void setAuthor(String newAuthor){
	author = newAuthor;
    }

    public void setISBN(String newISBN){
	isbn = newISBN;
    }

    public String getTitle(){
	return title;
    }

    public String getAuthor(){
	return author;
    }

    public String getISBN(){
	return isbn;
    }

    public String toString(){
	return title+"\nBy: "+author+"\nISBN: "+isbn;
    }
}    
