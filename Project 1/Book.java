class Book extends Libraryitem{
	
	private String author;
	private int numPages;
	
	
	public Book(String title,String itemID,String author,int numPages){
		
		super(title,itemID);
		this.author = author;
		this.numPages = numPages;
		
	}
	
	public String author(){
		
		return author;
	}
	public int numPages(){
		
		return numPages;
		
	}
	
	public String  displayItemDetails(){
		
		return    super.displayItemDetails() + "\n" + "Author: " + author + "\n" + "number of pages: " + numPages;
		
	}
	
}