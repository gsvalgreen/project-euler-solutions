package problema1.java;

public class Solution {
    public static void main(String[] args) {
        int somaMultiplos = 0;
        System.out.println("Multiplos de 3 ou 5: ");
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("\t" + i);
                somaMultiplos += i;
            }
        }
        System.out.println("A soma dos números multiplos de 3 ou 5: " + somaMultiplos);
    }
}
