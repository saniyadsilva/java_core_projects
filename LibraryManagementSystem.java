package core;

class Book {
	String title;
	String author;
	String ISBN;

	void displayDetails(String t, String a, String i) {
		title = t;
		author = a;
		ISBN = i;
		System.out.println("Title is " + t + ", Author name is " + author + " and ISBN is " + i);
	}
}

class Fiction extends Book {
	String genre;

	@Override
	void displayDetails(String t, String a, String i) {
		title = t;
		author = a;
		ISBN = i;
		System.out
				.println("Title is " + t + ", Author name is " + author + ", ISBN is " + i + " and Genre is " + genre);
	}
}

class NonFiction extends Book {
	String subject;

	@Override
	void displayDetails(String t, String a, String i) {
		title = t;
		author = a;
		ISBN = i;
		System.out.println(
				"Title is " + t + ", Author name is " + author + ", ISBN is " + i + " and Subject is " + subject);
	}
}

public class LibraryManagementSystem {
	public static void main(String[] args) {
		Fiction b1 = new Fiction();
		b1.genre = "Fantasy";
		NonFiction b2 = new NonFiction();
		b1.displayDetails("Harry Potter", "J. K. Rowling", "345a");
		b2.subject = "Maths";
		b2.displayDetails("Mathematics", "Unknown", "775b");

	}
}
