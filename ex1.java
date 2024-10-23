package aula4;

public class ex1 {
    public static void main(String[] args) {
        int[] d1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(somar(d1));
    } 
    public static int somar(int[] v){
        int soma = 0;
        for(int i=0; i<v.length; i++){
            soma += v[i];
        }
        return soma;
    }
}
