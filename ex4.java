package aula4;

import java.util.Arrays;


public class ex4 {
    public static void main(String[] args) {
        int[] v = {-2, -1, 0, 1};
        System.out.println(Arrays.toString(negativo(v)));
    }
    public static int[] negativo(int[] v){
        for(int i=0; i<v.length; i++){
            if(v[i]<0){
                v[i] = 0;
            }
        }
        return v;
    }
}
