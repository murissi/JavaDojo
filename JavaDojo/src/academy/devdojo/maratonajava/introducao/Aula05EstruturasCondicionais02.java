package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // Idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 12;
        String categoria;
        if (idade < 15) {
            categoria = "Categorial Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categorial Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
