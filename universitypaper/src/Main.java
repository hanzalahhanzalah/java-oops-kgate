public class Main {
    public static void main(String[] args) {
        Blogging b1=new Blogging("honney",1,5);
        b1.domainName="ultimate";
        b1.Address="www.ultimate.com";
        b1.earning=1000L;
        b1.postWrite();
        System.out.println(b1.Address);
        System.out.println(b1.earning);
        System.out.println(b1.x);
    }
}
class Blogging{
    String domainName;
    String Address ;
    long earning;
    int x;
    void postWrite(){
        System.out.println("writing post");
    }
    Blogging(String name ,int number,int xn){
        System.out.println("blogging class constructor is running");
        System.out.println(name);
        System.out.println(number);
        x=xn;
    }

}