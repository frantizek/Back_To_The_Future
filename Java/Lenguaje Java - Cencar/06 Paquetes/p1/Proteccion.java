package p1;
/**
* Proteccion 
 */
public class Proteccion {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    // private protected int n_pripro = 4;
    public int n_pub = 5;
    public Proteccion(){
        System.out.println("Constructor base");
        System.out.println("n        = " + n);
        System.out.println("n_pri    = " + n_pri);
        System.out.println("n_pro    = " + n_pro);
        // System.out.println("n_pripro = " + n_pripro);
        System.out.println("n_pub    = " + n_pub);
    }
}
/**
* derivada 
 */
class derivada extends Proteccion{
    derivada(){
        System.out.println("Constructor derivado");
        System.out.println("n        = " + n);
        // Solo desde la clase
        //System.out.println("n_pri    = " + n_pri);
        System.out.println("n_pro    = " + n_pro);
        // System.out.println("n_pripro = " + n_pripro);
        System.out.println("n_pub    = " + n_pub);
    }
}

/**
* mismopaquete 
 */
class mismopaquete  {
    mismopaquete(){
        Proteccion p = new Proteccion();
        System.out.println("Constructor del mismo paquete");
        System.out.println("n        = " + p.n);
        // Solo desde la clase
        //System.out.println("n_pri    = " + p.n_pri);
        System.out.println("n_pro    = " + p.n_pro);
        // Solo desde la clase o subclase
        //System.out.println("n_pripro = " + p.n_pripro);
        System.out.println("n_pub    = " + p.n_pub);
    }
    
}