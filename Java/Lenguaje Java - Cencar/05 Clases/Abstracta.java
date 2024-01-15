abstract class A{
    abstract void muestra();
    void metodo(){
        System.out.println("Dentro del metodo de A.");
    }
}

class B extends A{
    void muestra(){
        System.out.println("Dentro del metodo muestra de B");
    }
}

class Abstracta {
    public static void main(String[] args) {
        A a = new B();
        a.muestra();
        a.metodo();
    }
}
