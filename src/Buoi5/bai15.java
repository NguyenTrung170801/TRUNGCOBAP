package Buoi5;

public class bai15 {
    public static void main(String[] args) {
        System.out.println(add_tags("i","java"));
    }

public static String add_tags(String tagname,String content){
        return "<"+ tagname+">"+content+"</"+tagname+">";
}

}


