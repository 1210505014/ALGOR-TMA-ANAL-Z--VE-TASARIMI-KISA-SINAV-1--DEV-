import java.util.Random;

public class RandomArray {

    MergeSort m = new MergeSort();


    int[] randomArray = new int[10000];
    Random random = new Random();

    public void olusturma() {

        for (int i = 0; i < randomArray.length; i++) {

            randomArray[i] = random.nextInt();

        }

    }

    public void yazma() {

        System.out.println("Oluşan dizi: ");

        for (int i = 0; i < randomArray.length; i++) {

            System.out.println(randomArray[i]);

        }
    }

}
