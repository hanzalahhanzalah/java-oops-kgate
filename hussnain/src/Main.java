class A{
    String day="friday";
    public void vitamin(){
        System.out.println("alhamdulilah i have taken vitamin D");
    }
}
class B extends A{


   public String day="next friday";
   void print(){
       System.out.println(day);
       System.out.println(super.day);// used to differenciate memebers of super class and sub class if names of both
       //variables and methods are same
   }
    public void vitamin(){
super.vitamin();
        System.out.println("will take next friday");
    }

}

class concept{

    concept(String name){

        System.out.println("hi from parent constructor" + name);
    }

}
class conceptConstructor  extends concept{


    conceptConstructor(){
        super("honey"); //parametrize ky lea khud sey constuctor bnana zaroei hy
        //or child class ky contructor ky andar bany ga parent ka constructor
        System.out.println("hello from child constructor");
    }
}

public class Main {
    public static void main(String[] args) {
B obj=new B();
obj.print();
obj.vitamin();
        System.out.println(obj.day);
         concept c=new concept(h);
        conceptConstructor check=new conceptConstructor();

    }
}