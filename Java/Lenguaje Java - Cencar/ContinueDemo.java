/**
 * ContinueDemo
 */
class ContinueDemo {
    
    public static void main(String[] args) {
        for(int o = 0; o < 10; o++){
            System.out.println(o + " ");
            if (o % 2 == 0)
                continue;
            System.out.println("");
        }
    }
}
