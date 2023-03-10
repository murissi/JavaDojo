package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se salario > 5000;
        double salario = 3000;
        String mensagemDoar = "Doar 50 reais";
        String mensagemNaoDoar = "Sem condições de doar";
//        if (salario > 5000) {
//            resultado = mensagemDoar;
//        } else {
//            resultado = mensagemNaoDoar;
//        }

        // Operador ternario
        // (condicao) ? verdadeiro : falso

        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        // Operador ternario com mais de duas saidas nao indicado
        int idade = 44;
        String categoria = idade <= 12 ? "Criança" : idade > 13 && idade <= 18 ? "Adolescente" : "Adulto";
        System.out.println(categoria);

        // Salario

    }
}
