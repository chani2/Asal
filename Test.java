import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i<=n; i++ ){
            int counter = 0;
            for(int k =1 ; k<i; k++){
                if(i%k==0){
                    counter++;

                }
            }
            if(counter<=1){
                System.out.print(" ," + i);
            }
        }


    }
}