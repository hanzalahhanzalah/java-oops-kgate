//Encapsulation
class FacebookLogin{

    private String email;//data hidding

    public void setEmail(String email) { //data abstraction
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    private String password;
    void setPassword(String setpassword){
        this.password=setpassword;

    }
     String getPassword(){
        return password;}
void set(String pass){
    this.password=pass;

         }
         String getpass(){
        return password;
         }
     }



public class Main {

    public static void main(String[] args) {
        FacebookLogin user=new FacebookLogin();
        user.setEmail("hanzalah026@gmail.com");
        System.out.println(user.getEmail());
        user.setPassword("jiednejdd");
        System.out.println(user.getPassword());
    }
}