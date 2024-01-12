/**
 * ClaseEjemplo_101
 * Super 
 * Es una variable especial que nos permite referirnos a los constructores de la 
 * superclase o hacer referencias a metodos del padre.
 */

class ClaseEjemplo_101 extends ClaseEjemplo_004 {
    int var3;
    ClaseEjemplo_101(int var1, int var2, int var3){
        super(var1, var2);
        this.var3 = var3;
    }
    public static void main(String[] args) {
        ClaseEjemplo_101 m = new ClaseEjemplo_101(5,10,15);
        System.out.println("var1 = " + m.var1 + " var2 = " + m.var2 + " var3 = " + m.var3);
    }
}
