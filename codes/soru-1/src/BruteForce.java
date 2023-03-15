public class BruteForce {

       public void linearSearch(int[] dizi){

           int maksdeger=0;

           for(int i=0;i<dizi.length;i++){

               if(dizi[i]>maksdeger){
                   maksdeger=dizi[i];
               }
           }

           System.out.println("Maksimum değer: "+maksdeger);
       }


    }

