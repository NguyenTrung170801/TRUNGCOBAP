package buoi3;

public class Dancer extends  Person{
    private String groupName;
    public Dancer(){

    }
    public Dancer(String groupName){

    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    public void dancing(){
        System.out.println("dancing");
    }
}
