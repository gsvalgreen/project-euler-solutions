package problema2.java;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
//      Solução Enterprise XD, guardando a sequencia de fibonacci (first thought).
        List<Integer> sequencia = new ArrayList<Integer>() {{
            add(0);
            add(1);
        }};

        int somaDosParesDaLista = 0;

        for (int i = proximoNumero(sequencia); i <= 4000000; i = proximoNumero(sequencia)) {
            if (i % 2 == 0) somaDosParesDaLista += i;
            sequencia.add(i);
        }
        System.out.println("Sequencia de Fibonacci gerada: " + sequencia.toString());
        System.out.println("Soma dos pares: " + somaDosParesDaLista);

//        Solução "bruta" e mais simples
        int a = 0, b = 1, c = 0;
        int somaDosParesDoWhile = 0;
        while (c < 4000000) {
            if ((c % 2) == 0) somaDosParesDoWhile += c;
            c = a + b;
            b = a;
            a = c;
        }
        System.out.println("Soma dos Pares (While): " + somaDosParesDoWhile);
    }

    public static int proximoNumero(List<Integer> sequencia) {
        int proximo = sequencia.get(sequencia.size() - 1) + sequencia.get(sequencia.size() - 2);
        return proximo;
    }
}
