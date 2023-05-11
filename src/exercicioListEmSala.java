import java.util.*;

public class exercicioListEmSala {

    public static void main(String[] str) {
//        List<Integer> numberList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
//
//        for(int i = 0; i < 5; i++){
//            System.out.printf("Digite o número de posição %s: ", i);
//            numberList.add(sc.nextInt());
//        }
//        System.out.println("Ordenação inicial: " + numberList);
//        Collections.reverse(numberList);
//        System.out.println("Ordenação final: " + numberList);
//    --------------------------------------------------------------------------------------
        List<Integer> numberList = new ArrayList<Integer>();

        System.out.println("Quantos indices tem o array? ");
        int arrayLength = sc.nextInt();
        Boolean finished = Boolean.FALSE;

        List<Integer> positionExcluded = new ArrayList<Integer>();
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Digite o número inteiro: ");
            numberList.add(sc.nextInt());
        }
        for (int i = 0; i < arrayLength - 1; i++) {

            if (numberList.size() > 0) {
                int num1 = numberList.get(i);
                List<Integer> auxNumberList = new ArrayList<Integer>(numberList);

                auxNumberList.remove(i);
                //  int num2 = numberList.get(i + 1);
                for (int num2 : auxNumberList) {
                    if (num1 + num2 == 10 && !positionExcluded.contains(numberList.indexOf(num1))) {
                        positionExcluded.add(numberList.indexOf(num2));
                        finished = Boolean.TRUE;
                        System.out.printf("Os números %s + %s = 10", num1, num2);
                        System.out.printf("\n");
                    }
                }
            }
        }
        if (!finished) {
            System.out.println("Não há pares cuja a soma seja igual a 10");
        }

    }

}
