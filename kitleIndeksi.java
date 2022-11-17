import java.util.Scanner;
 public class kitleIndeksi {
    public static void main(String[] args){

        double boy,kilo,index;
        Scanner input=new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz:");
        boy=input.nextDouble();

        System.out.print("Kİlonuzu Giriniz:");
        kilo=input.nextDouble();

        index=kilo/(boy*boy);
        System.out.print("Vücut Kİtle İndexiniz:"+index);

    }




}
