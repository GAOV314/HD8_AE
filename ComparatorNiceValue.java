import java.util.Comparator;

/**
 * Clase para representar la comparacion de niceValue's para Heap
 * @author ocana
 * @author marcos
 * @since 9/04/24
 */
public class ComparatorNiceValue implements Comparator<Integer>{

    /**
     * Calcula el priority value del nice value
     * @param niceValue
     * @return
     */
    public static int calculatePriorityValue(int niceValue){
        int priorityValue = (20+niceValue);
        return priorityValue;
    }

    /**
     * Compara los valores de los nice values de dos objetos tipo process
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Integer o1, Integer o2) {
        int pValue1 = calculatePriorityValue(o1);
        int pValue2 = calculatePriorityValue(o2);

        if(pValue1>pValue2)
            return -1;
        else if(pValue1<pValue2){
            return 1;
        }else return 0;
    }
}

