package src;

import java.util.Scanner;

public class ConverterComEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero Integer para converter em Double!");
        Integer numParaConverter = sc.nextInt();
        Double numConvertido = Double.valueOf(numParaConverter);
        System.out.println("O valor Integer enviado convertido para Double: " + numConvertido  );

        System.out.print("Digite uma string para converter em inteiro: ");
        String stringParaInteiro = sc.nextLine();
        try {
            Integer inteiroConvertido = Integer.parseInt(stringParaInteiro);
            System.out.println("A string " + stringParaInteiro + " foi convertida para o inteiro " + inteiroConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Erro: a string digitada não pode ser convertida para um número inteiro.");
        }

        System.out.print("Digite uma String  para converter em Bool!");
        String stringParaBool = sc.nextLine();
        Boolean stringConvertidaBool = Boolean.valueOf(stringParaBool);
        System.out.println("A String enviado convertido para Boolean: " + stringConvertidaBool  );



        System.out.print("Digite um número Decimal para converter em Integer!");
        Double DecimalParaInt = sc.nextDouble();
        try {
            Integer inteiroConvertido = DecimalParaInt.intValue();
            System.out.println("O número Double convertido é: " + inteiroConvertido);
       } catch (NumberFormatException e) {
           System.out.println("Erro: O número Double c digitada não pode ser convertida para um número inteiro.");
        }

        System.out.print("Digite uma Strin para converter em Hexadecimal!");
        char caracterParaInt = sc.next().charAt(0);
        int intConvertido = (int) caracterParaInt;
        System.out.println("A string convertida para Int é: " + intConvertido + " O valor de int convertido para hexadecimal é: " + Integer.toHexString(intConvertido));

    }
}