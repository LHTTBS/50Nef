import java.util.Scanner;


public class Mainn{

    public static void main(String[]args){
        Scanner number = new Scanner(System.in);
        int[] array=new int[10];
        System.out.println(    ":666");
        for (int i =0;i<array.length;i++){
            array [i]=scanner.nextInt();
        }
        int max =array[0];
        int min =array[0];
        int maxIndex=0;
        int minIndex=0;
        for(int i =0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
                maxIndex=i; 
            }

        }
        System.out.println("1"+max+"1");
     }

    
}
