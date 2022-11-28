import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr={ 1,65,7787,8452,-3123};
        Arrays.sort(arr);// {-3123 , 1 ,65 ,7787 , 8452}
        int min=0;
        int max=0;
        Scanner scan=new Scanner(System.in);

        System.out.print("Girilen sayı: ");
        int num=scan.nextInt();

        for (int i: arr){
            if(i<num){
                min=i;
            }
            if(i>num){
                max=i;
                break;
            }
        }
        System.out.println("Minimum en yakın sayı :"+ min);
        System.out.println("Maksimum en yakın sayı :"+ max);

    }
}