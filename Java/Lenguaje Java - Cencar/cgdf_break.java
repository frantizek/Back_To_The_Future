class cgdf_break {
    public static void main(String[] args) {
        boolean t =true;
    a:  {
    b:      {
    c:          {
                    System.out.println("Antes del break.");
                    if (t) break b;
                    System.out.println("Esto no se ejecutara.");
                }
                System.out.println("Esto tampoco se ejecutara.");
            }
            System.out.println("Esto se ejecuta despues de b.");
        }
    }
}
