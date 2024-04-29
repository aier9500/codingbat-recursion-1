public class Test {
    public static void main(String[] args) {
        
        whatsItDo("WATCH");
        System.out.println(mystery(5));
    }

    public static void whatsItDo(String str)
    {
      int len = str.length();
      if (len > 1)
      {
        String temp = str.substring(0, len - 1);
        System.out.println(temp);
        whatsItDo(temp);
      }


    }

    public static int mystery(int n)
    {
     if (n == 0)
       return 1;
     else
       return 3 * mystery (n - 1);
    }
}
