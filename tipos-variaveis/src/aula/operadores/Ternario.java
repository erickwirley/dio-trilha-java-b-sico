package aula.operadores;

public class Ternario {
    public static void main(String[] args) {
        int a, b, c;
        String nome1, nome2;

        a = 1;
        b = 2;
        c = 3;
        nome1 = "Erick";
        nome2 = "Erick";

        String resultado1 = (a==b) ? "Verdadeiro" : "Falso";
        String resultado2 = (nome1 != nome2) ? "Nome Completo" : "Nome repetido";
        String resultado3 = (a != b) ? "verdadeiro" : "falso";

        System.out.println(resultado1);
        System.out.println(resultado2);

       
        if (resultado3 == "verdadeiro" )
            resultado3 = "a + b";
        else resultado3 = "0";

        System.out.println(resultado3);

    }
}
