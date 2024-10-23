package aula4;

public class ex7 {
    public static void main(String[] args) {
        double[] v = {1, 2, 3, 4, 5, 6};
        double escalar = 3;
        double[] d = multiplica(v, escalar);
        for (double num : d){
            System.out.println(num + " ");
        }

    }
    public static double[] multiplica(double[] v, double escalar){
        for(int i=0; i<v.length; i++){
            if(v[i] * 3==0){
                v[i] *= escalar;
            }
        }
        return v;
    }
}
