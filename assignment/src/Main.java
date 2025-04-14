
class Calculator{
    public double sub1;
    public double  sub2;
    public double  sub3;
    public  double sub4;
    public  double sub5;
    public  double sub6;
}
class Graduation extends Calculator {
  /*  public Graduation(){
        System.out.println("Here is your Graduation Result");

    }*/
    public void getGpa() {
        System.out.println("your GPA is :" + (sub1 + sub2 + sub3 + sub4 + sub5 + sub6) / 6);
    }

    public void getGp() {
        if (sub1 >= 85) {
            System.out.println("your subject gp is :4");
        } else if (sub1 >= 79 && sub1 < 85) {
            System.out.println("your subject 1 gp is :3.8");
        } else if (sub1 >= 75 && sub1 < 79) {
            System.out.println("your subject 1 gp is :3.4");
        } else if (sub1 >= 70 && sub1 < 75) {
            System.out.println("your subject 1  gp is :3");
        } else {
            System.out.println("your subject 1  gp is: 2");

        }
        if (sub2 >=85 ) {
            System.out.println("your subject 2  gp  is :4");
        } else if (sub2 >= 79 && sub2 < 85) {
            System.out.println("your subject 2  gp is :3.8");
        } else if (sub2 >= 75 && sub2 < 79) {
            System.out.println("your subject 2  gp is :3.4");
        } else if (sub2 >= 70 && sub2 < 75) {
            System.out.println("your subject 2  gp is :3");
        } else {
            System.out.println("your subject 2  gp is : 2");

        }
        if (sub3  >=85 ) {
            System.out.println("your subject 3  gp is :4");
        } else if (sub3 >= 79 && sub3 < 85) {
            System.out.println("your subject 3  gp is :3.8");
        } else if (sub3 >= 75 && sub3 < 79) {
            System.out.println("your subject 3  gp is :3.4");
        } else if (sub3 >= 70 && sub3 < 75) {
            System.out.println("your subject 3 gp is :3");
        } else {
            System.out.println("your subject 3 gp is : 2");

        }
        if (sub4 >=85 ) {
            System.out.println("your subject 4 gp is :4");
        } else if (sub4 >= 79 && sub4 < 85) {
            System.out.println("your subject 4 gp is :3.8");
        } else if (sub4 >= 75 && sub4 < 79) {
            System.out.println("your subject 4 gp is :3.4");
        } else if (sub4 >= 70 && sub4 < 75) {
            System.out.println("your subject 4 gp is :3");
        } else {
            System.out.println("your subject 4  gp is : 2");

        }
        if ( sub5>=85) {
            System.out.println("your subject 5  gp is :4");
        } else if (sub5 >= 79 && sub5 < 85) {
            System.out.println("you5 subject 5 gp is :3.8");
        } else if (sub5 >= 75 && sub5 < 79) {
            System.out.println("your subject 5 gp is :3.4");
        } else if (sub5 >= 70 && sub5 < 75) {
            System.out.println("your subject 5 gp is :3");
        } else {
            System.out.println("your subject 5 gp is : 2");

        }
        if (sub6>= 85) {
            System.out.println("your subject 6  gp is :4");
        } else if (sub6 >= 79 && sub6 < 85) {
            System.out.println("your subject 6  gp is :3.8");
        } else if (sub6 >= 75 && sub6 < 79) {
            System.out.println("your subject 6  gp is :3.4");
        } else if (sub6 >= 70 && sub6 < 75) {
            System.out.println("your subject 6  gp is :3");
        } else {
            System.out.println("your subject 6 gp  is : 2");

        }
    }
}

class Inter extends Calculator{

/*public  Inter(){
    System.out.println("Here is your Intermediate  Result");

}*/
    public void getPercentage(){
        System.out.println("Your Intermediate percentage  is :" + (sub1+sub2+sub3+sub4+sub5+sub6)/600*100);
    }



}




public class Main {
    public static void main(String[] args) {
        Graduation gd=new Graduation();
        gd.sub1=40;
        gd.sub2=69;
        gd.sub3=79;
        gd.sub4=65;
        gd.sub5=76;
        gd.sub6=90;

        gd.getGp();
        gd.getGpa();
Inter intr=new Inter();
intr.sub1=56;
        intr.sub2=96;
        intr.sub3=78;
        intr.sub4=99;
        intr.sub5=63;
        intr.sub6=69;
        intr.getPercentage();

    }
}