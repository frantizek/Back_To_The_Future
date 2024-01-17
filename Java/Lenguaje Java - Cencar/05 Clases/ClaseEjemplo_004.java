/**
 * ClaseEjemplo_004
 * Sobrecarga de metodo.
 * La sobrecarga de metodo se utiliza para proporcionar a java un comportamiento
 * polimorfico y se define como la posibilidad de poder crear varios metodos con
 * el mismo nombre, pero con listas de parametros distintas.
 */
class ClaseEjemplo_004{
    
    int var1, var2;
    
    ClaseEjemplo_004(int var1, int var2){
        this.var1 = var1;
        this.var2 = var2;
    }

    ClaseEjemplo_004(){
        var1 = -1;
        var2 = -1;
    }
    
    public static void main(String[] args) {
        ClaseEjemplo_004 m = new ClaseEjemplo_004(5,10);
        ClaseEjemplo_004 n = new ClaseEjemplo_004();
        System.out.println("var1 = " + m.var1 + " var2 = " + m.var2);
        System.out.println("var1 = " + n.var1 + " var2 = " + n.var2);
    }
}
