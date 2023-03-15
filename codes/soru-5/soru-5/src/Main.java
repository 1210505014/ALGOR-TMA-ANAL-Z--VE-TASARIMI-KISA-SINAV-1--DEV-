public class Main {
    public static void main(String[] args) {


    }

    public void bigO(int n){

        for(int i=0;i<n;i++){                             //T(1)+T(n+1)+T(n)=T(2n+2)

            for(int j=0;j<n;j++){                         // T(n)+T(n^2+n)+T(n^2)=T(2n^2+2n)

                System.out.println("Hello World!");       //T(n^2)
            }
        }
    }                                                   //Toplam = T(3n^2+4n+4)

}                                                              //=O(n^2)