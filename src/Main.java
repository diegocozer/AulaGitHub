import java.util.HexFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Converta um int em um long e armazene o resultado em uma variável do tipo long ok
//        Converta um float em um double e armazene o resultado em uma variável do tipo double ok
//        Converta um double em um int e armazene o resultado em uma variável do tipo int ok
//        Converta um char em um int e armazene o resultado em uma variável do tipo int ok
//        Converta um int em uma String e armazene o resultado em uma variável do tipo String ok
// -----------------------------------------------------------------------------------------------------------
//            int num = 10;
//            long numConvert = num;
//                System.out.println("Valor int convertido em long: " + numConvert);
//
//            float num1 = 3.14159f;
//            double num1Convert = num1;
//                System.out.println("Valor do tipo float convertido em double: "  + num1Convert);
//
//            double num3 = 3.14159;
//            int num3Convert = (int) num3;
//                System.out.println("Valor do tipo double convertido em int: "  + num3Convert);
//
//            char caracter = 'a';
//            int caracterConvert = caracter;
//                System.out.println("Valor do tipo char convertido em int: "  + caracterConvert);
//
//            int num4 = 4;
//            String num4Convert = Integer.toString(num4);
//                 System.out.println("Valor do tipo int convertido em String: "  + num4Convert);
//-----------------------------------------------------------------------------------------------------------------
//        Escreva um programa que leia um número inteiro da entrada do usuário e o converta em um objeto da classe wrapper Double. Em seguida, exiba na tela o valor da conversão.
//        Escreva um programa que leia uma string da entrada do usuário e tente convertê-la para um objeto da classe wrapper Integer. Caso a conversão seja bem-sucedida, multiplique o valor por 2 e exiba na tela. Caso contrário, exiba uma mensagem de erro.
//        Escreva um programa que leia uma string da entrada do usuário e tente convertê-la para um objeto da classe wrapper Boolean. Em seguida, exiba na tela o valor da conversão.
//        Escreva um programa que leia um número decimal da entrada do usuário e o converta em um objeto da classe wrapper Integer. Caso a conversão seja bem-sucedida, exiba na tela o valor da conversão. Caso contrário, exiba uma mensagem de erro.
//        Escreva um programa que leia um caractere da entrada do usuário e o converta em um objeto da classe wrapper Integer. Em seguida, exiba na tela o valor da conversão em hexadecimal.
        Scanner sc = new Scanner(System.in);

//        System.out.print("Digite um numero Integer para converter em Double!");
//        Integer numParaConverter = sc.nextInt();
//        Double numConvertido = Double.valueOf(numParaConverter);
//        System.out.println("O valor Integer enviado convertido para Double: " + numConvertido  );



//        System.out.print("Digite uma string para converter em inteiro: ");
//        String stringParaInteiro = sc.nextLine();
//        try {
//            Integer inteiroConvertido = Integer.parseInt(stringParaInteiro);
//            System.out.println("A string " + stringParaInteiro + " foi convertida para o inteiro " + inteiroConvertido);
//        } catch (NumberFormatException e) {
//            System.out.println("Erro: a string digitada não pode ser convertida para um número inteiro.");
//        }

//        System.out.print("Digite uma String  para converter em Bool!");
//        String stringParaBool = sc.nextLine();
//        Boolean stringConvertidaBool = Boolean.valueOf(stringParaBool);
//        System.out.println("A String enviado convertido para Boolean: " + stringConvertidaBool  );

//        Escreva um programa que leia um número decimal da entrada do usuário e o converta em um objeto da classe wrapper Integer.
//        Caso a conversão seja bem-sucedida, exiba na tela o valor da conversão. Caso contrário, exiba uma mensagem de erro.

//        System.out.print("Digite um número Decimal para converter em Integer!");
//        Double DecimalParaInt = sc.nextDouble();
//        try {
//            Integer inteiroConvertido = DecimalParaInt.intValue();
//            System.out.println("O número Double convertido é: " + inteiroConvertido);
//       } catch (NumberFormatException e) {
//           System.out.println("Erro: O número Double c digitada não pode ser convertida para um número inteiro.");
//        }

        //        Escreva um programa que leia um caractere da entrada do usuário e o converta em um objeto da classe wrapper Integer.
        //        Em seguida, exiba na tela o valor da conversão em hexadecimal.

        System.out.print("Digite uma Strin para converter em Hexadecimal!");
        char caracterParaInt = sc.next().charAt(0);
        int intConvertido = (int) caracterParaInt;
       System.out.println("A string convertida para Int é: " + intConvertido + " O valor de int convertido para hexadecimal é: " + Integer.toHexString(intConvertido));

    }
}