import java.util.*;

public class Main {
    public static void main(String[] args) {
        arrayDeNomes();
        nomesPorGenero();
    }

    private static void arrayDeNomes() {
        System.out.println("******** 1ª parte - Lista Simples **********");
        Scanner scanner = new Scanner(System.in);
        String[] nomes;
        System.out.println("digite a sequencia de nomes: ");
        nomes = scanner.nextLine().split(",");


        ordenaLista(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }

    private static void nomesPorGenero() {
        System.out.println("******** 2ª parte - Lista com Genero **********");
        Scanner scanner = new Scanner(System.in);
        String[] nomes;
        String[] generoFeminino= new String[10];
        String[] generoMasculino = new String[10];


        System.out.println("digite uma sequencia de 5 nomes e seu respectivo genero(Feminino e Masculino): ");
        System.out.println("Exemplo (Flavia - Feminino, Romulo - Masculino): ");
        nomes = scanner.nextLine().split(",");

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].contains("Feminino")) {
               generoFeminino[i] = nomes[i];
            } else if (nomes[i].contains("Masculino")) {
                generoMasculino[i] = nomes[i];
            }

        }


        generoFeminino = retiraNull(generoFeminino);
        generoMasculino = retiraNull(generoMasculino);
        ordenaLista(generoFeminino);
        ordenaLista(generoMasculino);

        System.out.println("Lista Masculina: ");
        imprimiNome(generoMasculino);

        System.out.println("Lista Feminina: ");
        imprimiNome(generoFeminino);

    }


    public static String[] imprimiNome(String[] listaDeNome){
        for (String lista: listaDeNome) {
            System.out.println(lista);
        }
        return  listaDeNome;
    }

    public static String[] retiraNull(String[] nomes) {
        String[] n = new String[nomes.length];
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] == null) {
                n[i] = "x";
            } else {
                n[i] = nomes[i];
            }
        }
        return n;
    }

    public static String[] ordenaLista(String[] genero) {
        for (int i = 0; i < genero.length - 1; i++) {
            for (int j = i+1; j < genero.length; j++) {
                if ((genero[i].compareTo(genero[j]) > 0 )) {
                    String temp = genero[i];
                    genero[i] = genero[j];
                    genero[j] = temp;
                }
            }
        }
        return genero;
    }

}






