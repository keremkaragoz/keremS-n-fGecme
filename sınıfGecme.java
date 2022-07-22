import java.util.Scanner;

public class sınıfGecme {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,resim;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = input.nextInt();

        System.out.print("Resim notunuz : ");
        resim = input.nextInt();

        if (mat<0 || mat>100){
            mat = 0;}
        if (fizik<0 || fizik>100){
            fizik = 0;}
        if (kimya<0 || kimya>100){
            kimya = 0;}
        if (turkce<0 || turkce>100){
            turkce = 0;}
        if (resim<0 || resim>100){
            resim = 0;}
        double ortalama;
        ortalama = (mat+fizik+kimya+turkce+resim)/5;

        System.out.println("Ortalamaniz" + ortalama);

        if (ortalama >= 55){
            System.out.print("Sinifi gectiniz.tebrikler!!!  ");
        }else{
            System.out.print("Sınıfta kaldınız!!!  ");
        }

        }

    }

