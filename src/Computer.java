/**
 * Clase computer que represanta a ordenadores en general
 * @author Manuel Molino && Encarni Muñoz
 * @version 1.0.0
 */
public class Computer {
    private int ram;
    private float cpu;
    private String motherBoard;

    public Computer(int ram, float cpu, String motherBoard) {
        this.ram = ram;
        this.cpu = cpu;
        this.motherBoard = motherBoard;
    }

    /*Setter de la ram*/
    public void setRam(int ram) {
        this.ram = ram;
    }
    /*Setter de cpu
    * */
    public void setCpu(float cpu) {
        this.cpu = cpu;
    }
    /* Setter del MotherBoard
    * */
    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }
    /**
     * Getter para Ram*/
    public int getRam() {
        return ram;
    }
    /**
     * Getter para cpu*/
    public float getCpu() {
        return cpu;
    }
    /**
     * Getter para MotherBoard*/
    public String getMotherBoard() {
        return motherBoard;
    }
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
