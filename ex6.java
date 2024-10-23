package aula4;

import java.util.Arrays;

public class ex6 {
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(funcao(v)));
    }
    public static int[] funcao(int[] v){
        int j = 0;
        int[] ordenada = new int[v.length];
        for(int i=v.length-1; i>=0; i--){
            ordenada [j] = v[i];
            j++;
        }
        return ordenada;
    }
}
