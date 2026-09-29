package exercicio.pilha1;
import java.util.Stack;

public class Pilha {

    
    String inverterPalavras(String frase){
    String[] palavras = frase.split(" ");
    String resultado = "";
        for (int i = 0; i < palavras.length; i++) {

            Stack<Character> pilha = new Stack<>();

            // Coloca as letras da palavra na pilha
            for (int j = 0; j < palavras[i].length(); j++) {
                pilha.push(palavras[i].charAt(j));
            }

            // Retira as letras da pilha
            while (!pilha.empty()) {
                resultado += pilha.pop();
            }

            // Mantém o espaço entre as palavras
            if (i < palavras.length - 1) {
                resultado += " ";
            }
        }
        return resultado;
    }
}
