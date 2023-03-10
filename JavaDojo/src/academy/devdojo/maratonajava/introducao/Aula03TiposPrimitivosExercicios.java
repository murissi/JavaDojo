package academy.devdojo.maratonajava.introducao;
/**
 * Java Fundamental
 * @author: Lucas
 */

import java.util.Date;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Lucas";
        Integer endereco = 13;
        Double salario = 2000.0;
        String data = "23/08/2023";

        System.out.printf("Eu %s morando no endereço %d" +
                        " confirmo que recebi o sálario de R$ %.2f, na" +
                        "data de: %s%n",
                nome,
                endereco,
                salario,
                data);
    }
}
