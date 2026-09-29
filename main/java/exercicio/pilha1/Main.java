package exercicio.pilha1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Pilha pilha = new Pilha();

        System.out.println("Digite uma frase:");
        String frase = leia.nextLine();

        String resultado = pilha.inverterPalavras(frase);

        System.out.println("Frase invertida:");
        System.out.println(resultado);

        leia.close();
    }
}