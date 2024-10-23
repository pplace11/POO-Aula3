package aula4;

public class ex5 {
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(contagem(v));
    }
    public static int contagem(int[] v){
        int count = 0;
        for(int i = 0; i < v.length; i++){
            if(v[i] % 2 == 0){
                count += 1;
                System.out.println(v[i]);
            }
        }
        return count;
    }
}
