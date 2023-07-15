class LibraryMember{
	String memberID;
	String name;
	
	public LibraryMember(String memberID,String name){
		this.memberID=memberID;
		this.name=name;
	}
	
	public void setMemberId(String memberId){
		this.memberID=memberID;
	}
	public String getMemberId(){
		return memberID;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void displayMemberDetails(){
		System.out.println("Member ID :"+memberID);
		System.out.println("Name :"+name);
		System.out.println(" ");
	}
}