// Identity Matrix diagonal matrix
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();
        int columns = 5;
        for(int y = 0; y < columns; y++) {
            ArrayList<Integer> linha = new ArrayList<>();
            for (int x = 0; x < columns; x++) {
                if (y == x)
                    linha.add(1);
                else
                    linha.add(0);
            }
            matriz.add(linha);
        }
        System.out.println(matriz);
        for(int y = 0; y < columns; y++){
            for(int x = 0; x < columns; x++) {
                if(matriz.get(y).get(x)> 10){
                    System.out.println("x: " + x +" ,y: " + y);
                }
            }
        }
    }
}
