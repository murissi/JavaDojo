package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores

        // + - / *
        int n1 = 10;
        double n2 = 20;
        System.out.println(n1 - n2);
        double resultado = n1 + n2;
        System.out.println(n1 - n2);
        System.out.println(n2 / n1);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // logicos  < > <= >= != ==
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezDiferenteDez);

        // Operadores Logicos || && !
        System.out.println(10 >= 20 || 20 <= 10);
        System.out.println(!true);
        float salario = 3500F;
        int idade = 35;
        boolean isDentroDaLei = idade > 30 && salario > 4612;
        System.out.println("Dentro da lei" + isDentroDaLei);

        // ||
        double valorTotalContaCorrente = 200.0;
        double valorTotalContaPoupanca = 10000.0;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation ||
                valorTotalContaPoupanca > valorPlaystation;

        System.out.println(isPlaystationCincoCompravel);

        // Atribuicao
        // = += *= %= /=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador--; // depois de tudo ele retira 1
        ++contador; // ante de tudo ele adiciona 1
        --contador;

        System.out.println(contador);
    }
}
