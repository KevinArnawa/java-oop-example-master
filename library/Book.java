class Book {
  public String id;
  public String title;

  public void setId(String bookId) {
    this.id = bookId;
  }
  
  public void setId(int bookId) {
    this.id = Integer.toString(bookId);
  }
  
  public Object getId() {
    return null;
  }
}