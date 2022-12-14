import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
    Scanner input = new Scanner(System.in);

    System.out.print("Matematik notunuz : ");
    matematik = input.nextInt();

    System.out.print("Fizik notunuz : ");
    fizik = input.nextInt();

    System.out.print("Kimya notunuz : ");
    kimya = input.nextInt();

    System.out.print("Türkçe notunuz : ");
    turkce = input.nextInt();

    System.out.print("Tarih notunuz : ");
    tarih = input.nextInt();

    System.out.print("Müzik notunuz : ");
    muzik = input.nextInt();

    int toplam = (matematik+fizik+kimya+turkce+tarih+muzik);
    double sonuc = toplam / 6;
    System.out.println("Ortalamanız : " + sonuc );

    System.out.println((60< sonuc) ?  "SINIFI GEÇTİ " : "SINIFTA KALDI");




    }

    }
