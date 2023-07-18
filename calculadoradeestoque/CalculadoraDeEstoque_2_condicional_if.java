package calculadoradeestoque;

public class CalculadoraDeEstoque_2_condicional_if {
    public static void main(String[] args) {
        double livroJava8 = 59.90;
        double livroTDD = 59.90;

        double soma = livroJava8 + livroTDD;

        System.out.println("O total em estoque é: " + soma);

        if (soma < 150) {
            System.out.println("Seu estoque está muito baixo!");
        }else {
            System.out.println("Seu estoque está muito bom.");
        }
    }
}
