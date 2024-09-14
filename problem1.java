public class problem1{
    
    public static double pow(double x, int n){
       
        if(n == 0){
            return 1.0;
        }

        if(n < 0){
            x = 1 / x;
            n -= n;
        }

        return pow(x,n);
    }

    private static double power(double x, int n){

        if(n == 0){
            return 1.0;
        }

        double half = power(x, n/2);
        if(n % 2 == 0){
            return half * half;
        }
        else{
            return half * half * x;
        }
    }

    public static void main(String[] args){
        double x1 = 2.0;
        int n1 = 10;

        double solution = power(x1, n1);

        System.out.println(x1 + "^" + n1 + " = " + solution);

    }

}