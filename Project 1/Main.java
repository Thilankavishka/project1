import java.util.*;

public class Main{
	
	public static void main(String args[]){
		
    Scanner ob = new Scanner(System.in);
	
	Book obj1 = new Book("The Catcher in the Rye ","B001","J.D. Salinger",240);
	Book obj2  = new Book("To Kill a Mockingbird","B002","Harper Lee",281);
    Book obj3 = new Book("1984","B003","George Orwell",328);
    Book obj4  = new Book("Pride and Prejudice","B004","Jane Austen",432);
    Book obj5 = new Book("The Hobbit","B005","J.R.R. Tolkien",320);	
	
	
	Magazine obj6 = new Magazine("National Geographic","M001","August 2023","National Geographic Society");
	Magazine obj7 = new Magazine("Time","M002","September 2023","Time USA LLC");
	Magazine obj8 = new Magazine("Forbes","M003","June 2023","Forbes Media");
	Magazine obj9 = new Magazine("Vogue","M004","M004","Condé Nast");
	Magazine obj10 = new Magazine("Sports Illustrated","M005","July 2023","July 2023");
	
	
	LibraryMember obj11 = new LibraryMember("L001","John Doe");
	LibraryMember obj12 = new LibraryMember("L002","Jane Smith");
	LibraryMember obj13 = new LibraryMember("L003","David Johnson");
	LibraryMember obj14 = new LibraryMember("L004","Sarah Williams");
	LibraryMember obj15 = new LibraryMember("L005","Michael Brown");
	
	
	System.out.println("If your coming in or out: ");
	String ans = ob.nextLine();
	
	if(ans.equals("out")){
	obj1.checkOut();
	}
	
	else if(ans.equals ("in")){
	obj1.checkin();
	
	
	
	System.out.println("................................Books...............................");
	
	obj6.displayItemDetails();
	
	Book books[] = new Book[5];
	
	
	books[0] = obj1;
	books[1] = obj2;
	books[2] = obj3;
	books[3] = obj4;
	books[4] = obj5;
	
	
	
	
	for(int i = 0; i < 5; i++) {
		
		System.out.println(books[i].displayItemDetails());
		
		System.out.println("");
		
	}
	System.out.println(".............................Magazines.............................");
	Magazine mag[] = new Magazine[5];
	mag[0] = obj6;
	mag[1] = obj7;
	mag[2] = obj8;
	mag[3] = obj9;
	mag[4] = obj10;
	
	for(int i = 0; i < 5; i++){
		
		System.out.println(mag[0].displayItemDetails());
		System.out.println("");
	}
	
	System.out.println(".............................LibraryMember.............................");
	
	
	LibraryMember[] lib = new LibraryMember[5];
	
	lib[0] = obj11;
	lib[1] = obj12;
	lib[2] = obj13;
	lib[3] = obj14;
	lib[4] = obj15;
	
	for(int i = 0; i < 5; i++){
		
		System.out.println(lib[i].displayMemberDetails());
		System.out.println("");
		
	}
	}
	
	}
	
	
}

/*output
1)first input out
If your coming in or out:
out
ok byeee! you are checked

2)second input in
If your coming in or out:
in
Welcome sir you are checked come in to our library! 

................................Books...............................
title: The Catcher in the Rye
itemID: B001
Author: J.D. Salinger
number of pages: 240

title: To Kill a Mockingbird
itemID: B002
Author: Harper Lee
number of pages: 281

title: 1984
itemID: B003
Author: George Orwell
number of pages: 328

title: Pride and Prejudice
itemID: B004
Author: Jane Austen
number of pages: 432

title: The Hobbit
itemID: B005
Author: J.R.R. Tolkien
number of pages: 320

.............................Magazines.............................
title: National Geographic
itemID: M001
issue data: August 2023
publisherNational Geographic Society

title: National Geographic
itemID: M001
issue data: August 2023
publisherNational Geographic Society

title: National Geographic
itemID: M001
issue data: August 2023
publisherNational Geographic Society

title: National Geographic
itemID: M001
issue data: August 2023
publisherNational Geographic Society

title: National Geographic
itemID: M001
issue data: August 2023
publisherNational Geographic Society

.............................LibraryMember.............................
member ID: L001
name: John Doe

member ID: L002
name: Jane Smith

member ID: L003
name: David Johnson

member ID: L004
name: Sarah Williams

member ID: L005
name: Michael Brown


*/