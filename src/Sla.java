import java.util.Scanner;

public class Sla {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler da entrada padrão (teclado)
        Scanner ariel = new Scanner(System.in);

        // Solicitar e ler uma string
        System.out.print("Digite algo: ");
        String nova = ariel.nextLine();

        // Imprimir a string lida
        System.out.println("Você digitou: " + nova);

        // Fechar o Scanner quando não for mais necessário
        ariel.close();
    }
}