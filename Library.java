package LibraryManagement;

import java.util.Scanner;

public class Library extends LibraryWorkImplementat {
    public static void main(String[] args) {
        Book book = new Book("the girl in room 105", "chetan bhagat", 1);
        Book book1 = new Book("half-girlfrnd", "chetan bhagat", 2);

        Library library = new Library();
        Library library1 = new Library();
    
        library.addBook(book);
        library.addBook(book1);

        // input of student
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter name");
        // String name = sc.nextLine();
        // System.out.println("enter branch");
        // String branch = sc.nextLine();
        // Student student = new Student(name, branch);
        // library.studentRegister(student);
        // System.out.println(library.studentlist);
        // // input of faculty
        // System.out.println("enter faculty name");
        // // String fname = sc.nextLine();
        // System.out.println("enter faculty branch");
        // String b = sc.nextLine();
        // Faculty faculty = new Faculty(fname, branch);
        // // adding faculty in faculty method
        // library.facultyRegister(faculty);
        // System.out.println(library.facultyList);

        System.out.println(" choose one option");
        System.out.println("1. register yourself");
        System.out.println("2. add a book(only faculty)");
        System.out.println("3. issued a book");
        System.out.println("4. see all book");
        System.out.println("5. see all issue book");
        System.out.println("6. deposit a book");
        System.out.println("choose:");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.println("choose registraion of faculty & student");
                System.out.println("1. student");
                System.out.println("2. faculty");
                int chose = sc.nextInt();
                switch (chose) {
                    case 1:
                        System.out.println("enter student name");

                        String name = sc.nextLine();
                        sc.nextLine();
                        System.out.println("enter student branch");
                        String branch = sc.nextLine();
                        Student student = new Student(name, branch);
                        library.studentRegister(student);
                        System.out.println(library.studentlist);
                        break;
                    case 2:
                        System.out.println("enter faculty name");
                        String n = sc.nextLine();
                        sc.nextLine();
                        System.out.println("enter faculty branch");
                        String br = sc.nextLine();
                        Faculty faculty = new Faculty(n, br);
                        library.facultyRegister(faculty);
                        System.out.println(library.facultyList);

                        break;

                }

                break;

            case 2:

                System.out.println("enter your name");
                String name = sc.nextLine();
                if (facultyList.contains(name)) {
                    System.out.println("enter book name");
                    String bname = sc.nextLine();
                    sc.nextLine();
                    System.out.println("enter author name");
                    String auth = sc.nextLine();
                    System.out.println("enter the id ");
                    int id = sc.nextInt();
                    Book book3 = new Book(bname, auth, id);
                    library.addBook(book3);
                    System.out.println(library.booklist);
                }else{
                    System.out.println("only faculty can add book");
                }

                break;

            case 3:
                library.allBook();
                System.out.println("enter a book id");
                int id=sc.nextInt();
              

                System.out.println("enter name");
                S
                System.out.println("enter id");
                library.issueBook(id);

                System.out.println("issued book is done");
                break;

            case 4:
                library.allBook();
                break;

            case 5:
                library.issuedBooks();
                System.out.println();
                break;

            case 6:
                System.out.println("deposit books");

                break;
            default:
                System.out.println("return all the books");
                break;
        }

    }

}
