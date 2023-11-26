import java.util.ArrayList;
import java.util.Collections;

public class TercerReto {
    int minCambio;

    public TercerReto(){
        minCambio = 0 ;
    }

    public void buscarMinimoCambio(ArrayList<Integer> numeros){
        boolean existe = true;
        int valor = 0;
        Collections.sort(numeros);

        while(existe){
            int suma = 0;
            for (int i = numeros.size()-1; i >=0; i--){
                if (numeros.get(i) <= valor ){
                    if(suma + numeros.get(i) <= valor){
                        suma += numeros.get(i);
                    }
                }
            }
            if (suma < valor){
                existe = false;
                this.minCambio = valor;
            }
            valor++;
        }
    }

    public int getMinCambio(){
        return this.minCambio;
    }
}
