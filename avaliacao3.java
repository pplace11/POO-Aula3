package aula4;

public class avaliacao3 {
    public static void main(String[] args) {
        double[] v = {10, 13, 8, 3, 17, 14, 20, 11, 9, 12};
        max(v);
        System.out.println("A media é " + media(v));
    }
    public static void max(double[] v){
        double Aprovado = 0;
        double reprovado =0;
        for(int i=0; i<v.length; i++){
            if(v[i]>=10){
               Aprovado++;
            }
            if(v[i]<10){
               reprovado++;
            }
        }
        System.out.println("O número de aprovado é " + Aprovado + " e o número de reprovado é " + reprovado);
    }
    public static double media(double[] v){
        double soma = 0;
        double media1 = 0;
        for(int i=0; i<v.length; i++){
            soma = soma + v[i];
        }
        media1 = soma/v.length;
        return media1;
    }
}
