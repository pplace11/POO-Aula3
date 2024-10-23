package aula4;

public class ex8 {
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {6, 7, 8, 9, 10};
        int[] f = soma(v1, v2);
        for(int num : f){
            System.out.println(num + " ");
        }
    }
    public static int[] soma(int[] v1, int[] v2){
        int[] resultado = new int[v1.length];
        for (int i=0; i<v1.length; i++){
            resultado[i] = v1[i] + v2[i];
        }
        return resultado;
    }
}
