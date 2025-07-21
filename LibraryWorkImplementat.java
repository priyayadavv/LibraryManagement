package LibraryManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryWorkImplementat implements LibraryWork{
   static List<Student> studentlist=new ArrayList<>();
    static List<Faculty> facultyList=new ArrayList<>();
     static List<Book> booklist=new ArrayList<>();
    static Map<String, Integer> issuedList = new HashMap<>();
    
    
    



    @Override
    public void studentRegister(Student student) {
      studentlist.add(student);
      
    }

    @Override
    public void facultyRegister(Faculty faculty) {
      facultyList.add(faculty)  ;
    }

    @Override
    public void issuedBooks() {
      System.out.println(issuedList);
      
    }

    @Override
    public void depositBook() {
      
    }

    @Override
    public void addBook(Book book) {
      booklist.add(book);
    }

    @Override
    public void allBook() {
        for (Book book : booklist) {
            System.out.println(book);
        }
    
    }

    @Override
    public void issueBook(int id) {
      System.out.println(booklist.get);
      
    
      
    }
    

}
