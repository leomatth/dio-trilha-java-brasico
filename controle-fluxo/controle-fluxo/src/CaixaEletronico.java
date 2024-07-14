public class CaixaEletronico {
    
    public static void main(String[] args, String string) {
        
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(string + saldo);


    }
}
