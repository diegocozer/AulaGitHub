import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.*;

public class exercicioArrayList {

    public static void main(String[] str){
//        1. Crie uma lista de strings vazia e adicione três elementos a ela: "Maçã", "Banana" e
//        "Laranja".

//        ArrayList<String> arrayExerc = new ArrayList<String>();
//        arrayExerc.add("Maça");
//        arrayExerc.add("Banana");
//        arrayExerc.add("Laranja");
//        System.out.println(arrayExerc);

//        2. Crie uma lista de inteiros com os números de 1 a 5 e imprima cada elemento da
//        lista.
//
//        ArrayList<Integer> arrayInt = new ArrayList<Integer>();
//        for(int i = 1; i <= 5; i++){
//            arrayInt.add(i);
//        }
//        System.out.println(arrayInt);

//        3. Crie uma lista de doubles com valores aleatórios e calcule a média dos valores.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int lengt = sc.nextInt();
        ArrayList<Double> arrayDouble = new ArrayList<Double>();
        Random random = new Random();
        DecimalFormat dc = new DecimalFormat("0.##");


        for(int i = 0; i <= lengt; i++){
            sc.useLocale(Locale.ENGLISH);
            arrayDouble.add(Double.valueOf(dc.format(random.nextDouble(50))));
        }
        System.out.println(arrayDouble);


    }

}
