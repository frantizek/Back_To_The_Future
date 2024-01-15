/**
 * EjemploFinalize
 * 
 * Java no utiliza destructores como en C++, ya que tiene una forma de recoger automaticamente
 * todos los objetos que se salen del alcance. No obstante proporciona un metodo que, 
 * cuando se especifique en el codigo de la clase, el reciclador de memoria (garbage collector)
 * lo llamara.
 */

class EjemploFinalize {
    protected void finalize(){
        System.out.println("Metodo finalize llamado, lo que significa que el objeto ha sido destruido.");
    }
}
