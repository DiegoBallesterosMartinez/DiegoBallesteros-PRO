import java.util.Enumeration;
import java.util.Hashtable;

public class garaje_hashtable {

    private Hashtable<String, Object[]> listaCoches;

    public void agregarCoche() {
        Object[] coche1 = {"1234A", "Mercedez", "ClaseA", 10000, 150};
        Object[] coche2 = {"1234A", "Mercedez", "ClaseB", 20000, 200};
        Object[] coche3 = {"1234A", "Mercedez", "ClaseC", 30000, 250};
        Object[] coche4 = {"1234A", "Mercedez", "ClaseD", 45000, 300};
        listaCoches.put(String.valueOf(coche1[0]), coche1);

    }

    public void getCoche(String matricula) {
        if (listaCoches.contains(matricula)) {


            Object[] cocheEncontrado = listaCoches.get(matricula); // -> null
            System.out.println(cocheEncontrado[2].toString());
        }
    }

    public void borrarCoche(String matricula) {
        listaCoches.remove(matricula);

    }

    public void modificarCoche(String matricula) {
        Object[] coche = listaCoches.get(matricula);
        coche[3] = Integer.valueOf(coche[3].toString()) + 20000;
    }

    public void recorrerCochesKey() {
        Enumeration<String> keys = listaCoches.keys();
        while (keys.hasMoreElements()){
            String key = keys.nextElement();
            getCoche(key);
        }

    }
    public void recorrerCochesElement(){
        Enumeration<String> keys = listaCoches.keys();
        while (keys.hasMoreElements()){
            String key = keys.nextElement();
            getCoche(key);
        }
    }
}
