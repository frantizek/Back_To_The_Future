/**
 * MiClase
 * 
 * El operador punto (.)
 * Se utiliza para acceder a las variables de intancia 
 * y los metodos contenidos en un objeto.
 */
class Point{
    int x;
    int y;
}

class MiClase {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        p1.x = 10;
        p1.y = 20;

        p2.x = 42;
        p2.y = 99;

        System.out.println("x[1] = " + p1.x + " y[1] = " + p1.y );
        System.out.println("x[2] = " + p2.x + " y[2] = " + p2.y );
    }
    
}
