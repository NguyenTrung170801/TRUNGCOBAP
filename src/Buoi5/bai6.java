package Buoi5;
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap 1 tu hoăc 1 cau:");
            String str = sc.nextLine();

            str += " ";
            String tu = "";
            String ltu = "";
            int len = str.length();

            for (int i = 0; i < len; i++) {
                char ch = str.charAt(i);
                if (ch == ' ') {

                    if (tu.length() > ltu.length())
                        ltu = tu;

                    tu = "";
                }
                else {
                    tu += ch;
                }
            }

            System.out.println("Tu dai nhat " + ltu +
                    ": Do tu dai nhat: " + ltu.length());
        }

    }




