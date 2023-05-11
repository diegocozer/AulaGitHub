import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio {










    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//    Escreva um programa que leia dois números inteiros e exiba o resultado da soma, subtração, multiplicação,
//    divisão e resto da divisão dos dois números.
//
//        System.out.println("Digite o primeiro número!");
//        int num1 = sc.nextInt();
//        System.out.println("Digite o segundo número!");
//        int num2 = sc.nextInt();
//        System.out.println("Digite a operação desejada (1 - soma, 2 - subtração, 3 - multiplicação, 4 - divisão, 5 - resto da divisão)");
//        int operacao = sc.nextInt();
//
//        switch (operacao){
//            case 1:
//                int soma = num1 + num2;
//            System.out.println("A soma dos valores informados é: " + soma);
//                break;
//            case 2:
//                int subtracao = num1 - num2;
//                System.out.println("A subtração dos valores informados é: " + subtracao);
//                break;
//            case 3:
//                int multiplicacao = num1 * num2;
//                System.out.println("A multiplicação dos valores informados é: " + multiplicacao);
//                break;
//            case 4:
//                int divisao = num1 / num2;
//                System.out.println("A divisão dos valores informados é: " + divisao);
//                break;
//            case 5:
//                int resto = num1 % num2;
//                System.out.println("O resto dos valores informados é: " + resto);
//                break;
//            default:
//                System.out.println("Informe uma operação válida!");
//
//
//        }

//    Escreva um programa que verifique se um número é par ou ímpar utilizando o operador módulo.

//        System.out.println("Digite um número para verificar se é par ou impar!");
//        int num4 = sc.nextInt();
//
//        if(num4 % 2 == 0){
//            System.out.println("O número é par");
//        }else{
//            System.out.println("O número é impar");
//        }

 //    Escreva um programa que leia a idade de uma pessoa e verifique se ela é maior ou igual a 18 anos utilizando o
//    operador relacional de maior ou igual.

//        System.out.println("Digite a sua idade!");
//        int idade = sc.nextInt();
//        if(idade >= 18){
//            System.out.println("Você é maior de idade");
//        }else{
//            System.out.println("Você é menor de idade");
//        }

//    Escreva um programa que leia duas strings e verifique se elas são iguais utilizando o operador lógico de igualdade.

//        System.out.println("Digite a primeira palavra para verificar se é igual a segunda!");
//        String palavra1 = sc.nextLine();
//        System.out.println("Digite a segunda palavra para verificar se é igual a primeira!");
//        String palavra2 = sc.nextLine();
//
//        if(palavra1.equals(palavra2)){
//            System.out.println("As palavras são iguais");
//        }else{
//            System.out.println("As palavras não são iguais - " + palavra1 + " != " + palavra2);
//        }


//    Escreva um programa que calcule a média de três notas e verifique se o aluno foi aprovado ou reprovado utilizando o
//    operador lógico de comparação. Considere que a média para aprovação é 7.0.

//        System.out.println("Digite a primeiro nota!");
//        double nota1 = sc.nextDouble();
//        System.out.println("Digite a segundo nota!");
//        double nota2 = sc.nextDouble();
//
//        double media = (nota1 + nota2) / 2;
//        if(media >= 7.0){
//            System.out.println("Parabés você está aprovado");
//        }else{
//            System.out.println("Ah não, você está reprovado");
//        }

//        Aumentando a complexidade:
//        Escreva um programa que calcule a área de um círculo, dado o seu raio. Utilize a fórmula A = π * r^2
//        e o valor de π como 3.14.
//        DecimalFormat df = new DecimalFormat("0.00");
//        System.out.println("Digite o raio do circulo!");
//        double raio = sc.nextDouble();
//        double total = Math.PI * (raio * raio);
//        System.out.println(df.format(total));




//        Escreva um programa que leia um número inteiro de três dígitos e exiba a soma dos seus dígitos.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Digite um número inteiro de três dígitos: ");
//        int numero = scanner.nextInt();
//        int soma = 0;
//        soma += numero % 10; // soma o último dígito
//        numero /= 10;
//        soma += numero % 10; // soma o segundo dígito
//        numero /= 10;
//        soma += numero % 10; // soma o primeiro dígito
//        System.out.println("A soma dos dígitos é: " + soma);

//        Outra forma de fazer o exercicio anterior
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Digite um número inteiro de três dígitos: ");
//        int numero = scanner.nextInt();
//        int num = 0;
//        int soma = 0;
//        String numeroString =String.valueOf(numero);
//
//        for(int i = 0; i < numeroString.length(); i++){
//            num = Character.getNumericValue(numeroString.charAt(i));
//            soma += (int) num;
//          }
//        System.out.println("A soma do número: "+ numero + " é: " + soma);



//        Escreva um programa que verifique se um número é primo ou não. Utilize o operador de resto da divisão
//        para verificar se o número é divisível por algum outro número além de 1 e ele mesmo.

//           Scanner sc = new Scanner(System.in);
//            System.out.print("Digite um número inteiro: ");
//            int num = sc.nextInt();
//            boolean ehPrimo = true;
//            for (int i = 2; i <= num / 2; i++) {
//                if (num % i == 0) {
//                    ehPrimo = false;
//                    break;
//                }
//            }
//            if (num <= 1)
//                ehPrimo = false;
//            if (ehPrimo)
//                System.out.println(num + " é um número primo.");
//            else
//                System.out.println(num + " não é um número primo.");
//            sc.close();

//        Escreva um programa que leia três números inteiros e verifique se eles formam uma sequência aritmética.
//        Caso afirmativo, exiba a razão da sequência.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Digite o primeiro número inteiro: ");
//        int numero1 = scanner.nextInt();
//        System.out.print("Digite o segundo número inteiro: ");
//        int numero2 = scanner.nextInt();
//        System.out.print("Digite o terceiro número inteiro: ");
//        int numero3 = scanner.nextInt();
//
//        if (numero2 - numero1 == numero3 - numero2) {
//            int razao = numero2 - numero1;
//            System.out.println("Os números formam uma sequência aritmética com razão " + razao);
//        } else {
//            System.out.println("Os números não formam uma sequência aritmética");
//        }

//        Escreva um programa que leia uma string e verifique se ela é um palíndromo, ou seja,
//        se a string lida é a mesma lida de trás para frente.
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Digite uma palavra: ");
//        String palavra = scanner.nextLine();
//
//        boolean ehPalindromo = true;
//        int tamanho = palavra.length();
//        for (int i = 0; i < tamanho / 2; i++) {
//            if (palavra.charAt(i) != palavra.charAt(tamanho - i - 1)) {
//                ehPalindromo = false;
//                break;
//            }
//        }
//
//        if (ehPalindromo) {
//            System.out.println("A palavra é um palíndromo.");
//        } else {
//            System.out.println("A palavra não é um palíndromo.");
//        }


    }
}
