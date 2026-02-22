package aula.operadores;

public class Soma {
    public static void main(String[] args){

        int  a, b, c, d;

        a = 1;
        b = 2;
        c = 3;
        d = 4;

        System.out.println(a + b + c + d);
        String resultado;

        if (a > b)
            resultado = "A maior que B";
        else
            resultado = "A não é maior que B";

        System.out.println(resultado);       

    }
}
