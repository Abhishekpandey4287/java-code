package pack;

public class privateDemo {
    public static void main(String[] args) {
        student s = new student();
        s.name = "Abhishek";
        s.age = 23;
        // since we cann't access the property of private we have to use getters and setters method
        s.setPassword("Prem");
        System.out.println(s.getpassword());
    }
}
class student {
    int age ;
    String name ;
    private String password = "Abhishek";

    public String getpassword(){
        return this.password;
    }
    public  void setPassword( String s ){
        this.password = s ;
    }

}

