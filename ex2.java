package aula4;

public class ex2 {
    public static void main(String[] args) {
        int[] d2 = {1, 2, 3, 4, 5};
        System.out.println(media(d2));
    }
    public static int media(int[] v){
        int soma = 0;
        int media1 = 0;
        for(int i=0; i<v.length; i++){
        soma = soma + v[i];
    }
    media1 = soma/v.length;
    return media1;
}
}