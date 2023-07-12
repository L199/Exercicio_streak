import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas =Dados.getPessoas();

       
       // Listar todas as pessoas
        System.out.println("Todas as pessoas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // Listar as 10 primeiras pessoas
        System.out.println("\nAs 10 primeiras pessoas:");
        for (int i = 0; i < 10 && i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i));
        }

        // Listar as pessoas que são do Brasil
        System.out.println("\nPessoas do Brasil:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getPais().equalsIgnoreCase("Brazil")) {
                System.out.println(pessoa);
            }
        }

        // Listar as pessoas do Brasil com o nome em Uppercase e suas idades
        System.out.println("\nPessoas do Brasil com nome em Uppercase e suas idades:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getPais().equalsIgnoreCase("Brazil")) {
                String nomeMaiusculo = pessoa.getNome().toUpperCase();
                int idade = pessoa.getIdade();
                System.out.println(nomeMaiusculo + ": " + idade);
            }
        }

        // Listar as pessoas que são do Brasil, em ordem de nome
        System.out.println("\nPessoas do Brasil em ordem de nome:");
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa pessoa = pessoas.get(i);
            if (pessoa.getPais().equalsIgnoreCase("Brazil")) {
                System.out.println(pessoa);
            }
        }

        // Listar as pessoas que são do Brasil, em ordem de idade
        System.out.println("\nPessoas do Brasil em ordem de idade:");
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa pessoa = pessoas.get(i);
            if (pessoa.getPais().equalsIgnoreCase("Brazil")) {
                System.out.println(pessoa);
            }
        }

        // Contar quantas pessoas têm mais de 45 anos
        int contador = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() > 45) {
                contador++;
            }
        }
        System.out.println("\nNúmero de pessoas com mais de 45 anos: " + contador);

        // Calcular a média de idade das pessoas
        int somaIdades = 0;
        for (Pessoa pessoa : pessoas) {
            somaIdades += pessoa.getIdade();
        }
        double mediaIdade = (double) somaIdades / pessoas.size();
        System.out.println("\nMédia de idade das pessoas: " + mediaIdade);
    }

    
    }
    
    

