package buoi3;

public class Singer extends  Person{
    private String bandName;
    public Singer(){

    }
    public Singer(String bandName){

    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }
    public void singing(){
        System.out.println("singing");
    }
    public void playGitar(){
        System.out.println("playGitar");
    }
}
