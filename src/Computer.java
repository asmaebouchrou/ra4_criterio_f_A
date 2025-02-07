/**
 * Clase computer que represanta a ordenadores en general
 * @author Manuel Molino && Encarni Muñoz
 * @version 1.0.0
 */
public class Computer {
    private int ram;
    private float cpu;
    private String motherBoard;
    /**
     * Método toString que muestra los valores de cada una de las variables: ram, cpu, motherBoard*/
    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", cpu=" + cpu +
                ", motherBoard='" + motherBoard + '\'' +
                '}';
    }
}
