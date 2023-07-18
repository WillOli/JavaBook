package calculadoradeestoque;

public class CalculadoraDeEstoque_3_if_else_if {
    public static void main(String[] args) {
        double livroJava8 = 59.90;
        double livroTDD = 59.90;

        double soma = livroJava8 + livroTDD;

        System.out.println("O Total em estoque é " + soma);

        if (soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        } else if (soma >= 2000) {
            System.out.println("Seu estoque está muito baixo!");
        }else {
            System.out.println("Seu estoque está bom!");
        }

    }
}
