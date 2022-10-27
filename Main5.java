import java.util.Scanner;
    public class Main5 {
    public static void main(String[] args){
        double yaricap,cemberinalani, cemberincevresi, dairedilimininalani;
        double pi = 3.14;
        int merkezaci;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı Giriniz :");
        yaricap = input.nextInt();

        Scanner inp = new Scanner(System.in);
        System.out.print("Merkez açıyı Giriniz :");
        merkezaci = inp.nextInt();


        dairedilimininalani= (pi*(yaricap*yaricap)*merkezaci)/360;
        cemberinalani= pi*yaricap*yaricap;
        cemberincevresi= 2*pi*yaricap;

        System.out.println("Çemberin Alanı : " + cemberinalani);
        System.out.println("Cemberin Cevresi : " + cemberincevresi);
        System.out.println("Daire Diliminin alanı : " + dairedilimininalani);
    }
}
