public class Operadores {
   
    /**
     * @param args
     */
    public static void main(String[] args) {

        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7 ) + (20 / 4);
        String nomeCompleto = "                Leonardo " + " Mattheus ";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = (1 + 1 + "1") + 1 + "1";

        System.out.println(concatenacao);
    
    }

}