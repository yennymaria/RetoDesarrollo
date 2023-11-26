import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PrimerReto primer = new PrimerReto();
        SegundoReto segundo = new SegundoReto();
        TercerReto tercer = new TercerReto();
        int s = 5;
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(150,567,953,40));

        primer.cambiarPosiciones(numeros,s);
        System.out.println(primer.getInvertidos());

        //segundo.cuadrados(numeros,s);
        //System.out.println(segundo.getCuadrados());

        //tercer.buscarMinimoCambio(numeros);
        //System.out.println(tercer.getMinCambio());
    }
}