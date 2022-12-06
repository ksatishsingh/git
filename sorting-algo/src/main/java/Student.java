public class Student {
    private int id;
    private String name;
    private int roll_code;
    private String opt_lang;

    public Student(int id, String name, int roll_code, String opt_lang) {
        this.id = id;
        this.name = name;
        this.roll_code = roll_code;
        this.opt_lang = opt_lang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_code() {
        return roll_code;
    }

    public void setRoll_code(int roll_code) {
        this.roll_code = roll_code;
    }

    public String getOpt_lang() {
        return opt_lang;
    }

    public void setOpt_lang(String opt_lang) {
        this.opt_lang = opt_lang;
    }


    public static void main (String[] args){
        String stu_name;
        Student student = new Student(123,"Satish",43,"maths");
        stu_name=student.getName();
        student.getId();
        System.out.println(stu_name);

    }
}
