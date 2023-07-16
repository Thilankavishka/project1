class LibraryMember {
	
	private String memberID;
	private String name;
	
	public String memberID(){
		
		return memberID;
	}
	public String name(){
		
		return name;
	}
	
	public LibraryMember(String memberID,String name){
		this.memberID = memberID;
		this.name = name;
	}
	
	public String displayMemberDetails(){
		
		return "member ID: " + memberID + "\n" + "name: " + name;
		
	}
	
}