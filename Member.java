import java.util.ArrayList;

abstract class LibraryMember {
  public String id;
  public String name;
  public ArrayList<Book> borrowedBooks = new ArrayList<Book>();

  public void receiveBook(Book book) {
    this.borrowedBooks.add(book);
  }

  public void giveBook(Book book) {
    this.borrowedBooks.remove(book);
  }

  public Book getBookById(String id) {
    for (Book book : this.borrowedBooks) {
      if (book.getId().equals(id)) {
        return book;
      }
    }
    return null;
  }

  public abstract String getId();
}

class Member extends LibraryMember {
  public Member() {
  }

  @Override
  public String getId() {
    return this.id;
  }
}




