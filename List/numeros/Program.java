import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();

        try {
            ManipularArrayNumeros.adicionarNumero(numeros, 1);
            ManipularArrayNumeros.adicionarNumero(numeros, 3);
            ManipularArrayNumeros.adicionarNumero(numeros, 6);
            ManipularArrayNumeros.adicionarNumero(numeros, 9);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(numeros);

        try {
            ManipularArrayNumeros.adicionarNumero(numeros, 9);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            ManipularArrayNumeros.removerNumero(numeros, 3);
            ManipularArrayNumeros.removerNumero(numeros, 9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(numeros);

        try {
            ManipularArrayNumeros.removerNumero(numeros, 9);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        ManipularArrayNumeros.substituirNumero(numeros, 3, 5);

        System.out.println(numeros);

        ManipularArrayNumeros.substituirNumero(numeros, 5, 3);

        System.out.println(numeros);
    }
}