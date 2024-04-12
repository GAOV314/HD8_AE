import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

/**
 * Clase main en la cual se lee el archivo y se
 * hace uso del heap y PQ de JCF
 * @author ocana
 * @author marcos
 * @since 9/04/24
 */
public class MainProcces {
    public static void main(String[] args) {
        //Comparator para estructura Heap
        ComparatorNiceValue priorityComparator = new ComparatorNiceValue();
        //Creacion del priority queue del java collection framework
        PriorityQueue<Process> pqProcess = new PriorityQueue<>();
        //Instanacia del heap el cual usa el ComparatorNiceValue
        HeapUsingIterativeBinaryTree<Integer,Process> heapPriority = new HeapUsingIterativeBinaryTree<>(priorityComparator);
        //Se lee el archivo
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\Documentos UVG\\procesos.txt"))){//Cambiar el path del archivo procesos.txt para que funcione (Pasar path completo)
            String line;
            while ((line = br.readLine()) != null) {
                String[] components = line.split(",");
                //Se crean procesos para heap y Pq Y se llenan
                Process process1 = new Process(components[0],components[1],(Integer.parseInt(components[2])));
                heapPriority.Insert(process1.getNiceValue(), process1);
                Process process2 = new Process(components[0],components[1],(Integer.parseInt(components[2])));
                pqProcess.add(process2);
            }
        } catch(IOException e) {
            e.printStackTrace();

        }
        //Se elimina el primer valor con mayor prioridad y se muestra para heap y PQ JCF
        System.out.println("\nPROCESOS CON ITERATIVE HEAP TREE");
        System.out.println("\nRetirando procesos...");
        System.out.println("Primer proceso: "+heapPriority.remove().toString());
        System.out.println("Segundo proceso: "+heapPriority.remove().toString());
        System.out.println("Tercer proceso: "+heapPriority.remove().toString());
        System.out.println("Cuarto proceso: "+heapPriority.remove().toString()+"\n");

        System.out.println("PROCESOS CON JCF PRIORITY QUEUE");
        System.out.println("\nPrimer proceso: "+pqProcess.poll().toString());
        System.out.println("Segundo proceso: "+pqProcess.poll().toString());
        System.out.println("Tercero proceso: "+pqProcess.poll().toString());
        System.out.println("Cuarto proceso: "+pqProcess.poll().toString());
    }

}