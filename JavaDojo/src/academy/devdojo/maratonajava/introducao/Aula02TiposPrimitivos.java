package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // Tipos primitivos
        // int, double, float, char, byte, short, long, boolean
        int idadeDoPai = 22;
        System.out.println(idadeDoPai);
        System.out.printf("Idade do pai: %d%n", idadeDoPai);

        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroLongo = 1000000L;
        char caractere = 65;

        System.out.println(verdadeiro);
        System.out.println("char " + caractere);

        // Cast
        int idade = (int) 100000000000L;
        System.out.println(idade);

        // String é uma classe
        String nome = "Lucas Vinicius";
        System.out.println(nome);

        System.out.println("Meu nome é " + nome);


    }
}
