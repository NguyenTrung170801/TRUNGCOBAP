package buoi3;

public class baitapb3 {
    public static void main(String[] args) {
        teacher tc = new teacher();
        teacher teacherA = new teacher();

        phd phdA = new phd();

        teacherA.setAge(21);
        teacherA.setFullName("trung");
        teacherA.setMojor("tin");

        System.out.println(teacherA.getFullName());
        System.out.println(teacherA.getAge());
        System.out.println(teacherA.getMojor());
    }

}
class teacher{
    private int age;
    private  String fullName;
    private  String mojor;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMojor() {
        return mojor;
    }

    public void setMojor(String mojor) {
        this.mojor = mojor;
    }
}
class phd extends  teacher {

}

