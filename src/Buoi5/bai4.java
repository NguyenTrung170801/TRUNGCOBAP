package Buoi5;


public class bai4 {
    public static void main(String[] args) {
        System.out.println("chuoi cu: " + "restart");
        System.out.print("chuoi moi: ");
        String str = "restart";
        String str2 = "";
        char a = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (a == str.charAt(i)) {
                str2 += '$';
            } else str2 += str.charAt(i);
        }
        System.out.println(a + str2);
    }

}





