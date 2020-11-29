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
                InputUtil.inputString("������������"),
                InputUtil.inputInt("���������䣺", 0, -1),
                InputUtil.select("��ѡ���Ա�", "��", "Ů").charAt(0)
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
        return "ѧ����Ϣ{\n" +
                "\t����='" + name + '\'' + "\n" +
                "\t����=" + age + "\n" +
                "\t�Ա�=" + gender + "\n" +
                '}';
    }
}