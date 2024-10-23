package aula4;

public class ex3 {
    public static void main(String[] args) {
        int[] d3 = {1, 2, 3, 4, 5, 6, 7, 8};
        maior(d3);
    }
    public static void maior(int[] d3){
        int maximo = d3[0];
        int minimo = d3[0];
        for(int i=0; i<d3.length; i++){
            if(d3[i]>maximo){
                maximo = d3[i];
            }
            if(d3[i]<minimo){
                minimo = d3[i];
            }
        }
        System.out.print("O maximo é " + maximo + " e o minimo é " + minimo);
    }
}
