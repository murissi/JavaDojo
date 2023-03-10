package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo;
        byte dia = 1;
        String mensagem;
        switch (dia) {
            case 1:
                mensagem = "Domingo";
                break;
            case 2:
                mensagem = "Segunda";
                break;
            case 3:
                mensagem = "Terça";
                break;

            default:
                mensagem = "Dia invalido";

        }

        System.out.println(mensagem);
    }
}
