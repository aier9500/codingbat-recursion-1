/** 
 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
 * factorial(1) → 1
 * factorial(2) → 2
 * factorial(3) → 6
 */

public class S26Recursion3_WuE { 

    public int factorial(int n) {
        
        if (n == 1) return n;
        
        else return n * factorial(n - 1);
    }

    public int bunnyEars(int bunnies) {

        if (bunnies == 0) return 0; 

        else return 2 + bunnyEars(bunnies - 1);
    }

    public int fibonacci(int n) {

        if (n == 0) return 0; 
        
        else if (n == 2 || n == 1) return 1; 

        else return (fibonacci(n - 1) + fibonacci(n - 2));
    }

    public int bunnyEars2(int bunnies) {
        
        if (bunnies == 0) return 0; 

        else if (bunnies % 2 == 0) return bunnyEars2(bunnies - 1) + 3; 

        else return bunnyEars2(bunnies - 1) + 2; 
    }

    public int triangle(int rows) {

        if (rows == 0) return 0; 

        else return triangle(rows - 1) + rows;
    }

    public int sumDigits(int n) {

        if (n < 10) return n;

        else return sumDigits(n % 10) + sumDigits(n / 10) ;
    }

    public int count7(int n) {

        if (n < 7) return 0; 

        else if (n % 10 != 7) return count7(n / 10); 

        else return (count7(n / 10) + 1); 
    }

    public int count8(int n) {

        if (n < 8) return 0; 

        else if (n % 10 != 8) return count8(n /10); 

        else if (n % 100 == 88) return (count8(n / 10) + 2);

        else return (count8(n / 10) + 1);
    }

    public int powerN(int base, int n) {
        
        if (n == 0) return 1; 

        else if (n == 1) return base; 

        else return base * powerN(base, n - 1);
    }
    
    public int countX(String str) {

        if (str.length() == 0) return 0; 

        else if (str.length() == 1) {

            if (str.charAt(0) == 'x') return 1; 

            else return 0; 
        }

        else if (str.charAt(1) == 'x') return 1 + countX(str.substring(1, str.length())); 

        else return countX(str.substring(1, str.length())); 
    }    
}


class Tester {

    public static void main(String[] args) {
        
        S26Recursion3_WuE obj = new S26Recursion3_WuE(); 
        
        int fact = obj.factorial(6); 
        System.out.println(fact);

        int bun = obj.bunnyEars(28);
        System.out.println(bun);

        int fib = obj.fibonacci(5);
        System.out.println(fib);

        int sumD = obj.sumDigits(12345);
        System.out.println(sumD);
        
    }
}