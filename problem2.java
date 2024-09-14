public class problem2{

    public static boolean isPowerOfTen(int n){
        // If n is less than or equal to 0, it connot be a power of 10
        if(n <= 0){
            return false;
        }

        // Keep dividing n by 10 as long as it is divisible by 10
        while (n % 10 == 0){
            n /= 10;
        }

        // After the loop, if n becomes 1, it means n was a power of ten
        return n == 1;
    }

    public static void main(String[] args){
        int n1 = 10;
        boolean sol = isPowerOfTen(n1);

        if(sol == true){
            System.out.println(sol + ": " + n1 + " is a power of 10.");
        }
        else{
            System.out.println(sol + ": " + n1 + " is not a power of 10.");
        }
        

    }






}