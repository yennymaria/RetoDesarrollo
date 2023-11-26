import java.util.ArrayList;
public class SegundoReto {
    ArrayList<Integer> cuadrados;

    public SegundoReto(){
        cuadrados = new ArrayList<>();
    }
    public void cuadrados(ArrayList<Integer> enteros, int s){
        enteros = cambiarNegativos(enteros);
        mergeSort(enteros);
        //bubbleSort(enteros);
        for (Integer entero : enteros) {
            int cuadrado = (int) Math.pow(entero, 2);
            if (cuadrado <= Integer.parseInt(s + "" + s)) {
                cuadrados.add(cuadrado);
            }
        }
    }
    public ArrayList<Integer> cambiarNegativos(ArrayList<Integer> enteros){
        for (int i = 0; i < enteros.size();) {
            if (enteros.get(i) < 0) {
                enteros.set(i, (enteros.get(i)) * -1);
            } else {
                i++;
            }
        }
        return enteros;
    }
    public void mergeSort(ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return; // La lista ya está ordenada si tiene 0 o 1 elemento
        }

        int mitad = list.size() / 2;

        // Dividir la lista en dos mitades
        ArrayList<Integer> mitadIzquierda = new ArrayList<>(list.subList(0, mitad));
        ArrayList<Integer> mitadDerecha = new ArrayList<>(list.subList(mitad, list.size()));

        // Llamadas recursivas para ordenar las dos mitades
        mergeSort(mitadIzquierda);
        mergeSort(mitadDerecha);

        // Combinar las dos mitades ordenadas
        merge(list, mitadIzquierda, mitadDerecha);
    }

    private void merge(ArrayList<Integer> result, ArrayList<Integer> mitadIzquierda,
                              ArrayList<Integer> mitadDerecha) {

        int i = 0, j = 0, k = 0;
        // Combinar las dos mitades en la lista resultante
        while (i < mitadIzquierda.size() && j < mitadDerecha.size()) {
            if (mitadIzquierda.get(i) <= mitadDerecha.get(j)) {
                result.set(k++, mitadIzquierda.get(i++));
            } else {
                result.set(k++, mitadDerecha.get(j++));
            }
        }
        // Copiar los elementos restantes, si hay alguno, de mitadIzquierda
        while (i < mitadIzquierda.size()) {
            result.set(k++, mitadIzquierda.get(i++));
        }
        // Copiar los elementos restantes, si hay alguno, de mitadDerecha
        while (j < mitadDerecha.size()) {
            result.set(k++, mitadDerecha.get(j++));
        }
    }
    public ArrayList<Integer> getCuadrados(){
        return this.cuadrados;
    }

}
