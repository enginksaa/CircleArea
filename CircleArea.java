import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        float piSayisi = 3.14f;
        double alan;
        double cevre;
        double yaricap;
        float aci;
        double aciAlani;

        Scanner userEntry = new Scanner(System.in);
        System.out.print("Lütfen yaricap giriniz :");
        yaricap = userEntry.nextDouble();
        System.out.print("Lütfen acisini giriniz :");
        aci = userEntry.nextFloat();

        alan = piSayisi * yaricap * yaricap;
        cevre = 2 * piSayisi * yaricap;
        aciAlani = (piSayisi * (yaricap * yaricap) * aci) / 360;
        System.out.println("Dairenin alani :" + alan);
        System.out.println("Dairenin cevresi :" + cevre);
        System.out.println("Acisi verilen dairenin alani :" + aciAlani);

    }
}
