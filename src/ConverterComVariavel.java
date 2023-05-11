package src;

public class ConverterComVariavel {
    public void main (String[] str){
//        Converta um int em um long e armazene o resultado em uma variável do tipo long ok
//        Converta um float em um double e armazene o resultado em uma variável do tipo double ok
//        Converta um double em um int e armazene o resultado em uma variável do tipo int ok
//        Converta um char em um int e armazene o resultado em uma variável do tipo int ok
//        Converta um int em uma String e armazene o resultado em uma variável do tipo String ok
// -----------------------------------------------------------------------------------------------------------
            int num = 10;
            long numConvert = num;
                System.out.println("Valor int convertido em long: " + numConvert);

            float num1 = 3.14159f;
            double num1Convert = num1;
                System.out.println("Valor do tipo float convertido em double: "  + num1Convert);

            double num3 = 3.14159;
            int num3Convert = (int) num3;
                System.out.println("Valor do tipo double convertido em int: "  + num3Convert);

            char caracter = 'a';
            int caracterConvert = caracter;
                System.out.println("Valor do tipo char convertido em int: "  + caracterConvert);

            int num4 = 4;
            String num4Convert = Integer.toString(num4);
                 System.out.println("Valor do tipo int convertido em String: "  + num4Convert);

    }

}
