package aula4;

public class ex9 {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(sum(m));
    }
    public static int sum(int[][] m){
        int sum = 0;
        for(int i=0; i!=m.length; i++){
            for(int j=0; j!=m[i].length; j++){
                sum += m[i][j];
            }
        }
        return sum;
    }
}
