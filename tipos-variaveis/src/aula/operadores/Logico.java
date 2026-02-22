package aula.operadores;

public class Logico {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2)
            System.out.println("Valores verdadeiros");
        else System.out.println("Nada para imprimir");

        if (condicao1 || condicao2)
            System.out.println("Um dos valores é verdadeiro");
        else System.out.println("Nenhum dos valores é verdadeiro");
    }
}
