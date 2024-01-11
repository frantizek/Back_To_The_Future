/**
 * ClaseEjemplo_003
 * Constructores
 * El constructor es un tipo especifico de metodo que siempre tiene el mismo nombre
 * que la clase, de modo que en lugar de utilizar el metodo inicial para la inicializacion
 * de las variables, esta accion se realiza en el constructor.
 */
class ClaseEjemplo_003{
    
    int var1, var2;
    
    ClaseEjemplo_003(int var1, int var2){
        this.var1 = var1;
        this.var2 = var2;
    }
    
    public static void main(String[] args) {
        ClaseEjemplo_003 m = new ClaseEjemplo_003(5,10);
        System.out.println("var1 = " + m.var1 + " var2 = " + m.var2);
    }
}
