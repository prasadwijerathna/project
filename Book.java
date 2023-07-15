class Book extends LibraryItem{
	String author;
	int numPages;
	
	public Book(String title,String itemID,String author,int numPages,boolean check){
		super(title,itemID,check);
		this.author=author;
		this.numPages=numPages;
		checkOut();
		checkIn();
		getCheck();
		
	}
	public void displayItemDetails(){
		System.out.println("Itemid :"+itemID);
		System.out.println("Title :"+title);
		System.out.println("Author :"+author);
		System.out.println("Number Of Pages :"+numPages);
		System.out.println("Availbility :"+getCheck());
		System.out.println(" ");
		
	}
}