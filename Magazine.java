class Magazine extends LibraryItem{
	String issueDate;
	String Publisher;
	
	public Magazine(String title,String itemID,String issueDate,String Publisher,boolean check){
		super(title,itemID,check);
		this.issueDate=issueDate;
		this.Publisher=Publisher;
	}
	public void displayItemDetails(){
		System.out.println("Itemid :"+itemID);
		System.out.println("Title :"+title);
		System.out.println("issue Date :"+issueDate);
		System.out.println("Publisher :"+Publisher);
		System.out.println("Availbility :"+getCheck());
		System.out.println(" ");
	}
}