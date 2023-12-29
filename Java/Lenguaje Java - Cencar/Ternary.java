public class Ternary {
    public static void main(String[] args) {
        int a = 42;
        int b = 2;
        int c = 99;
        int d = 0;
        int e = (b == 0) ? 0 : ( a / b );
        int f = (d == 0) ? 0 : ( c / d );

        // La sintaxis del operador ?: es
        // expresion ? accion1 : accion2
        // de modo que si la expresion es verdadera entonces se realiza
        // la primera accion, de otro modo la segunda, la limitacion es que
        // accion1 y accion2 deben devolver el mismo valor que no uede ser void.

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("a / b = " + e);
        System.out.println("c / d = " + f);

    }
    
}
