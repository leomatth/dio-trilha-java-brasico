public class ExemploFor {
    public static void main(String[] args) {
        String alunos[]= {"FELIPE", "JONAS", "JULIA", "MARCOS" };
            // em arrays o indice de elementos inicia em zerooo por isso int x = 0
        for (int x=0; x<alunos.length; x++) {
            System.out.println("    O aluno no indice x= " + x + alunos[x]);
        }

            // pode usar também for each como no exemplo abaixo, você cria uma variável temporária dentro do bloco
       
       
            for (String aluno : alunos){
            System.out.println("    Nome do aluno é: " + aluno);
        }
    }
}
