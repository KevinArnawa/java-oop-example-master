import java.util.ArrayList;

abstract class Person {
  public String fullName;

  public Person(String fullName) {
    this.fullName = fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getFullName() {
    return fullName;
  }
}

abstract class LibraryMember extends Person {
  public String id;
  public ArrayList<Book> borrowedBooks = new ArrayList<Book>();

  public LibraryMember(String id, String fullName) {
    super(fullName);
    this.id = id;
  }

  public LibraryMember() {
    super("");
  }

  public abstract void receiveBook(Book book);

  public abstract void giveBook(Book book);

  public abstract Book getBookById(String id);
}

class Member extends LibraryMember {
  public String name;

public Member(String id, String fullName) {
    super(id, fullName);
  }

  public Member() {
    super("", "");
  }

  public void receiveBook(Book book) {
    this.borrowedBooks.add(book);
  }

  public void giveBook(Book book) {
    this.borrowedBooks.remove(book);
  }

  public Book getBookById(String id) {
    for (Book book : this.borrowedBooks) {
      if (book.id.equals(id)) {
        return book;
      }
  }
    return null;
  }
    
  
}