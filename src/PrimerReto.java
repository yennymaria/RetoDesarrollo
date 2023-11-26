import java.util.ArrayList;

public class PrimerReto {
    ArrayList<Integer> invertidos;
    public PrimerReto() {
        invertidos = new ArrayList<>();
    }
    public void cambiarPosiciones(ArrayList<Integer> numeros, int s) {
        String rango = String.format("[%s-%d]", String.valueOf(s), 9);
        for (int i = 0; i < numeros.size(); i++) {
            String numero = String.valueOf(numeros.get(i));
            numero = numero.replaceAll(rango, "");
            if(!numero.isEmpty()){
                numeros.set(i,Integer.parseInt(numero));
            }else{
                numeros.remove(i);
                i--;
            }

        }
        invertir(numeros);
    }
    public void invertir(ArrayList<Integer> lista){
        for(int i=lista.size()-1;i>=0;i--){
            this.invertidos.add(lista.get(i));
        }
    }
    public ArrayList<Integer> getInvertidos(){
        return this.invertidos;
    }
}
