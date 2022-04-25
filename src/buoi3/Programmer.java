package buoi3;

public class Programmer extends Person{
     private String companyName;

     public Programmer(){

     }
     public Programmer(String companyName){

     }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void coding(){
        System.out.println("coding");
    }
}
