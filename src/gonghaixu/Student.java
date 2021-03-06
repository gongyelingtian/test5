package gonghaixu;

public class Student {
    private String name;
    private int age;
    private char gender;
    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static Student interactiveCreate() {
        return new Student(
                InputUtil.inputString("请输入姓名："),
                InputUtil.inputInt("请输入年龄：", 0, -1),
                InputUtil.select("请选择性别：", "男", "女").charAt(0)
        );
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "学生信息{\n" +
                "\t姓名='" + name + '\'' + "\n" +
                "\t年龄=" + age + "\n" +
                "\t性别=" + gender + "\n" +
                '}';
    }
}
