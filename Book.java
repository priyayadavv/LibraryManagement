package LibraryManagement;

public class Book {
    private String name;
    private String author;
    private int id;
    
    public Book(String names, String author, int id) {
        this.name = names;
        this.author = author;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", id=" + id + "]";
    }
    public void setId(int id) {
        this.id = id;
    }
    

}
