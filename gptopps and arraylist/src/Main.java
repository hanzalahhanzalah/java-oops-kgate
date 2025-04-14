import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Library l=new Library();
        l.addauthhor();
        l.addtitle();
        l.displaylist();
        l.search();




    }
}
//Create a class Book with attributes title and author. Implement a parameterized constructor
// to initialize these attributes. Create another class Library that uses an ArrayList to store a
// collection of Book objects. Include methods to add a new book to the library, display the list of books,
// and find a book by a given author. Write a program to demonstrate the usage of these classes by adding books,
// displaying the library's contents, and searching for books by a specific author.
class Book{

   public  String title;
    public  String author ;
     Book(String t, String a){
        this.title=t;
        this.author=a;

    }

}
class Library extends Book{
    Library () {
       super("bange dara","ALLAMA IQBAL");

    }

    ArrayList<String> store=new ArrayList<>();


    void addtitle(){

        store.add(title);
        System.out.println(store);
    }
    void addauthhor(){
        store.add(author);
        System.out.println(store);
    }

    void search(){
        String s= store.get(1);
        System.out.println(s);

    }
    void displaylist(){
        System.out.println(store);
    }
}