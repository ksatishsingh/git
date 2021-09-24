import java.security.PublicKey;

public class MainClass {
    public static void main(String[] args){
        person p1 = new person();
        p1.age=24;
        p1.name="satish";
        System.out.println(p1.age + "   "+p1.name);
    }
}

class person{
    String name;
    int age;
}
