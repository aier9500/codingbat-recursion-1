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

    public int countHi(String str) {
        
        if (str.length() < 2) return 0; 

        else if (str.length() > 2) { 
            
            if (str.substring(0, 2).equals("hi")) return 1 + countHi(str.substring(1, str.length()));

            else return countHi(str.substring(1, str.length()));
        }
        
        else if (str.equals("hi")) return 1; 

        else return 0; 
    }      

    public String changeXY(String str) {
        
        if (str.length() == 0) return "";

        else if (str.length() > 1 && str.substring(0, 1).equals("x")) return "y" + changeXY(str.substring(1, str.length())); 

        else if (str.length() > 1) return str.substring(0, 1) + changeXY(str.substring(1, str.length())); 

        else if (str.substring(0, 1).equals("x")) return "y"; 

        else return str.substring(0, 1); 
    }    
    
    public String changePi(String str) {

        if (str.length() < 2) return str; 

        else if (str.substring(0, 2).equals("pi")) return "3.14" + changePi(str.substring(2));

        else return str.substring(0, 1) + changePi(str.substring(1)); 
    }    

    public String noX(String str) {

        if (str.length() == 0) return ""; 

        else if (str.length() == 1 && str.substring(0, 1).equals("x")) return ""; 

        else if (str.length() == 1) return str; 

        else if (str.substring(0, 1).equals("x")) return noX(str.substring(1));

        else return str.substring(0, 1) + noX(str.substring(1));
    }

    public boolean array6(int[] nums, int index) {
        
        if (nums.length == index) return false; 

        else if (nums[index] == 6) return true; 

        else return array6(nums, index + 1);
    }

    public int array11(int[] nums, int index) {

        if (nums.length == index) return 0; 

        else if (nums[index] == 11) return 1 + array11(nums, index + 1); 

        else return 0 + array11(nums, index + 1); 
    }
    
    public boolean array220(int[] nums, int index) {

        if (nums.length - index < 2) return false; 

        else if (nums[index] * 10 == nums[index + 1]) return true; 

        else return array220(nums, index + 1); 
    }    

    public String allStar(String str) {

        if (str.length() == 0) return ""; 

        else if (str.length() > 1) return str.substring(0, 1) + "*" + allStar(str.substring(1)); 

        else return str; 
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

        int[] arr = {1 ,2 ,3 ,4 ,5 ,6}; 
        boolean six = obj.array6(arr, 0);
        System.out.println(six); 
    }
}