import java.util.Arrays;
import java.util.Scanner;

public class exercicioArrayEmAula {

    public static void main (String[] str){
//
//        int[] array = new int[10];
//        Random random = new Random();
//
//        for(int count = 0; count < array.length; count++ ){
//            array[count] = random.nextInt(49);
//        }
//
//        int maior = array[0];
//        int menor = array[0];
//
//
//        for(int i = 0; i < array.length; i++){
//            if(array[i] > maior){
//                maior = array[i];
//            }
//            if(array[i] < menor){
//                menor = array[i];
//            }
//
//        }
//        System.out.println(Arrays.toString(array));        System.out.println(maior);
//        System.out.println(menor);
        var sc = new Scanner(System.in);
        System.out.println("Digite o tamanho dos arrays: ");
        var arraysLenght = sc.nextInt();
        var arraysOne = new int[arraysLenght];
        var arraysTwo = new int[arraysLenght];
        var arraysFinal = new int[arraysLenght * 2];

        System.out.println("Digite os valores do primeiro array: ");
        for(int i = 0; i < arraysLenght ; i++){
            arraysOne[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do segundo array: ");
        for(int j = 0; j < arraysLenght ; j++){
            arraysTwo[j] = sc.nextInt();
        }

        int n = 0;
        for(int k = 0; k < arraysLenght; k++){
                arraysFinal[n] = arraysOne[k];
               arraysFinal[n + 1] = arraysTwo[k];
              n += 2;
              }
        System.out.println(Arrays.toString(arraysFinal));
    }

}
