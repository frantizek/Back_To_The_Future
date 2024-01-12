
class Punto{
    int x, y;
    Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    double distancia(int x, int y){
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    double distancia(Punto p){
        return distancia(p.x, p.y);
    }
}

class Punto3D extends Punto{
    int z;
    Punto3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    double distancia(int x, int y, int z){
        int dx = this.x - x;
        int dy = this.y - y;
        int dz = this.z - z;
        return Math.sqrt(dx*dx+dy*dy+dz*dz);
    }
    double distancia(Punto3D otro){
        return distancia(otro.x, otro.y, otro.z);
    }
    double distancia(int x, int y){
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx*dx+dy*dy);
    }
}

class Punto3DDist{
    public static void main(String args[]){
        Punto3D p1 = new Punto3D(30, 40, 10);
        Punto3D p2 = new Punto3D(0, 0, 0);
        Punto p = new Punto(4,6);
        System.out.println("p1 = "+ p1.x + "," + p1.y+ "," + p1.z);
        System.out.println("p2 = "+ p2.x + "," + p2.y+ "," + p2.z);
        System.out.println("p = "+ p.x + "," + p.y);
        System.out.println("p1.distancia(p2) = "+ p1.distancia(p2));
        System.out.println("p1.distancia(44,44) = "+ p1.distancia(44,44));
        System.out.println("p1.distancia(p) = "+ p1.distancia(p));
    }
}

