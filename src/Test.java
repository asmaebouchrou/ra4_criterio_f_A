/**
 * Clase test para testear la clase computer
 * @author Asmae Bouchrou
 * @version 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        /**
         * Creando estancias de computer con datos y testearlos*/
        Computer computer1 = new Computer(4,1000, "pepito");
        Computer computer2 = new Computer(16,28426, "pepe");
        System.out.println( computer1.toString());
        System.out.println( computer2.toString());
    }
}
