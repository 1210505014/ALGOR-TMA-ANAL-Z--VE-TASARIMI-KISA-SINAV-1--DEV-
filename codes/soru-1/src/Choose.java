import java.util.Random;
import java.util.Scanner;

public class Choose {

    RandomArray ra= new RandomArray();
    BruteForce bf=new BruteForce();
    BinarySearch bs = new BinarySearch();
    MergeSort ms = new MergeSort();

    public void choose(){

        System.out.println("Elemanları 10000 tane ve rastgele sayılar olan dizinin en büyük değerini " +
                "bulma hızını seçiniz:  ");

        System.out.println("1- Hızlı");
        System.out.println("2- Yavaş");

        System.out.println("Secilen hız : ");

        Scanner secim = new Scanner(System.in);

        int numara=secim.nextInt();

        switch (numara){

            case 1:
                ra.olusturma();
                ra.yazma();
                ms.sort(ra.randomArray,0,ra.randomArray.length-1);
                bs.binarySearch(ra.randomArray);
                break;

            case 2:
                ra.olusturma();
                ra.yazma();
                bf.linearSearch(ra.randomArray);
                break;
            default:
                System.out.println("Lütfen doğru sayı giriniz!");
        }

    }
}
