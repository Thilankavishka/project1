class Magazine extends Libraryitem{
	
	private String Libraryitem;
	private String publisher;
	
	
	public Magazine(String title,String itemID,String Libraryitem,String publisher){
		
		super(title,itemID);
		this.Libraryitem = Libraryitem;
		this.publisher = publisher;
		
	}
	public String Libraryitem(){
		
		return Libraryitem;
		
	}
	public String publisher(){
		
		return publisher;
	}
	
	/*overide*/
	
	public String displayItemDetails(){
		return super.displayItemDetails() +"\n"+ "issue data: " + Libraryitem + "\n"+ "publisher" + publisher;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}