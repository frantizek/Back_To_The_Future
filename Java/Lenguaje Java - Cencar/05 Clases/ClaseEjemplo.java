/**
 * ClaseEjemplo
 */
class ClaseEjemplo{
    
    int var1, var2;
    
    ClaseEjemplo(int var1, int var2){
        this.var1 = var1;
        this.var2 = var2;
    }
    
    public static void main(String[] args) {
        ClaseEjemplo m = new ClaseEjemplo(5,10);
        System.out.println("var1 = " + m.var1 + " var2 = " + m.var2);
    }
}