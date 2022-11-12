import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int arraySize, max, min;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Numbers How many you will enter : ");
        arraySize = scanner.nextInt();
        
        int[] array = new int[arraySize];
        
        for (int i = 0; i< arraySize; i++){
            System.out.print("Enter elements of array : ");
            array[i] = scanner.nextInt();
        }
        
            max = array[0];
            min = array[0];
        
            for (int i = 0; i< arraySize; i++){
            if (array[i] > max ){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
            
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        
    }
}
