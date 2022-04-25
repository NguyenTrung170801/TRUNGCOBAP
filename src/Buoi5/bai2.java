package Buoi5;
import java.util.Scanner;

public class bai2 {
    static void DemKyTu (String str){
            int[] dem = new int[256];
            for (int i = 0; i < str.length(); i++) {
                dem[str.charAt(i)]++;
            }

            for (int i = 0; i < dem.length; i++) {
                if (dem[i] != 0) {
                    System.out.println("Ky tu " + (char) i + " xuat hien " + dem[i] + " lan ");
                }

            }

        }

    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        System.out.println("Chuoi la: "+ str);
        DemKyTu(str);
    }
}