/**
 * ReturnDemo
 */
class ReturnDemo {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("Antes del return.");
        if (t)
            return;
        System.out.println("Esto no se ejecutara.");
    }
}
