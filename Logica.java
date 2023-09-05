import java.util.Scanner;
public class Logica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalAlunos= 4;

        for(int i =1; i<=totalAlunos; i++){
            double somaNotas = 0;
            for (int j =1; j<=4;j++){
                System.out.println("Digite a nota " + j + " do aluno " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;

            }
            double media = somaNotas / 4;
            System.out.println("A média das notas do aluno " + i + " é: " + media);

            if (media >= 7) {
                System.out.println("Aluno aprovado!");
            } else if (media >= 5) {
                System.out.println("Aluno em recuperação.");
            } else {
                System.out.println("Aluno reprovado.");
            }
        }
   scanner.close();

    }
}