package LibraryManagement;
public class Faculty {
private String name;
private String branch;
public Faculty(String name, String branch) {
    this.name = name;
    this.branch = branch;
}
public String getName() {
    return name;
}
public String getBranch() {
    return branch;
}
@Override
public String toString() {
    return "Faculty [name=" + name + ", branch=" + branch + "]";
}
public void setName(String name) {
    this.name = name;
}
public void setBranch(String branch) {
    this.branch = branch;
}

}
