abstract class Libraryitem{
	
	private String title;
	private String itemID;
	public boolean checkOut;
	
	public Libraryitem(){
		
	}
	
	public Libraryitem(String title,String itemID){
		
		this.title = title;
		this.itemID = itemID;
		this.checkOut = false;
	}
	
	public void settitle(String title){
		this.title = title;
		
	}
	public void setitemID(String itemID){
		
		this.itemID = itemID;
	}
	
	public String gettitle(){
		return title;
	}
	public String getitemID(){
		return itemID;
	}
	
	
	public void checkOut(){
		checkOut = true;
		System.out.println("ok byeee! you are checked");
	}
	
	
	public void checkin(){
		checkOut = false;
		System.out.println("Welcome sir you are checked come in to our library! ");
	}
	
	public String  displayItemDetails(){
		return "title: " + title + "\n" + "itemID: " + itemID;
	}
		
		
		
	}
	
	
	
