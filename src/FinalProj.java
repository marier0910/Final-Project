import java.util.Scanner;

public class FinalProj {
    public static void main(String[] args) {

        Scanner red = new Scanner (System.in);
        String [] fruit1 = new String[10];
        System.out.print("Enter the fruit name: ");
        for (int m = 0; m < (fruit1.length); m++) {
            fruit1[m] = red.next();

        }
        //Acending order
        System.out.print("fruit1");
        for (int m = 0; m < (fruit1.length-1); m++) {

            System.out.println(fruit1[m]);
        }
        String blue = "";
        String[] ascendingOrder = new String[10];
        for (int m = 0; m < (fruit1.length-1); m++){
            for (int k = 0; k < (fruit1.length -m) -1; k ++ ){
                if (fruit1[k].compareToIgnoreCase(fruit1[k+1]) > 0) {
    blue = fruit1[k];
    fruit1[k] = fruit1[k + 1];
    fruit1[k + 1] = blue;

                }
            }

        }
        System.out.println(" going up");
        for(int m = 0; m < (fruit1.length); m ++){
            System.out.println(fruit1[m]);

        }
        System.out.println(" going down");
        for(int m = fruit1.length -1; m >= 0; m-- ){
            System.out.println(fruit1 [m]);

            }
    }

    }
