package academy.devdojo.maratonajava.introducao;

public class Aula05Exercicio {
    public static void main(String[] args) {
        double salario = 44;
        double taxa = 0;
        if (salario <= 34712) {
            taxa = 9.70;
        } else if (salario >= 34713 && salario <= 68507){
            taxa = 37.35;
        } else {
            taxa = 49.50;
        }

        System.out.println(taxa);
    }
}
