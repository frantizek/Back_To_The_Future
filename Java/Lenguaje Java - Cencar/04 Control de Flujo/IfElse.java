/**
 * IfElse
 */
class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;

        if (month == 12 || month == 1 || month == 2){
            season = "invierno";
        } else if (month == 3 || month == 4 || month == 5){
            season = "primavera";
        } else if (month == 6 || month == 7 || month == 8){
            season = "verano";
        } else if (month == 9 || month == 10 || month == 11){
            season = "otoño";
        } else {
            season = "mes desconocido";
        }

        System.out.println("Abril esta en "+season+".");
    }
}
