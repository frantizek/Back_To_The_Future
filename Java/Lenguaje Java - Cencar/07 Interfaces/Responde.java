/**
 * Responde
 */
import java.util.Random;
interface ConstantesCompartidas{
    int NO    = 0;
    int YES   = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON  = 4;
    int NEVER = 5;
}

class Cuestionar implements ConstantesCompartidas{
    Random rand = new Random();
    int pregunta(){
        int prob = (int)(100 * rand.nextDouble());
        if (prob<30)
            return NO; // 30%
        else if (prob<60)
            return YES; //30%
        else if (prob<75)
            return LATER; //15%
        else if (prob<98)
            return SOON; //13%
        else 
            return NEVER; // 2%
    }
}

class Responde implements ConstantesCompartidas{
    static void respuesta(int result){
        switch(result){
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Si");
                break;
            case MAYBE:
                System.out.println("Quiza");
                break;
            case LATER:
                System.out.println("Despues");
                break;
            case SOON:
                System.out.println("Pronto");
                break;
            case NEVER:
                System.out.println("Nunca");
                break;                
        }
    }


    public static void main(String args[]){
        Cuestionar q = new Cuestionar();
        respuesta(q.pregunta());
        respuesta(q.pregunta());
        respuesta(q.pregunta());
        respuesta(q.pregunta());
    }
}