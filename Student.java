package LibraryManagement;
public class Student {
private String name;
private String branch;
public Student(String name, String branch) {
    this.name = name;
    this.branch = branch;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public void setBranch(String branch) {
    this.branch = branch;
}
public String getBranch() {
    return branch;
}
@Override
public String toString() {
    return "Student [name=" + name + ", branch=" + branch + "]";
}

}
