import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

       /*try {
           FileWriter fi = new FileWriter("C:\\Users\\hanzalah\\Desktop\\filewriter.txt");

          try{ fi.write("i purple you");}

          finally {
              fi.close();
              System.out.println("succefully wrote");
          }

       }
       catch(IOException t){
           System.out.println("file creating handled: "+t);

       }*/
       /* FileReader n=new FileReader ("C:\\Users\\hanzalah\\Desktop\\filewriter.txt");
        int i;
        while ((i=n.read()) !=-1){

            System.out.print((char)i);
        }
       n.close();

File e=new File("C:\\Users\\hanzalah\\Desktop\\filewriter.txt");
        File r=new File("C:\\Users\\hanzalah\\Desktop\\filehandlingread.txt");

e.renameTo(r);
        System.out.println("rename succefully " + r);*/
        FileInputStream re=new FileInputStream("C:\\Users\\hanzalah\\Desktop\\filehandlingread.txt");
        FileOutputStream wr=new FileOutputStream ("C:\\Users\\hanzalah\\Desktop\\copy.txt");
int j;
while ((j=re.read())!=-1){
    wr.write((short)j);
    System.out.println((char)j +"file read copied succesfulyy");
    j++;
}

    }
}
