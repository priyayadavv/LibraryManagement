package LibraryManagement;

public interface LibraryWork {
  void studentRegister(Student student);
  void facultyRegister(Faculty faculty);
  void issuedBooks();
  void depositBook();
  void addBook(Book book);
  void allBook();
  void issueBook(int id);
  void payFineAfterLate();


}
