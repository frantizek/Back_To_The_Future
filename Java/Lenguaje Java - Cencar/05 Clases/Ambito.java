/**
 * Ambito
*/
class Ambito {
    int i = 1;      // ambito exterior
    {               // crea un nuevo ambito
        int i = 2;  // error de compilacion
    }

}
