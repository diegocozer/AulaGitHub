import java.util.Scanner;

public class desafiosextafeira {

        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
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

//            Scanner sc = new Scanner(System.in);
//            System.out.print("Digite um ano para verificar se é bissexto ");
//            int ano = sc.nextInt();
//
//            if(ano % 400 == 0 | ((ano % 4 == 0) && (ano % 100 != 0 ))){
//                System.out.println(ano + " é bissexto.");
//            }else{
//                System.out.println(ano + " não é bissexto.");
//            }

//            Scanner sc = new Scanner(System.in);
//            System.out.print("Digite um número inteiro para verificar se é divisivel por 5 ou 3: ");
//            int num1 = sc.nextInt();
//
//            if (num1 % 15 == 0) {
//            System.out.println(num1 + " é um múltiplo de 5 e 3.");
//        } else {
//            System.out.println(num1 + " não é um múltiplo de 5 e 3.");
//        }


//            Scanner sc = new Scanner(System.in);
//            System.out.print("Digite um número inteiro para verificar se é divisivel por 5, 3 ou 2: ");
//            int num1 = sc.nextInt();
//
//            if(num1% 5 == 0){
//                System.out.println(num1 + " é divisivel por 5");
//            }else if(num1 % 3 == 0){
//                System.out.println(num1 + " é divisivel por 3");
//            }else if (num1 % 2 == 0 ){
//                System.out.println(num1 + " é divisivel por 2");
//            }else{
//                System.out.println(num1 + " não é divisivel por 5, 3 e 2");
//            }

//
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Digite uma idade: ");
//            int idade = sc.nextInt();
//
//            if(idade >= 18){
//                System.out.println("É maíor de 18!");
//            }else{
//                System.out.println("Não é maior de idade");
//            }
//


            int diaDaSemana = 7;
            switch (diaDaSemana){
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-feira");
                    break;
                case 3:
                    System.out.println("Terça-feira");
                    break;
                case 4:
                    System.out.println("Quarta-feira");
                    break;
                case 5:
                    System.out.println("Quinta-feira");
                    break;
                case 6:
                    System.out.println("Sexta-feira");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
            }

        }
    }


