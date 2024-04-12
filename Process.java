/**
 * Clase que representa los procesos e implementa Comparble
 * @author ocana
 * @author marcos
 * @since 9/04/24
 */
public class Process implements Comparable<Process>{
    //Atributos
    private String nameProcess;
    private String user;
    private int niceValue;

    /**
     *Contructor para objetos de tipo Process
     * @param nameProcess
     * @param user
     * @param niceValue
     */
    public Process(String nameProcess, String user, int niceValue) {
        this.nameProcess = nameProcess;
        this.user = user;
        this.niceValue = niceValue;

    }

    /**
     * Constructor para uso del priorityqueue JCF
     */
    public Process(){

    }

    /**
     * Retorna el valor del atributo nameProcess
     * @return
     */
    public String getNameProcess() {
        return nameProcess;
    }

    /**
     *Cambia el valor del atributo nameProcess
     * @param nameProcess
     */
    public void setNameProcess(String nameProcess) {
        this.nameProcess = nameProcess;
    }

    /**
     * Obtiene el valor del atributo user
     * @return
     */
    public String getUser() {
        return user;
    }

    /**
     * Cambia el valor del atributo user
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Retorna el atributo niceValue
     * @return
     */
    public int getNiceValue() {
        return niceValue;
    }

    /**
     * Cambia el valor del atributo niceValue
     * @param niceValue
     */
    public void setNiceValue(int niceValue) {
        this.niceValue = niceValue;
    }

    /**
     * Muestra los atributos del objeto
     * @return
     */
    @Override
    public String toString() {
        return '['+ user+","+nameProcess+","+niceValue+']';

    }

    /**
     * Implementacion del comparable
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Process o) {
        int priorityValue1 = this.niceValue + 20;
        int otherPriorityValue1 = o.getNiceValue() + 20;
        if(priorityValue1>otherPriorityValue1){
            return 1;
        } else if (priorityValue1==otherPriorityValue1) {
            return 0;
        }else{
            return -1;
        }
    }
}
