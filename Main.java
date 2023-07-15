public class Main{
	public static void main(String args[]){
		Book B1=new Book("The catcher in the rye","B001","J.D.Salinger",240,true);
		Book B2=new Book("To kill a Mockinbird","B002","Harpages",281,true);
		Book B3=new Book("1998","B003","George orwell",328,true);
		Book B4=new Book("Pride and Perjudice","B004","Jane Austen",432,true);
		Book B5=new Book("The Hobbit","B005","J.R.R.Tolkien",320,true);
		
		Magazine M1=new Magazine("National Geographic","M001","Agust 2023","National Geographic Society",true);
		Magazine M2=new Magazine("Time","M002","september 2023","Time USA,LLC",true);
		Magazine M3=new Magazine("Forbes","M003","june 2023","Frobes Media",true);
		Magazine M4=new Magazine("Vogue","M004","july 2023","conde nast",true);
		Magazine M5=new Magazine("Sports illustrated","M005","july 2023","Maven Coalition",true);
		
		LibraryMember L1=new LibraryMember("L001","John Doe");
		LibraryMember L2=new LibraryMember("L002","Jane Smith");
		LibraryMember L3=new LibraryMember("L003","David Johnson");
		LibraryMember L4=new LibraryMember("L004","Sarah Williams");
		LibraryMember L5=new LibraryMember("L005","Michael Brown");
		
		B1.checkOut();
		B1.displayItemDetails();
		B1.checkIn();
		B1.displayItemDetails();
		
		M1.checkOut();
		M1.displayItemDetails();
		M1.checkIn();
		M1.displayItemDetails();
		
		B1.displayItemDetails();
		B2.displayItemDetails();
		B3.displayItemDetails();
		B4.displayItemDetails();
		B5.displayItemDetails();
		
		M1.displayItemDetails();
		M2.displayItemDetails();
		M3.displayItemDetails();
		M4.displayItemDetails();
		M5.displayItemDetails();
		
		L1.displayMemberDetails();
		L2.displayMemberDetails();
		L3.displayMemberDetails();
		L4.displayMemberDetails();
		L5.displayMemberDetails();
		
		
		
	}
}