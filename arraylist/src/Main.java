import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList <String>();
        name.add("hanzalah");
        name.add("huz");
        name.add("ham");
        name.add("har");
        System.out.println(name);
        name.add(0,"harmain");
        System.out.println(name);
        name.remove(0);
        System.out.println(name);
       String a= name.get(1);
        System.out.println(a);
        name.set(0,"babu " );
        System.out.println(name);






    }
}