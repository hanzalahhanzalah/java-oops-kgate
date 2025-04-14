import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        FileManager fm=new FileManager();
        fm.createFile();
        fm.Filelist();
        fm.totalsize();
        fm.read();
        Files fi=new Files();
        fi.displayDetails();


        //Create a program that models a simple file management system using Java OOP and ArrayList.
        // Implement classes for File and FileManager. The File class should
        // have attributes like fileName, fileSize, and methods to display file details.
        // The FileManager class should use an ArrayList to manage a collection of files.
        // Include methods to add a new file, display the list of files, and calculate the total size of all files.
        // Write a program to demonstrate the usage of these classes by adding files,
        // displaying the list, and calculating the total size.



    }
}
class Files{
    String fileName;
    String fileSize;
    void displayDetails(){
        File fd=new File("C:\\Users\\hanzalah\\Desktop\\testfalo.txt");
        System.out.println( fd.exists());
        System.out.println(fd.getName());
        System.out.println(fd.length());



    }
}


class FileManager extends Files{
    void createFile() throws IOException {
        File f=new File("C:\\Users\\hanzalah\\Desktop\\testfalo.txt");
        f.createNewFile();


    }

    ArrayList<String> list=new ArrayList<>();
    void  Filelist() throws IOException {
        FileWriter w=new FileWriter("C:\\Users\\hanzalah\\Desktop\\testfalo.txt");

        list.add("purple");
        list.add("pinky");
        list.add("ponki");
        list.add("ponki");


        for (String item: list)
            w.write(item + "/");
        w.close();
    }
    void totalsize(){
        System.out.println(list.size());
    }
    void read() throws IOException {
        FileReader r=new FileReader("C:\\Users\\hanzalah\\Desktop\\testfalo.txt");
        int j;
        while((j=r.read())!=-1){
            System.out.print((char)j);
        }
        r.close();
    }

}